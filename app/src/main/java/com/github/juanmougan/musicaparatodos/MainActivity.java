package com.github.juanmougan.musicaparatodos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.github.juanmougan.musicaparatodos.provider.ScalesProvider;

public class MainActivity extends AppCompatActivity {

    private ScalesProvider scalesProvider = new ScalesProvider();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView scaleTextView = (TextView)findViewById(R.id.scale_view);

        final Spinner spinner = (Spinner) findViewById(R.id.notes_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.notes_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String note = spinner.getSelectedItem().toString();
                String[] scale = MainActivity.this.scalesProvider.getScaleForNote(note);
                scaleTextView.setText(MainActivity.this.joinStrings(scale));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

    }

    private String joinStrings(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            if (sb.length() > 0) sb.append(',');
            sb.append("'").append(s).append("'");
        }
        return sb.toString();
    }

}

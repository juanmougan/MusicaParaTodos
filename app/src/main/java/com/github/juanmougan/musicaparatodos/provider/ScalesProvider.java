package com.github.juanmougan.musicaparatodos.provider;

import java.util.List;

/**
 * Created by juanma on 7/2/17.
 */
public class ScalesProvider {

    String[] scaleC = new String[]{"C", "D", "E", "F", "G", "A", "B"};
    String[] scaleD = new String[]{"D", "E", "F#", "G", "A", "B", "C#"};
    String[] scaleE = new String[]{"C", "D", "E", "F", "G", "A", "B"};
    String[] scaleF = new String[]{"C", "D", "E", "F", "G", "A", "B"};
    String[] scaleG = new String[]{"C", "D", "E", "F", "G", "A", "B"};
    String[] scaleA = new String[]{"C", "D", "E", "F", "G", "A", "B"};
    String[] scaleB = new String[]{"C", "D", "E", "F", "G", "A", "B"};

    public ScalesProvider() {
    }

    public String[] getScaleC() {
        return scaleC;
    }

    public String[] getScaleD() {
        return scaleD;
    }

    public String[] getScaleE() {
        return scaleE;
    }

    public String[] getScaleF() {
        return scaleF;
    }

    public String[] getScaleG() {
        return scaleG;
    }

    public String[] getScaleA() {
        return scaleA;
    }

    public String[] getScaleB() {
        return scaleB;
    }

    public String[] getScaleForNote(String note) {
        switch (note) {
            case "C":
                return getScaleC();
            case "D":
                return getScaleD();
            default:
                return new String[0];
        }

    }
}

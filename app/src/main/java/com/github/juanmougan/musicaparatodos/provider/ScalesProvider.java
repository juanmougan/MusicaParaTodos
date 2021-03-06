package com.github.juanmougan.musicaparatodos.provider;

import java.util.List;

/**
 * Created by juanma on 7/2/17.
 */
public class ScalesProvider {

    String[] scaleC = new String[]{"C", "D", "E", "F", "G", "A", "B"};
    String[] scaleD = new String[]{"D", "E", "F♯", "G", "A", "B", "C♯"};
    String[] scaleE = new String[]{"E", "F♯", "G♯", "A", "B", "C♯", "D♯"};
    String[] scaleF = new String[]{"F", "G", "A", "B♭", "C", "D", "E"};
    String[] scaleG = new String[]{"G", "A", "B", "C", "D", "E", "F♯"};
    String[] scaleA = new String[]{"A", "B", "C♯", "D", "E", "F♯", "G♯"};
    String[] scaleB = new String[]{"B", "C♯", "D♯", "E", "F♯", "G♯", "A♯"};

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
            case "E":
                return getScaleE();
            case "F":
                return getScaleF();
            case "G":
                return getScaleG();
            case "A":
                return getScaleA();
            case "B":
                return getScaleB();
            default:
                return new String[0];
        }

    }
}

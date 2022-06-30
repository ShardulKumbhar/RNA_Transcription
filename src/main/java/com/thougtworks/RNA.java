package com.thougtworks;

public class RNA {
    public static String transcription(String dnaStrand) {
        String rnaStrand = "";
        switch (dnaStrand) {
            case "G":
                rnaStrand = "C";
                break;
            case "C":
                rnaStrand = "G";
                break;
            case "T":
                rnaStrand = "A";
                break;
            case "A":
                rnaStrand = "U";
                break;
            default:
                rnaStrand = "";
        }

        if (dnaStrand.length() != 1) {
            for (int i = 0; i < dnaStrand.length(); i++) {
                rnaStrand += transcription(dnaStrand.charAt(i) + "");
            }
        }
        System.out.println(rnaStrand);
        return rnaStrand;
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        RNA.transcription("GCTA");
    }
}

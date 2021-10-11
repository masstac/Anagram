package com.foxminded.vladbaranchuk.task1;

import java.util.StringJoiner;

public class LogicLineReversal {

    public String generationStringExpandText(String scannedText) {
        String[] splitText = scannedText.split(" ");
        StringJoiner joiner = new StringJoiner(" ");
        for (String s : splitText) {
            String reverseEachWordArray = expandWord(s);
            joiner.add(reverseEachWordArray);
        }
        return String.valueOf(joiner);
    }

    public String expandWord(String scannedText) {
        StringBuilder expandedText = new StringBuilder(scannedText);
        int i = 0;
        int j = expandedText.length() - 1;
        while (i <= j) {
            char symbolFirst = expandedText.charAt(i);
            char symbolSecond = expandedText.charAt(j);
            if (Character.isLetter(symbolFirst)) {
                if (Character.isLetter(symbolSecond)) {
                    expandedText.setCharAt(i, symbolSecond);
                    expandedText.setCharAt(j, symbolFirst);
                    i++;
                }
                j--;
            } else {
                i++;
            }
        }
        return String.valueOf(expandedText);
    }
}

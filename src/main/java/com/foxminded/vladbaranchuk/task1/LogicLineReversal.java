package com.foxminded.vladbaranchuk.task1;

import java.util.StringJoiner;

public class LogicLineReversal {

    private boolean isNullOeEmptyOrSpaces(String enterText) {
        return enterText == null || enterText.trim().isEmpty();
    }

    public String generationStringExpandText(String enterText) {
        if (isNullOeEmptyOrSpaces(enterText)) {
            return "FAIL";
        } else {
            String[] splitText = enterText.split(" ");
            StringJoiner joiner = new StringJoiner(" ");
            for (String s : splitText) {
                String reverseEachWordArray = expandWord(s);
                joiner.add(reverseEachWordArray);
            }
            return String.valueOf(joiner);
        }
    }

    private String expandWord(String enterText) {
        StringBuilder expandedText = new StringBuilder(enterText);
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

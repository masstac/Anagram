package com.foxminded.vladbaranchuk.task1;

public class LogicLineReversal {

    public String reverse(String scannedText) {
        StringBuilder reversed = new StringBuilder(scannedText);
        int i = 0;
        int j = reversed.length() - 1;
        while(i <= j) {
            char symbolFirst = reversed.charAt(i);
            char symbolSecond = reversed.charAt(j);
            if (Character.isLetter(symbolFirst) & Character.isLetter(symbolSecond)) {
                char temp = symbolFirst;
                symbolFirst = symbolSecond;
                symbolSecond = temp;
                reversed.setCharAt(i, symbolFirst);
                reversed.setCharAt(j, symbolSecond);
                i++;
                j--;
            } else if (!Character.isLetter(symbolFirst) & !Character.isLetter(symbolSecond)) {
                i++;
                j--;
            } else if (Character.isLetter(symbolFirst) & !Character.isLetter(symbolSecond)) {
                j--;
            } else {
                i++;
            }
        }
        return String.valueOf(reversed);
    }
}
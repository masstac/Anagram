package com.foxminded.vladbaranchuk.task1;

public class Reverse {
    public static String reverse( String scannedText) {
        StringBuilder reversed = new StringBuilder(scannedText);
        int i = 0;
        int j = reversed.length() - 1;
        do  {
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
            }else if (!Character.isLetter(symbolFirst) & !Character.isLetter(symbolSecond)) {
                i++;
                j--;
            }else if (Character.isLetter(symbolFirst) & !Character.isLetter(symbolSecond)) {
                j--;
            }else if (!Character.isLetter(symbolFirst) && Character.isLetter(symbolSecond)) {
                i++;
            }
        } while (i <= j);
        return String.valueOf(reversed);
    }

    public static void consoleOutput(String[] splitText) {
        int i = 0;
        while (i < splitText.length) {
            String reverseEachWordArray = Reverse.reverse(splitText[i]);
            System.out.print(reverseEachWordArray + ' ');
            i++;
        }
    }
}
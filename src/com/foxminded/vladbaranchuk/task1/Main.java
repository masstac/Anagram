package com.foxminded.vladbaranchuk.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String scannedText = in.nextLine();
        String[] splitText = scannedText.split(" ");
        LogicLineReversal logic = new LogicLineReversal();
        logic.reverse(scannedText);
        consoleOutput(splitText);
    }
    public static void consoleOutput(String[] splitText) {
        for (String s : splitText) {
            LogicLineReversal logic = new LogicLineReversal();
            String reverseEachWordArray = logic.reverse(s);
            System.out.print(reverseEachWordArray + ' ');
        }
    }
}


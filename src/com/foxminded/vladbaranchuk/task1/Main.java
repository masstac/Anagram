package com.foxminded.vladbaranchuk.task1;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main{
    public static void main(String[] args) {
        LogicLineReversal logic = new LogicLineReversal();
        Scanner in = new Scanner(System.in);
        String scannedText = in.nextLine();
        logic.expandWord(scannedText);
        consoleOutput(logic.split(scannedText));
    }

    public static void consoleOutput(String[] splitText) {
        LogicLineReversal logic = new LogicLineReversal();
        StringJoiner joiner = new StringJoiner(" ");
        for (String s : splitText) {
            String reverseEachWordArray = logic.expandWord(s);
            joiner.add(reverseEachWordArray);
        }
        System.out.println(joiner);
    }

}

package com.foxminded.vladbaranchuk.task1;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String scannedText = in.nextLine();
        String[] splitText = scannedText.split(" ");
        Reverse.reverse(scannedText);
        Reverse.consoleOutput(splitText);
    }
}


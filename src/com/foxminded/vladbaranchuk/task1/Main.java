package com.foxminded.vladbaranchuk.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String enterText = in.nextLine();
        LogicLineReversal logic = new LogicLineReversal();
        System.out.println(logic.validation(enterText));
    }
}

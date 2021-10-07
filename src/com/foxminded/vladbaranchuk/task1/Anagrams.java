 package com.foxminded.vladbaranchuk.task1;

 import java.util.Scanner;

 public class Anagrams {

     public static void main(String[] args) {

         String word = enterText();
         String[] words = word.split(" ");


         int i = 0;
         while (i < words.length) {
             String reverseEachWordArray = Reverse(words[i]);
             System.out.print(reverseEachWordArray + ' ');

             i++;
         }

     }

     public  static String enterText(){
         Scanner in = new Scanner(System.in);
         return in.nextLine();
     }


     public static String Reverse(String word) {

         StringBuilder reversed = new StringBuilder(word);

         int i = 0, j = reversed.length() - 1;

         while (i <= j) {

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

             }

             if (!Character.isLetter(symbolFirst) & !Character.isLetter(symbolSecond)) {

                 i++;

                 j--;

             }

             if (Character.isLetter(symbolFirst) & !Character.isLetter(symbolSecond)) {


                 j--;

             }

             if (!Character.isLetter(symbolFirst) && Character.isLetter(symbolSecond)) {

                 i++;

             }

         }



         return String.valueOf(reversed);

     }
 }
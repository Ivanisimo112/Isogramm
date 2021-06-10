package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isogram("Aabbl"));
        System.out.println(isogram("aaBbll"));
        System.out.println(isogram("aaBbl1"));
        System.out.println(isogram("aaB2223bll"));
        System.out.println(isogram("a/ab.-1blalbl"));
        System.out.println("");
    }

    public static boolean isogram(String string) {
        if (string.length()==0){
            return false;
        }
        string = string.toUpperCase();
        char[] lettersToString = new char[0];
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                lettersToString = addChar(lettersToString,string.charAt(i));
            }
        }
        int[] lettersToStringNumb = new int[lettersToString.length];
        for (int i = 0; i < lettersToString.length; i++) {
            lettersToStringNumb[i] = howMuch(lettersToString, lettersToString[i]);
        }
        for (int i = 0; i < lettersToStringNumb.length; i++) {
            if (lettersToStringNumb[0] != lettersToStringNumb[i]) {
                return false;
            }
        }
        return true;
    }

    public static int howMuch(char[] letters, char letter) {
        int counter = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == letter) {
                counter++;
            }
        }

        return counter;
    }

    public static char[] addChar(char[] chars, char c) {
        char[] chars1 = new char[chars.length + 1];
        for (int i = 0; i < chars.length; i++) {
            chars1[i] = chars[i];
        }
        chars1[chars1.length - 1] = c;
        return chars1;
    }
}

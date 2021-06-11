package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(isogram("Aabbl"));
        System.out.println(isogram("aaBbll"));
        System.out.println(isogram("aaBbl1"));
        System.out.println(isogram("aaB2223bll"));
        System.out.println(isogram("a/ab.-1blalbl"));
        System.out.println(isogram(""));
        System.out.println(isogram(null));
    }

    public static boolean isogram(String string) {
        if (string == null || string.length() == 0) {
            return false;
        }
        string = string.toUpperCase();
        ArrayList<Character> lettersToString1 = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                lettersToString1.add(string.charAt(i));
            }
        }
        ArrayList<Integer> lettersToStringNumb1 = new ArrayList<>();
        for (int i = 0; i < lettersToString1.size(); i++) {
            lettersToStringNumb1.add(howMuch(lettersToString1, lettersToString1.get(i)));
        }
        for (int i = 0; i < lettersToStringNumb1.size(); i++) {
            if (lettersToStringNumb1.get(0) != lettersToStringNumb1.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static int howMuch(ArrayList<Character> arrayList, char letter) {
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == letter) {
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

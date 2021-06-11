package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

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
        HashMap<Character, Integer> hashMap = new HashMap<>();
        if (string == null || string.length() == 0) {
            return false;
        }
        string = string.toUpperCase();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                if (hashMap.containsKey(string.charAt(i))) {
                    int cou = hashMap.get(string.charAt(i));
                    hashMap.put(string.charAt(i), cou + 1);
                } else {
                    hashMap.put(string.charAt(i), 1);
                }
            }
        }
        Collection<Integer> arrayList = hashMap.values();
        int temp = 0;
        boolean b = true;
        for (int i : arrayList) {
            if (b) {
                temp = i;
                b = false;
            }
            if (i != temp)  {
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

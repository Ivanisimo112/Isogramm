package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(abc("din"));
        System.out.println(abc("recede"));
        System.out.println(abc("Success"));
        System.out.println(abc("(( @"));
        System.out.println(abc(""));
        System.out.println(abc(null));
    }

    public static String abc(String string) {
        if (string == null || string.length() == 0) {
            return "";
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String newString = "";
        string = string.toUpperCase();
        for (int i = 0; i < string.length(); i++) {
            if (hashMap.containsKey(string.charAt(i))) {
                int cou = hashMap.get(string.charAt(i));
                hashMap.put(string.charAt(i), cou + 1);
            } else {
                hashMap.put(string.charAt(i), 1);
            }
        }
        Collection<Integer> arrayList = hashMap.values();

        for (int i = 0; i < string.length(); i++) {
            if (hashMap.get(string.charAt(i)) > 1) {
                newString = newString + ")";
            } else {
                newString = newString + "(";
            }
        }
        return newString;
    }
}

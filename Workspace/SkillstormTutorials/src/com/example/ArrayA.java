package com.example;

import java.util.ArrayList;

public class ArrayA {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); //default size is 16, grows 50% in size w/ each added element
        list.add("abc");
        list.add("def");
        System.out.println(list.get(1)); //prints def
        System.out.println(list); //prints [abc, def]
        for(String i: list) {
            System.out.print(i); //prints abcdef
        }
    }
}

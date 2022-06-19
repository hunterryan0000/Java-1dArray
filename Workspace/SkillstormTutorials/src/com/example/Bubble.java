package com.example;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] unsorted= {3, 9, 1, 6, 8, 10};
        Arrays.sort(unsorted);
        for (int i: unsorted){
            System.out.print(i + " ");
        }
    }
}
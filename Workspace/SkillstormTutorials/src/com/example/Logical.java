package com.example;

public class Logical {
    public static void main(String[] args) {
        boolean holiday = false;
        boolean weekend = true;
        boolean work = true;

        if (holiday || weekend && !work){
            System.out.println("Day off");
        }
    }
}

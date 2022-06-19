package com.example;

import java.util.LinkedList;

public class ArrayB {
    public static void main(String[] args) {
        LinkedList<Pickles> list = new LinkedList<>();
        list.add(new Pickles("Dill"));
        list.add(new Pickles("Kosher"));
        String f = list.get(1).flavor; //f = "Kosher"
        list.contains(new Pickles("Dill")); //Saying Is there a Dill Pickle in this List?
    }
}

class Pickles{
    String flavor;
    public Pickles(String flavor) {
        this.flavor = flavor;
    }
}
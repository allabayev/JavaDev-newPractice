package uz;

import java.util.ArrayList;

public class NewList {
    public static void main(String[] args) {
        ArrayList <Integer> myList=new ArrayList <Integer> ();
        myList.add(38);
        myList.add(45);
        myList.add(-49);
        myList.add(-13);
        myList.add(128);
        myList.add(100);
        System.out.println(myList);
        System.out.println("---------------------------");
        ArrayList <String> myString = new ArrayList<String>();
        myString.add("MyNumbers");
        myString.add("MyLists");
        System.out.println(myList + " " + myString);
        if (myString.contains("MyLists")) {
            System.out.println("Mening ishim 5");
        }
        else System.out.println("Mening ishim 2");
        if (myList.contains(100)) {
            System.out.println("MyLists da 100 bor");
        }
    }
}
/*
* removeAll
* removeIf
* isEmpty
* ensureCapacity*
* */
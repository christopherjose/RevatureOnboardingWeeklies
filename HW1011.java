package com.youtube.spring.onboardingweeklies;

import java.util.*;

//1) Write a Java Program to iterate HashMap
// using While and advance for loop.
public class HW1011 {



    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1,"Bulbasaur");
        map.put(2, "Charmander");
        map.put(3, "Pikachu");
        map.put(4, "Squirtle");

        //FOR
        for (Map.Entry m : map.entrySet()) {
            System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
        }

         //WHILE
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry m = (Map.Entry) it.next();
            System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
        }
    }

        }



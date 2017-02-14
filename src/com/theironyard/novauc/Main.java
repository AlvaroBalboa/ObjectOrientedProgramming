package com.theironyard.novauc;

import java.util.ArrayList;
import java.util.List;


public class Main {

     public  static List<Item> itemInventory = new ArrayList<Item>();
     public static RandomCrafter craftMe = new RandomCrafter();

     public static void main(String[] args) {

       //List<Item> itemInventory = new ArrayList<Item>();
        FindItem find = new FindItem();
        find.findRandomItem();
     }
}

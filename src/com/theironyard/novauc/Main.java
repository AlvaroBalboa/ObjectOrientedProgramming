package com.theironyard.novauc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static List<Item> itemInventory = new ArrayList<Item>();
    public static RandomCrafter craftMe = new RandomCrafter();
    public static FindItem finder = new FindItem();
    public static Scanner kb = new Scanner(System.in);
    public static Scanner kb2 = new Scanner(System.in);
    public static Scanner kb3 = new Scanner(System.in);

    public static void main(String[] args) {
        finder.monsterSlayer();
        //finder.findRandomItem();



        //List<Item> itemInventory = new ArrayList<Item>();
        //FindItem find = new FindItem();
        //find.findRandomItem();
        //f//ind.whichArmor();
    }
}

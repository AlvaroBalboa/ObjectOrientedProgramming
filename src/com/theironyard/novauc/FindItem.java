package com.theironyard.novauc;


import com.theironyard.novauc.Armor.ClothArmor;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by souporman on 2/14/17.
 */
public class FindItem extends Item{

    public void monsterSlayer(){
        boolean adventure=true;
        System.out.println("Welcome traveler what is your name");
        String travelerName=Main.kb.nextLine();
        while(adventure) {
            System.out.println(travelerName+" will you please slay this Dragon for us [Y/N]");
            String response = Main.kb2.nextLine().toLowerCase();
            switch (response) {
                case "y":
                    System.out.println("You have slayed the dragon and he has dropped some loot for you to pick up");
                    findRandomItem();
                    System.out.println("You travel on and encounter another dragon");
                    break;
                case "n":
                    System.out.println("You are the worst adventurer this side of Westeros");
                    System.out.println("Your adventure ends abruptly");
                    adventure=false;
                    break;
                default:
                    System.out.println("You seem to be touched in the head the villagers of the town put you out of your misery");
                    System.exit(0);
            }
        }
        System.out.println("Your adventure has ended and these are your spoils of war");
        for(Item listitem : Main.itemInventory) {
//            System.out.printf("%d gold pieces, %d stones,%d + to damage modifier, " +
//                    "%d + to damage reduction, rarity: %s, slot filled: %s, type %s, " +
//                    "ITEM NAME : %s \n",Main.itemInventory);
            //int value, int weight, int damage, int damageReduction, String rarity, String slot, String type, String name
            //Main.something=listitem;
            System.out.println(listitem);
            if(listitem.equals(listitem)){
//                int weight=Main.something.getWeight();
//                int value=Main.something.getValue();
//                int damage=Main.something.getDamage();
//                int damageReduction=Main.something.getDamageReduction();
//                String rarity=Main.something.getRarity();
//                String slot=Main.something.getSlot();
//                String type=Main.something.getType();
//                String name=Main.something.getName();
//
//                System.out.printf("\nITEM NAME        :%s\n",name);
//                System.out.printf("ITEM TYPE        :%s\n",type);
//                System.out.printf("ITEM SLOT        :%s\n",slot);
//                System.out.printf("ITEM RARITY      :%s\n",rarity);
//                System.out.printf("ITEM VALUE       :%s GOLD\n",value);
//                System.out.printf("ITEM WEIGHT      :%s STONE\n",weight);
//                System.out.printf("ITEM DAMAGE      :%s\n",damage);
//                System.out.printf("ITEM RESISTANCE  :%s\n",damageReduction);
                listitem.print();
            }
        }
    }

    public void findRandomItem() {
        int numberOfDrops = (int) ((Math.random() * 7) + 1);
        System.out.printf("there are %d drops on this corpse\n", numberOfDrops);
        while (numberOfDrops > 0) {
            int randomNumber = (int)((Math.random()* 7)+ 1);
            switch (randomNumber) {
                case 1://Crafting Materials
                    System.out.println("The dragon has dropped a material used in crafting");
                    whichCraftMaterial();
                    numberOfDrops--;
                    break;
                case 2://Consumables
                    System.out.println("The dragon has dropped a consumable");
                    whichConsumable();
                    numberOfDrops--;
                    break;
                case 3://Armor
                    System.out.println("The dragon has dropped an armor piece");
                    whichArmor();
                    numberOfDrops--;
                    break;
                case 4://Weapon
                    System.out.println("The dragon has dropped a mighty weapon");
                    whichWeapon();
                    numberOfDrops--;
                    break;
                case 5://QuestItem
                    System.out.println("The dragon has dropped a valuable quest item");
                    whichQuestItem();
                    numberOfDrops--;
                    break;
                default://This is a catch for 5 and 6 to show that you picked up a pile of garbage
                    System.out.println("You have found some random piece of garbage");
                    numberOfDrops--;
                    break;
            }
        }
//        System.out.println("You have found " + item + " would you like to pick it up [Y/N]");
//        String answer = Game.nextLine();
//        if (answer.equalsIgnoreCase("y")) {
//            items.add(item);
//            System.out.println("You have picked up an item!!!!");
//        } else if (answer.equalsIgnoreCase("n")) {
//            System.out.println("You have thrown the item across the room ");
//        } else {
//
//        }
    }

    public void whichConsumable() {
        int questItem = (int) ((Math.random() *3) + 1);
        switch (questItem) {
            case 1://Food
                Main.itemInventory.add(Main.craftMe.randomConsumablesCrafter("Food"));
                break;
            default://Potion
                Main.itemInventory.add(Main.craftMe.randomConsumablesCrafter("Potion"));
                break;
        }    }

    public void whichArmor() {
        int armorItem = (int) ((Math.random() * 5) + 1);
        switch (armorItem) {
            case 1://Cloth armor
                Main.itemInventory.add(Main.craftMe.randomArmorCrafter("Cloth"));
                break;
            case 2://Leather armor
                Main.itemInventory.add(Main.craftMe.randomArmorCrafter("Leather"));
                break;
            case 3://Mail armor
                Main.itemInventory.add(Main.craftMe.randomArmorCrafter("Mail"));
                break;
            default://Plate armor
                Main.itemInventory.add(Main.craftMe.randomArmorCrafter("Plate"));
                break;
        }
    }

    public void whichWeapon() {
        int oneOrTwo = (int) ((Math.random() * 3) + 1);
        int weaponItem = (int) ((Math.random() * 4) + 1);
        if (oneOrTwo == 1) {
            switch (weaponItem) {
                case 1://Wand
                    Main.itemInventory.add(Main.craftMe.randomWeaponCrafter("Wand"));
                    break;
                case 2://Dagger
                    Main.itemInventory.add(Main.craftMe.randomWeaponCrafter("Dagger"));
                    break;
                default://Mace
                    Main.itemInventory.add(Main.craftMe.randomWeaponCrafter("Mace"));
                    break;
            }
        } else {
            switch (weaponItem) {
                case 1://Bow
                    Main.itemInventory.add(Main.craftMe.randomWeaponCrafter("Bow"));
                    break;
                case 2://Claymore
                    Main.itemInventory.add(Main.craftMe.randomWeaponCrafter("Claymore"));
                    break;
                default://Staff
                    Main.itemInventory.add(Main.craftMe.randomWeaponCrafter("Staff"));
                    break;
            }
        }
    }

    public void whichQuestItem() {
        int questItem = (int) ((Math.random() * 4) + 1);
        switch (questItem) {
            case 1://Heart
                Main.itemInventory.add(Main.craftMe.randomQuestItemCrafter("Heart"));
                break;
            case 2://Sacred sword
                Main.itemInventory.add(Main.craftMe.randomQuestItemCrafter("Sacred Sword"));
                break;
            default://Holy Idol
                Main.itemInventory.add(Main.craftMe.randomQuestItemCrafter("Holy Idol"));
                break;
        }
    }

    public void whichCraftMaterial(){
        int craftingItem = (int) ((Math.random() * 5) + 1);
        switch (craftingItem) {
            case 1://Gem
                Main.itemInventory.add(Main.craftMe.randomCraftingMaterialsCrafter("Gem"));
                break;
            case 2://Herb
                Main.itemInventory.add(Main.craftMe.randomCraftingMaterialsCrafter("Herb"));
                break;
            case 3://Ore
                Main.itemInventory.add(Main.craftMe.randomCraftingMaterialsCrafter("Ore"));
                break;
            default://Pelt
                Main.itemInventory.add(Main.craftMe.randomCraftingMaterialsCrafter("Pelt"));
                break;
        }
    }
}

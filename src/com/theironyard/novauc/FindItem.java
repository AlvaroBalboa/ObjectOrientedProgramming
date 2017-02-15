package com.theironyard.novauc;


import com.theironyard.novauc.Armor.ClothArmor;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by souporman on 2/14/17.
 */
public class FindItem {

    public void 
    public void findRandomItem() {
        int numberOfDrops = (int) ((Math.random() * 7) + 1);
        System.out.printf("there are %d drops on this corpse\n", numberOfDrops);
        while (numberOfDrops >= 0) {
            int randomNumber = (int)((Math.random()* 8)+ 1);
            switch (randomNumber) {
                case 1://Crafting Materials
                    whichCraftMaterial();
                    numberOfDrops--;
                    break;
                case 2://Consumables
                    whichConsumable();
                    numberOfDrops--;
                    break;
                case 3://Armor
                    whichArmor();
                    numberOfDrops--;
                    break;
                case 4://Weapon
                    whichWeapon();
                    randomNumber--;
                    break;
                case 5://QuestItem
                    whichQuestItem();
                    break;
                default://This is a catch for 5 and 6 to show that you picked up a pile of garbage
                    System.out.println("You have found some random piece of garbage");
                    randomNumber--;
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

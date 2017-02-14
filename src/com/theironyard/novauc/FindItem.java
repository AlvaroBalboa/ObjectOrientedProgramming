package com.theironyard.novauc;


import com.theironyard.novauc.Armor.ClothArmor;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by souporman on 2/14/17.
 */
public class FindItem {

    public void findRandomItem(){
        int numberOfDrops = (int)((Math.random()*7)+1);
        System.out.printf("there are %d drops on this corpse\n",numberOfDrops);
        while(numberOfDrops>=0) {
            int randomNumber = (int)((Math.random()*8)+1);
             switch(randomNumber){
                case 1://Crafting Materials
                    whichCraftingItem();
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
                     findQuestItem();
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
    public void whichCraftingItem(){
        int craftingItem = (int)((Math.random()*5)+1);
        switch(craftingItem) {
            case 1:
//                Main.itemInventory.add(new );
                break;
            case 2:
                break;
            case 3:
                break;
            default:

        }
    }
    public void whichConsumable(){
        int randomNumber = (int)((Math.random()*8)+1);
    }
    public void whichArmor(){
        int armorItem = (int)((Math.random()*5)+1);
        switch(armorItem) {
            case 1://Cloth armor
                Main.itemInventory.add(Main.craftMe.randomCrafter("Cloth"));
                break;
            case 2://Leather armor
                break;
            case 3://Mail armor
                break;
            default://Plate armor

                break;
        }
    }
    public void whichWeapon(){
        int randomNumber = (int)((Math.random()*8)+1);
    }
    public void whichTwoHand(){

    }
    public void whichOneHand(){

    }

    public void findQuestItem(){
        int randomNumber = (int)((Math.random()*8)+1);
    }
}

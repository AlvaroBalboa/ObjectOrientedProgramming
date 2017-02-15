package com.theironyard.novauc;

import com.theironyard.novauc.Armor.ClothArmor;
import com.theironyard.novauc.Armor.LeatherArmor;
import com.theironyard.novauc.Armor.MailArmor;
import com.theironyard.novauc.Armor.PlateArmor;
import com.theironyard.novauc.Consumables.Food;
import com.theironyard.novauc.Consumables.Potions;
import com.theironyard.novauc.CraftingMaterial.Gem;
import com.theironyard.novauc.CraftingMaterial.Herb;
import com.theironyard.novauc.CraftingMaterial.Ore;
import com.theironyard.novauc.CraftingMaterial.Pelt;
import com.theironyard.novauc.QuestItem.Heart;
import com.theironyard.novauc.QuestItem.HolyIdol;
import com.theironyard.novauc.QuestItem.SacredSword;
import com.theironyard.novauc.Weapon.*;

/**
 * Created by souporman on 2/14/17.
 */
public class RandomCrafter {

    //Crafts random armor
    public Item randomArmorCrafter(String typeOfArmor){
        int value=(int)((Math.random()*1001)+1);
        int weight;
        int damage=0;
        int damageReduction;
        String rarity;
        int randomRarity= (int)((Math.random()*6)+1);
            switch (randomRarity){
                case 1:
                    rarity="common";
                    break;
                case 2:
                    rarity="uncommon";
                    break;
                case 3:
                    rarity="rare";
                    break;
                case 4:
                    rarity="epic";
                    break;
                default:
                    rarity="legendary";
                    break;
            }

        String name =(prefixGenerator() + " " +typeOfArmor + " Armor of " + suffixGenerator());

        if(typeOfArmor.equalsIgnoreCase("Cloth")){

            weight=(int)((Math.random()*5)+1);
            damageReduction=(int)((Math.random()*5)+1);

            return new ClothArmor(value,weight,damage,damageReduction,rarity,"Armor","Plate armor",name);
        }
        else if(typeOfArmor.equalsIgnoreCase("Leather")){

            weight=(int)((Math.random()*6)+2);
            damageReduction=(int)((Math.random()*6)+2);
            return new LeatherArmor(value,weight,damage,damageReduction,rarity,"Armor","Plate armor",name);
        }
        else if(typeOfArmor.equalsIgnoreCase("Mail")){

            weight=(int)((Math.random()*7)+4);
            damageReduction=(int)((Math.random()*7)+4);
            return new MailArmor(value,weight,damage,damageReduction,rarity,"Armor","Plate armor",name);
        }
        else {

            weight=(int)((Math.random()*11)+5);
            damageReduction=(int)((Math.random()*11)+5);
            return new PlateArmor(value,weight,damage,damageReduction,rarity,"Armor","Plate armor",name);
        }
    }

    //crafts random weapons
    public Item randomWeaponCrafter(String typeOfWeapon){
        int value=(int)((Math.random()*1001)+1);
        int weight;
        int damage;
        int damageReduction=0;
        String rarity;
        int randomRarity= (int)((Math.random()*6)+1);
        switch (randomRarity){
            case 1:
                rarity="common";
                break;
            case 2:
                rarity="uncommon";
                break;
            case 3:
                rarity="rare";
                break;
            case 4:
                rarity="epic";
                break;
            default:
                rarity="legendary";
                break;
        }

        String name =(prefixGenerator() + " " +typeOfWeapon + " of " + suffixGenerator());

        if(typeOfWeapon.equalsIgnoreCase("Bow")){
            damage=(int)((Math.random()*14)+7);
            weight=(int)((Math.random()*2)+1);
            return new Bow(value,weight,damage,damageReduction,rarity,"Weapon","Bow",name);
        }
        else if(typeOfWeapon.equalsIgnoreCase("Claymore")){
            damage=(int)((Math.random()*16)+9);
            weight=(int)((Math.random()*3)+2);
            return new Claymore(value,weight,damage,damageReduction,rarity,"Weapon","Claymore",name);
        }
        else if(typeOfWeapon.equalsIgnoreCase("Dagger")){
            damage=(int)((Math.random()*7)+3);
            weight=(int)((Math.random()*2)+1);
            return new Dagger(value,weight,damage,damageReduction,rarity,"Weapon","Dagger",name);
        }
        else if(typeOfWeapon.equalsIgnoreCase("Mace")){
            damage=(int)((Math.random()*8)+3);
            weight=(int)((Math.random()*2)+1);
            return new Mace(value,weight,damage,damageReduction,rarity,"Weapon","Mace",name);
        }
        else if(typeOfWeapon.equalsIgnoreCase("Staff")){
            damage=(int)((Math.random()*12)+9);
            weight=(int)((Math.random()*3)+2);
            return new Staff(value,weight,damage,damageReduction,rarity,"Weapon","Staff",name);
        }
        else {
            damage=(int)((Math.random()*7)+4);
            weight=(int)((Math.random()*2)+1);
            return new Wand(value,weight,damage,damageReduction,rarity,"Weapon","Wand",name);
        }
    }

    //crafts random quest items
    public Item randomQuestItemCrafter(String typeOfQuestItem){
        int value=(int)((Math.random()*10001)+1);
        int weight;
        int damage=0;
        int damageReduction=0;
        String rarity;
        int randomRarity= (int)((Math.random()*6)+1);
        switch (randomRarity){
            case 1:
                rarity="common";
                break;
            case 2:
                rarity="uncommon";
                break;
            case 3:
                rarity="rare";
                break;
            case 4:
                rarity="epic";
                break;
            default:
                rarity="legendary";
                break;
        }

        String name =(prefixGenerator() + " " +typeOfQuestItem + " of " + suffixGenerator());

        if(typeOfQuestItem.equalsIgnoreCase("Heart")){
            weight=(int)((Math.random()*2)+1);
            return new Heart(value,weight,damage,damageReduction,rarity,"Quest Item","Quest Item",name);
        }
        else if(typeOfQuestItem.equalsIgnoreCase("Holy Idol")){
            weight=(int)((Math.random()*2)+1);
            return new HolyIdol(value,weight,damage,damageReduction,rarity,"Quest Item","Quest Item",name);
        }
        else {
            weight=(int)((Math.random()*2)+1);
            return new SacredSword(value,weight,damage,damageReduction,rarity,"Quest Item","Quest Item",name);
        }
    }


    public Item randomCraftingMaterialsCrafter(String typeOfCraftingMaterial){
        int value=(int)((Math.random()*51)+1);
        int weight;
        int damage=0;
        int damageReduction=0;
        String rarity;
        int randomRarity= (int)((Math.random()*6)+1);
        switch (randomRarity){
            case 1:
                rarity="common";
                break;
            case 2:
                rarity="uncommon";
                break;
            case 3:
                rarity="rare";
                break;
            case 4:
                rarity="epic";
                break;
            default:
                rarity="legendary";
                break;
        }

        String name =typeOfCraftingMaterial;

        if(typeOfCraftingMaterial.equalsIgnoreCase("Gem")){
            weight=(int)((Math.random()*2)+1);
            return new Gem(value,weight,damage,damageReduction,rarity,"Bag","Gem",name);
        }
        else if(typeOfCraftingMaterial.equalsIgnoreCase("Herb")){
            weight=(int)((Math.random()*1));
            return new Herb(value,weight,damage,damageReduction,rarity,"Bag","Herb",name);
        }
        else if(typeOfCraftingMaterial.equalsIgnoreCase("Ore")){
            weight=(int)((Math.random()*3)+2);
            return new Ore(value,weight,damage,damageReduction,rarity,"Bag","Ore",name);
        }
        else {
            weight=(int)((Math.random()*3)+1);
            return new Pelt(value,weight,damage,damageReduction,rarity,"Bag","Pelt",name);
        }
    }


    public Item randomConsumablesCrafter(String typeOfConsumable){
        int value=(int)((Math.random()*30)+1);
        int weight;
        int damage=0;
        int damageReduction=0;
        String rarity;
        int randomRarity= (int)((Math.random()*6)+1);
        switch (randomRarity){
            case 1:
                rarity="common";
                break;
            case 2:
                rarity="uncommon";
                break;
            case 3:
                rarity="rare";
                break;
            case 4:
                rarity="epic";
                break;
            default:
                rarity="legendary";
                break;
        }

        String name =(prefixGenerator() + " " + typeOfConsumable + " of " + suffixGenerator());

        if(typeOfConsumable.equalsIgnoreCase("Potion")){
            weight=(int)((Math.random()*2)+1);
            return new Potions(value,weight,damage,damageReduction,rarity,"Bag","Potion",name);
        }
        else {
            int typeOfFood =(int)((Math.random()*5)+1);
            weight=(int)((Math.random()*1));
            switch (typeOfFood) {
                case 1:
                    typeOfConsumable="Cake";
                    name =(prefixGenerator() + " " + typeOfConsumable + " of " + suffixGenerator());
                    return new Food(value, weight, damage, damageReduction, rarity, "Bag", "Food", name);

                case 2:
                    typeOfConsumable="Fish";
                    name =(prefixGenerator() + " " + typeOfConsumable + " of " + suffixGenerator());
                    return new Food(value, weight, damage, damageReduction, rarity, "Bag", "Food", name);

                case 3:
                    typeOfConsumable="Bread";
                    name =(prefixGenerator() + " " + typeOfConsumable + " of " + suffixGenerator());
                    return new Food(value, weight, damage, damageReduction, rarity, "Bag", "Food", name);
                default:
                    typeOfConsumable="Ale";
                    name =(prefixGenerator() + " " + typeOfConsumable + " of " + suffixGenerator());
                    return new Food(value, weight, damage, damageReduction, rarity, "Bag", "Food", name);
            }
        }
    }


    public String prefixGenerator(){
        String prefix;
        int randomName= (int)((Math.random()*7)+1);
        switch(randomName){
            case 1:
                prefix="Frozen";
                break;
            case 2:
                prefix="Arcing";
                break;
            case 3:
                prefix="Bloodthirsty";
                break;
            case 4:
                prefix="Malicious";
                break;
            case 5:
                prefix="Mercenary's";
                break;
            default:
                prefix="Scorching";
                break;
        }
        return prefix;
    }

    public String suffixGenerator(){
        String suffix;
        int randomName = (int)((Math.random()*6)+1);
        switch(randomName){
            case 1:
                suffix="the Exile";
                break;
            case 2:
                suffix="Destruction";
                break;
            case 3:
                suffix="the Fox";
                break;
            case 4:
                suffix="the Storm";
                break;
            case 5:
                suffix="the Gladiator";
                break;
            default:
                suffix="the Whale";
                break;
        }
        return suffix;
    }
}

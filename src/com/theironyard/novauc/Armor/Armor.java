package com.theironyard.novauc.Armor;

import com.theironyard.novauc.Item;

/**
 * Created by souporman on 2/14/17.
 */
public class Armor extends Item {

    public Armor() {
        this.value = value;
        this.weight = weight;
        this.damage = damage;
        this.damageReduction = damageReduction;
        this.rarity = rarity;
        this.slot = slot;
        this.type = type;
        this.name = name;
    }
    @Override
    public void print() {
        int pweight = getWeight();
        int pvalue = getValue();
        int pdamage = getDamage();
        int pdamageReduction = getDamageReduction();
        String prarity = getRarity();
        String pslot = getSlot();
        String ptype = getType();
        String pname = getName();

        System.out.printf("\nITEM NAME        :%s\n", pname);
        System.out.printf("ITEM TYPE        :%s\n", ptype);
        System.out.printf("ITEM SLOT        :%s\n", pslot);
        System.out.printf("ITEM RARITY      :%s\n", prarity);
        System.out.printf("ITEM VALUE       :%s GOLD\n", pvalue);
        System.out.printf("ITEM WEIGHT      :%s STONE\n", pweight);
        System.out.printf("ITEM DAMAGE      :%s\n", pdamage);
        System.out.printf("ITEM RESISTANCE  :%s\n", pdamageReduction);
    }

    @Override
    public int getValue() {
        return super.getValue();
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getDamageReduction() {
        return super.getDamageReduction();
    }

    @Override
    public String getRarity() {
        return super.getRarity();
    }

    @Override
    public String getSlot() {
        return super.getSlot();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setValue(int value) {
        super.setValue(value);
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public void setDamageReduction(int damageReduction) {
        super.setDamageReduction(damageReduction);
    }

    @Override
    public void setRarity(String rarity) {
        super.setRarity(rarity);
    }

    @Override
    public void setSlot(String slot) {
        super.setSlot(slot);
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
    //
//    public void showStats() {
//
//    }
}

package com.theironyard.novauc;

/**
 * Created by souporman on 2/14/17.
 */
public class Item {
    public int value,weight,damage,damageReduction;
    public String rarity,slot,type,name;

    public int getValue() {
        return this.value;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getDamageReduction() {
        return this.damageReduction;
    }

    public String getRarity() {
        return this.rarity;
    }

    public String getSlot() {
        return this.slot;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

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
    public String toString(){
        return this.name;
    }
//    public int toString(){
//        return this.value;
//    }

}

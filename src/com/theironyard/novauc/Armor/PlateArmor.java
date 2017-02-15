package com.theironyard.novauc.Armor;

/**
 * Created by souporman on 2/14/17.
 */
public class PlateArmor extends Armor {

    public PlateArmor(int value, int weight, int damage, int damageReduction, String rarity, String slot,String type, String name) {
        this.value = value;
        this.weight = weight;
        this.damage = damage;
        this.damageReduction = damageReduction;
        this.rarity = rarity;
        this.slot = slot;
        this.type = type;
        this.name = name;
    }
}

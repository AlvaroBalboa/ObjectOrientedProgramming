package com.theironyard.novauc.CraftingMaterial;

/**
 * Created by souporman on 2/14/17.
 */
public class Pelt extends CraftingMaterials {
    public Pelt(int value, int weight, int damage, int damageReduction, String rarity, String slot, String buff, String type, String name, boolean hasBuffActive) {
        this.value = value;
        this.weight = weight;
        this.damage = damage;
        this.damageReduction = damageReduction;
        this.rarity = rarity;
        this.slot = slot;
        this.buff = buff;
        this.type = type;
        this.name = name;
        this.hasBuffActive = hasBuffActive;
    }
}


package com.theironyard.novauc.Armor;

/**
 * Created by souporman on 2/14/17.
 */
public class MailArmor extends Armor {
    public MailArmor(int value, int weight, int damage, int damageReduction, String rarity, String slot, String type, String name) {
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
}

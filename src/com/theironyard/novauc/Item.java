package com.theironyard.novauc;

/**
 * Created by souporman on 2/14/17.
 */
public class Item {
    public int value,weight,damage,damageReduction;
    public String rarity,slot,type,name;

    @Override
    public String toString(){
        return this.name;
    }
//    public int toString(){
//        return this.value;
//    }

}

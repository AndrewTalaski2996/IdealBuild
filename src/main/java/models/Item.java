package models;

import java.util.Map;

public class Item {

    private String name;
    private int goldCost;
    private Map<String, Integer> stat_block;

    public Item(String name, int goldCost, Map<String, Integer> stat_block) {
        this.name = name;
        this.goldCost = goldCost;
        this.stat_block = stat_block;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoldCost() {
        return goldCost;
    }

    public void setGoldCost(int goldCost) {
        this.goldCost = goldCost;
    }

    public Map<String, Integer> getStat_block() {
        return stat_block;
    }

    public void setStat_block(Map<String, Integer> stat_block) {
        this.stat_block = stat_block;
    }
}

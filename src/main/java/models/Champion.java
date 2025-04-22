package models;

import java.util.List;

public class Champion {

    private String name;
    private List<Item> build;

    public Champion(String name, List<Item> build) {
        this.name = name;
        this.build = build;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getBuild() {
        return build;
    }

    public void setBuild(List<Item> build) {
        this.build = build;
    }
}

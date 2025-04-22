package models;

import java.util.List;

public class Winrate {

    private Champion champion;
    private List<Item> build;
    private double win_rate;

    public Winrate(Champion champion, List<Item> build, double win_rate) {
        this.champion = champion;
        this.build = build;
        this.win_rate = win_rate;
    }

    public Champion getChampion() {
        return champion;
    }

    public void setChampion(Champion champion) {
        this.champion = champion;
    }

    public List<Item> getBuild() {
        return build;
    }

    public void setBuild(List<Item> build) {
        this.build = build;
    }

    public double getWinrate() {
        return win_rate;
    }

    public void setWinrate(double win_rate) {
        this.win_rate = win_rate;
    }
}

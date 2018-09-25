package com.company.model;

import java.io.Serializable;

public class MatchAverages implements Serializable {

    private int totalMatches = 0;
    private int totalBaronKills = 0;
    private int totalDragonKills = 0;
    private int totalFirstBlood = 0;
    private int totalTowerKills = 0;
    private int totalWins;

    private float avgBaronKills;
    private float avgDragonKills;
    private float avgFirstBlood;
    private float avgTowerKills;
    private float avgTotalWins;

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }

    public int getTotalBaronKills() {
        return totalBaronKills;
    }

    public void setTotalBaronKills(int totalBaronKills) {
        this.totalBaronKills = totalBaronKills;
    }

    public int getTotalDragonKills() {
        return totalDragonKills;
    }

    public void setTotalDragonKills(int totalDragonKills) {
        this.totalDragonKills = totalDragonKills;
    }

    public int getTotalFirstBlood() {
        return totalFirstBlood;
    }

    public void setTotalFirstBlood(int totalFirstBlood) {
        this.totalFirstBlood = totalFirstBlood;
    }

    public int getTotalTowerKills() {
        return totalTowerKills;
    }

    public void setTotalTowerKills(int totalTowerKills) {
        this.totalTowerKills = totalTowerKills;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        String NL = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " {" + NL);

        result.append(" ** TOTALS ** " + NL);

        result.append(" totalMatches: " + totalMatches + NL);
        result.append(" totalBaronKills: " + totalBaronKills + NL);
        result.append(" totalDragonKills: " + totalDragonKills + NL);
        result.append(" totalFirstBlood: " + totalFirstBlood + NL);
        result.append(" totalTowerKills: " + totalTowerKills + NL);
        result.append(" totalWins: " + totalWins + NL);
        result.append(" totalFirstBlood: " + totalFirstBlood + NL);

        result.append(" ** AVERAGES ** " + NL);
        result.append(" avgBaronKills: " + avgBaronKills + NL);
        result.append(" avgDragonKills: " + avgDragonKills + NL);
        result.append(" avgFirstBlood: " + avgFirstBlood + NL);
        result.append(" avgTowerKills: " + avgTowerKills + NL);
        result.append(" avgTotalWins: " + avgTotalWins + NL);

        result.append("}");

        return result.toString();

    }

    public float getAvgBaronKills() {
        return this.avgBaronKills;
    }

    public void setAvgBaronKills(float avgBaronKills) {
        this.avgBaronKills = avgBaronKills;
    }

    public float getAvgDragonKills() {
        return this.avgDragonKills;
    }

    public void setAvgDragonKills(float avgDragonKills) {
        this.avgDragonKills = avgDragonKills;
    }

    public float getAvgFirstBlood() {
        return this.avgFirstBlood;
    }

    public void setAvgFirstBlood(float avgFirstBlood) {
        this.avgFirstBlood = avgFirstBlood;
    }

    public float getAvgTowerKills() {
        return this.avgTowerKills;
    }

    public void setAvgTowerKills(float avgTowerKills) {
        this.avgTowerKills = avgTowerKills;
    }

    public float getAvgTotalWins() {
        return this.avgTotalWins;
    }

    public void setAvgTotalWins(float avgTotalWins) {
        this.avgTotalWins = avgTotalWins;
    }

    public MatchAverages() {
    }

    public MatchAverages(int totalMatches, int totalBaronKills,
                         int totalDragonKills, int totalFirstBlood, int totalTowerKills,
                         int totalWins, float avgBaronKills, float avgDragonKills,
                         float avgFirstBlood, float avgTowerKills, float avgTotalWins) {
        this.totalMatches = totalMatches;
        this.totalBaronKills = totalBaronKills;
        this.totalDragonKills = totalDragonKills;
        this.totalFirstBlood = totalFirstBlood;
        this.totalTowerKills = totalTowerKills;
        this.totalWins = totalWins;
        this.avgBaronKills = avgBaronKills;
        this.avgDragonKills = avgDragonKills;
        this.avgFirstBlood = avgFirstBlood;
        this.avgTowerKills = avgTowerKills;
        this.avgTotalWins = avgTotalWins;
    }
}

package com.company.service.input;

public class SummonerInput {
    private String summonerName;
    private String summonerPlatform;
    private String numOfGames;

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public String getSummonerPlatform() {
        return summonerPlatform;
    }

    public void setSummonerPlatform(String summonerPlatform) {
        this.summonerPlatform = summonerPlatform;
    }

    public String getNumOfGames() {
        return numOfGames;
    }

    public void setNumOfGames(String numOfGames) {
        this.numOfGames = numOfGames;
    }
}

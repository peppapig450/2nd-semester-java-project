package com.boardgame;

public class BoardGame {
    private int minPlayers;
    private int maxPlayers;
    private int bestPlayers;
    private int difficulty; // difficulty measured from 1 to 3 (1 being easy, 3 being hard)

    private double avgPlayTime;

    private String gameType;
    private String primGameMechanic;

    private boolean gateway;

    /**
     * BoardGame() -
     * Constructor for the BoardGame object
     * Default values for board game attributes
     */
    public BoardGame() {
        minPlayers = 0;
        maxPlayers = 1;
        bestPlayers = 0;
        difficulty = 1;
        avgPlayTime = 0.0;
        gameType = "";
        primGameMechanic = "";
        gateway = false;
    }

    /**
     * BoardGame class constructor
     *
     * @param int     minPlayers for the minimum number of players
     * @param int     maxPlayers for the maximum number of players
     * @param int     bestPlayers for the ideal number of players
     * @param int     difficulty for the level of the game's difficulty
     * @param double  avgPlayTime for the average play time of the game
     * @param String  gameType for the type of board game
     * @param String  primGameMechanic for the primary game mechanic
     * @param boolean gateway for if the game is a gateway game or not
     */
    public BoardGame(int min, int max, int best, int diff, double avgPlay, String type, String mechanic, boolean gate) {
        min = this.minPlayers;
        max = this.maxPlayers;
        best = this.bestPlayers;
        diff = this.difficulty;
        avgPlay = this.avgPlayTime;
        type = this.gameType;
        mechanic = this.primGameMechanic;
        gate = this.gateway;
    }

    // Method to get the minPlayers value
    public int getMinPlayers() {
        return this.minPlayers;
    }

    // Method to get the maxPlayers value
    public int getMaxPlayers() {
        return this.maxPlayers;
    }

    // Method to get the bestPlayers value
    public int getBestPlayers() {
        return this.bestPlayers;
    }

    // Method to get the difficulty value
    public int getDifficulty() {
        return this.difficulty;
    }

    // Method to get the avgPlayTime value
    public double avgPlayTime() {
        return this.avgPlayTime;
    }

    // Method to get the gameType value
    public String getGameType() {
        return this.gameType;
    }

    // Method to get the primary game mecahnic value
    public String getPrimaryGameMechanic() {
        return this.primGameMechanic;
    }

    // Method to get the value of the gateway
    public boolean getGateway() {
        return gateway;
    }

    // Method to set the minPlayers value
    public void setMinPlayers(int min) {
        this.minPlayers = min;
    }

    // Method to set the maxPlayers value
    public void setMaxPlayers(int max) {
        this.maxPlayers = max;
    }

    // Method to set the bestPlayers value
    public void setBestPlayers(int best) {
        this.bestPlayers = best;
    }

    // Method to set the difficulty value
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    // Method to set the avgPlay time
    public void setAvgPlayTime(double avg) {
        this.avgPlayTime = avg;
    }

    // Method to set the gameType value
    public void setGameType(String type) {
        this.gameType = type;
    }

    // Method to set the primary game mechanic
    public void setPrimaryGameMechanic(String primary) {
        this.primGameMechanic = primary;
    }

    // Method to set the gateway value
    public void setGateway(boolean gate) {
        this.gateway = gate;
    }
}
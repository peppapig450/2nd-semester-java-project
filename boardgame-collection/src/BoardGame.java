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
}

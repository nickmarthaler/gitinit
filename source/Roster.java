/*
This object can hold a roster of players.

 */

public class Roster {

    // The array that will hold the roster.
    private String roster [];

    // The size of the roster.
    private int size;

    // The number of players on the roster.
    private int activePlayers;


    // Constructor that takes in the size of the roster.
    public Roster(int size) {
        this.size = size;
        this.roster = new String[size];
        this.activePlayers = 0;
    }

    // Consturctor for a default 10 player roster.
    public Roster() {
        this(10);
    }

    // Check to see if we can hold more players.
    public boolean hasOpenSlots() {
        return (this.activePlayers < this.size);
    }


    // Add a player to the roster.
    public void addPlayer(String player) {
        if (this.activePlayers < this.roster.length) {
            this.roster[this.activePlayers] = player;
            this.activePlayers++;
        }
    }

    // Print the roster.
    public String toString() {
        String result = new String();
        for (int i = 0; i < this.roster.length; i++) {
            result = result + this.roster[i] + " || ";
        }
        return result;


    }





}

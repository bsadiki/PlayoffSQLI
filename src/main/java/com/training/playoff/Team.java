package com.training.playoff;

public class Team implements Comparable<Team>{
    private String name;
    private int points;

    public Team(String name) {
        this.name = name;
        this.points = 0;
    }

    public void winGame() {
        this.points++;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Team adversary) {
        return Integer.compare(adversary.points, this.points);
    }
}

package com.training.playoff;


import java.util.*;

public class Playoff {
    private List<Team> teams;

    public Playoff(String[] qualificationsResults) {
        this.teams = TeamsFactory.createTeams(qualificationsResults);
    }

    public String[] layout() {
        return new String[]{gamePresentationFromTeams(teams.get(0), teams.get(3)),
                gamePresentationFromTeams(teams.get(1), teams.get(2))};
    }

    private String gamePresentationFromTeams(Team team1, Team team2) {
        return team1.getName() +
                " vs " +
                team2.getName();
    }
}

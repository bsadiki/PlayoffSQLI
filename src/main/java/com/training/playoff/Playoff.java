package com.training.playoff;


import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Playoff {
    HashMap<String, Team> teams;

    public Playoff(String[] qualificationsResults) {
        this.teams = TeamsFactory.createTeams(qualificationsResults);
    }

    public String[] layout() {
        SortedSet<Team> teams = new TreeSet<>( this.teams.values());
        String[] layout = {gamePresentationFromTeams(teamFromPosition(teams,1) , teamFromPosition(teams,4)),
                gamePresentationFromTeams(teamFromPosition(teams,2) , teamFromPosition(teams,3)) };
        return layout;
    }

    private Team teamFromPosition(SortedSet<Team> sortedTeams, int position) {
        Iterator<Team> teamIterator = sortedTeams.iterator();
        int i = 1;
        Team team = null;
        while (i <= position && teamIterator.hasNext()) {
            team = teamIterator.next();
            i++;
        }
        return team;
    }
    private String gamePresentationFromTeams(Team team1, Team team2){
        StringBuilder gameBuilder = new StringBuilder();
        gameBuilder.append(team1.getName());
        gameBuilder.append(" vs ");
        gameBuilder.append(team2.getName());
        return gameBuilder.toString();
    }
}

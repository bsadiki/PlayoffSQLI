package com.training.playoff;

import java.util.HashMap;

public class TeamsFactory {
    static HashMap<String, Team> createTeams(String[] qualificationsResults) {
        HashMap<String, Team> teams = new HashMap<>();
        for (String qualificationsResult : qualificationsResults) {
            String[] twoTeams = qualificationsResult.split(" ");
            Team firstTeam = teamFromMap(teams, twoTeams[0]);
            firstTeam.winGame();
            teamFromMap(teams, twoTeams[1]);
        }
        return teams;
    }

    private static Team teamFromMap(HashMap<String, Team> teams, String teamSymbol) {
        if (teams.containsKey(teamSymbol))
            return teams.get(teamSymbol);
        else {
            Team team = new Team(teamSymbol);
            teams.put(teamSymbol, team);
            return team;
        }
    }
}

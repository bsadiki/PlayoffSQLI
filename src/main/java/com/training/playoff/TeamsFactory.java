package com.training.playoff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class TeamsFactory {
    static List<Team> createTeams(String[] qualificationsResults) {
        HashMap<String, Team> teams = new HashMap<>();
        for (String qualificationsResult : qualificationsResults) {
            String[] twoTeams = qualificationsResult.split(" ");
            Team firstTeam = teamFromMap(teams, twoTeams[0]);
            firstTeam.winGame();
            teamFromMap(teams, twoTeams[1]);
        }
        List<Team> teamList = new ArrayList<>( teams.values());
        Collections.sort(teamList);
        return teamList;
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

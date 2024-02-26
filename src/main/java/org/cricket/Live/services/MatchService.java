package org.cricket.Live.services;

import org.cricket.Live.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    //get all matches
    List<Match> getAllMatches();
    //get live match
    List<Match> getLiveMatches();
    //get cwc2023 poin table
    List<List<String>> getPointTable();

}

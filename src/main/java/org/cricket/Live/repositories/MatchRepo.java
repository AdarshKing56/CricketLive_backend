package org.cricket.Live.repositories;

import org.cricket.Live.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    //fatching match by time heading
    Optional<Match> findByTeamHeading(String teamHeading);
}

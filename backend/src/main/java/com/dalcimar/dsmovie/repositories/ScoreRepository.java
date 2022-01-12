package com.dalcimar.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dalcimar.dsmovie.entities.Score;
import com.dalcimar.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}

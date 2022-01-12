package com.dalcimar.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dalcimar.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

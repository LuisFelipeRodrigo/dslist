package com.cursodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursodev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

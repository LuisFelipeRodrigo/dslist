package com.cursodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursodev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

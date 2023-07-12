package com.daywid.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daywid.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}

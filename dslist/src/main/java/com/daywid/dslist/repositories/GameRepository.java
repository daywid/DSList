package com.daywid.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daywid.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}

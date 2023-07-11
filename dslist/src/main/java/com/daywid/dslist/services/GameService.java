package com.daywid.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daywid.dslist.dto.GameMinDTO;
import com.daywid.dslist.entities.Game;
import com.daywid.dslist.repositories.GameRepository;

@Service

public class GameService {
    
    @Autowired
    private GameRepository gameRepository;
    
    public List<GameMinDTO> find_all(){
        List <Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}

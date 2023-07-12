package com.daywid.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daywid.dslist.dto.GameListDTO;
import com.daywid.dslist.entities.GameList;
import com.daywid.dslist.repositories.GameListRepository;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
        public List<GameListDTO> find_all(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
        
    }

}

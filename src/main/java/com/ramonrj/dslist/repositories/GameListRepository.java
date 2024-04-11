package com.ramonrj.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramonrj.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{	

}

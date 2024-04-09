package com.ramonrj.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramonrj.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{	

}

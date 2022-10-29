package com.digiunion.overwatch.player.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digiunion.overwatch.player.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}

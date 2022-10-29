package com.digiunion.overwatch.player.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.digiunion.overwatch.player.entity.Player;

@Service
public interface PlayerRepository extends JpaRepository<Player, Long> {

}

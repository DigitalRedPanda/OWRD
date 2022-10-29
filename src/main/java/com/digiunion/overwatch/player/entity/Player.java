package com.digiunion.overwatch.player.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.digiunion.overwatch.rank.Rank;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Data
public class Player {

 @Id
 @Column(name = "id", columnDefinition = "LONG")
 private long id;

 @Column(name = "rank", columnDefinition = "TEXT CHECK(rank IN ('UNRANKED','BRONZE', 'SILVER','GOLD','PLATINUM', 'DIMOND', 'MASTER', 'GRAND_MASTER','TOP_500')) DEFAULT UNRANKED")
 private Rank rank;

 @Column(name = "stage", columnDefinition = "INTEGER CHECK(stage > 0 AND stage <= 5 AND rank != TOP_500)")
 private final int stage;

}

package com.digiunion.overwatch.rank.overwatch.rank.player;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.digiunion.overwatch.rank.overwatch.rank.Rank;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Data
public class Player {

 @Id
 @Column(name = "id", columnDefinition = "LONG")
 private long id;

 @Column(name = "rank", columnDefinition = "TEXT CHECK(rank IN ('BRONZE', 'SILVER','GOLD','PLATINUM', 'DIMOND', 'MASTER', 'GRANDMASTER','TOP500')) DEFAULT NULL")
 private Rank rank;

 @Column(name = "stage", columnDefinition = "INTEGER CHECK(stage > 0 AND stage <= 5)")
 private final int stage;

}

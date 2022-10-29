package com.digiunion.overwatch.rank.overwatch.rank;

import java.util.Optional;
import java.util.function.Predicate;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public enum Rank {

 BRONZE, SILVER, GOLD, PLATINUM, DIMOND, MASTER, GRANDMASTER, TOP500;

 Optional<Integer> rankStage;

 void setRankStage(int rankStage) {

  this.rankStage = Optional.of(rankStage).filter(isWithinRange);

 }

 Predicate<Integer> isWithinRange = (stage) -> {

  return 5 >= stage && stage > 0;

 };

 Rank(int rankStage) {

  this.rankStage = Optional.of(rankStage).filter(isWithinRange);

 }

}

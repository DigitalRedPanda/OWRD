package com.digiunion.overwatch.rank;

import java.util.Optional;
import java.util.function.Predicate;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public enum Rank {

 BRONZE, SILVER, GOLD, PLATINUM, DIMOND, MASTER, GRAND_MASTER, TOP_500;

 Optional<Integer> rankStage;

 void setRankStage(int rankStage) {

  this.rankStage = Optional.of(rankStage).filter(isValid);

 }

 Predicate<Integer> isValid = (stage) -> {

  return 5 >= stage && stage > 0 && this != TOP_500;

 };

 Rank(int rankStage) {

  this.rankStage = Optional.of(rankStage).filter(isValid);

 }

}

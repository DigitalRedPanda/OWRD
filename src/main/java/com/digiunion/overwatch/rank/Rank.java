package com.digiunion.overwatch.rank;

import java.util.Optional;
import java.util.function.Predicate;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public enum Rank {

 UNRANKED, BRONZE, SILVER, GOLD, PLATINUM, DIMOND, MASTER, GRAND_MASTER, TOP_500;

 Integer rankStage;

 void setRankStage(int rankStage) {

  this.rankStage = Optional.of(rankStage).filter(isValid)
    .orElseThrow(() -> new NumberFormatException("A rank stage cannot be out of 1 to 5"));

 }

 Predicate<Integer> isValid = (stage) -> {

  return (5 >= stage && stage > 0) && (this != TOP_500 && this != UNRANKED);

 };

 Rank(int rankStage) {

  this.rankStage = Optional.of(rankStage).filter(isValid)
    .orElseThrow(() -> new NumberFormatException("A rank stage cannot be out of 1 to 5"));

 }

}

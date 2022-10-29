package com.digiunion.overwatch.rank.overwatch.rank;

import java.net.http.HttpHeaders;

public sealed interface RankImpl permits RankController {

 String url = "https://best-overwatch-api.herokuapp.com/player/pc/us/GamersCCCP-1569";

 String getRank();

 boolean isPlayingCompetitive();

}

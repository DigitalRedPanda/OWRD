package com.digiunion.overwatch.rank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import com.digiunion.overwatch.player.repository.PlayerRepository;

@Controller
public final class RankController implements RankImpl {

  public RankController() {
    headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
  }

  @Autowired
  private RestTemplate template;

  @Autowired
  private PlayerRepository playerRepository;

  private HttpHeaders headers;

  @Override
  public String getRank() {
    // TODO Returns the current rank of the player
    return template.exchange(url, HttpMethod.GET,
        null, String.class).getBody();
  }

  @Override
  public boolean isPlayingCompetitive() {
    // TODO Returns the state of what the player is playing whether if it was comp
    // or not
    return false;
  }

}

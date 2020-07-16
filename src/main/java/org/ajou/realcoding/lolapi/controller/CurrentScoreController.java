package org.ajou.realcoding.lolapi.controller;

import org.ajou.realcoding.lolapi.service.CurrentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentScoreController {

    @Autowired
    private CurrentScoreService currentScoreService;

    @GetMapping("")
    public UserInfo getUserID(@RequestParam String summonerName) {
        return currentScoreService.getUserID(summonerName);
    }

}

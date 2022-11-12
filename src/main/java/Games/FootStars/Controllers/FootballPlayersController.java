package Games.FootStars.Controllers;

import Games.FootStars.Entities.FootballPlayers;
import Games.FootStars.Services.FootballPlayersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
@CrossOrigin
public class FootballPlayersController {

    @Autowired
    FootballPlayersService footballPlayersService;


    @RequestMapping("playername")
    public String getPlayerName(){
        return footballPlayersService.getPlayerName();
    }

}

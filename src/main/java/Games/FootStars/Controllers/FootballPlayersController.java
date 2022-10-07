package Games.FootStars.Controllers;

import Games.FootStars.Entities.FootballPlayers;
import Games.FootStars.Services.FootballPlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class FootballPlayersController {

    @Autowired
    FootballPlayersService footballPlayersService;

    public void getAllPlayers(){
        List<FootballPlayers> allPlayers = footballPlayersService.getAllPlayer();
        System.out.println(allPlayers);
    }

}

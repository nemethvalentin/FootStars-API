package Games.FootStars.Services;

import Games.FootStars.Entities.FootballPlayers;
import Games.FootStars.Repositories.FootballPlayersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballPlayersService {

    @Autowired
    FootballPlayersDAO footballPlayersDAO;


    public String getPlayerName(){
        return footballPlayersDAO.getPlayerName();
    }

}

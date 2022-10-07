package Games.FootStars.Repositories;

import Games.FootStars.Entities.FootballPlayers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FootballPlayersDAO extends CrudRepository<FootballPlayers, Integer> {

    List<FootballPlayers> findAll();

}

package Games.FootStars.Repositories;

import Games.FootStars.Entities.FootballPlayers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FootballPlayersDAO extends JpaRepository<FootballPlayers, Integer> {

    @Query("select preferredFoot from FootballPlayers f where f.id = 1")
   String getPlayerName();

}

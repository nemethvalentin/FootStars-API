package Games.FootStars.Entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serial;

@Data
@Entity
public class FootballPlayers {

    @Id
    @Serial
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "height")
    private String height;

    @Column(name = "weight")
    private String weight;

    @Column(name = "preferred_foot")
    private String preferredFoot;

    @Column(name = "position")
    private String position;

    @Column(name = "acceleration")
    private String acceleration;

    @Column(name = "sprint_speed")
    private String sprintSpeed;

    @Column(name = "short_passing")
    private String shortPassing;

    @Column(name = "long_passing")
    private String longPassing;

    @Column(name = "shot_accuracy")
    private String shotAccuracy;

    @Column(name = "shooting_power")
    private String shootingPower;

    @Column(name = "balance")
    private String balance;

    @Column(name = "technic")
    private String technic;

    @Column(name = "standing_tackles")
    private String standingTackles;

    @Column(name = "sliding_tackles")
    private String slidingTackles;

    @Column(name = "stamina")
    private String stamina;

    @Column(name = "strength")
    private String strength;

    @Column(name = "price")
    private String price;


}

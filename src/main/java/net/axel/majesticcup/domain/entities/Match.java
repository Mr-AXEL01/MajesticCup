package net.axel.majesticcup.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "matches")
public class Match {
    @Id
    private String id;

    private Integer round;

    private String team1;

    private String team2;

    private Result result;

    private String winner;
}

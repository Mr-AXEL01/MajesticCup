package net.axel.majesticcup.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "competitions")
public class Competition {

    @Id
    private String id;

    private String name;

    private Integer numberOfTeams;

    private String teamId;

    private Integer currentRound;

    private ArrayList<String> rounds;
}

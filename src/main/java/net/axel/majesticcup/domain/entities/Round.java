package net.axel.majesticcup.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "rounds")
public class Round {

    @Id
    private String id;

    private Integer roundNumber;

    private String competitionId;

    private List<Match> matches;
}

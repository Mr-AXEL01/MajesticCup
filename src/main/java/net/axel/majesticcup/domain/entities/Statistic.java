package net.axel.majesticcup.domain.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "statistics")
public class Statistic {

    private String playerId;

    private Integer goals;

    private Integer assists;

    private Integer yellowCards;

    private Integer redCards;
}

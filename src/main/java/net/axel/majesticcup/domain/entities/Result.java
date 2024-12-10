package net.axel.majesticcup.domain.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "results")
public class Result {

    private Integer team1Goals;

    private Integer team2Goals;

    private List<Statistic> statistics;
}

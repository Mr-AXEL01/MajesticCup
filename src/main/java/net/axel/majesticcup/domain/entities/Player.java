package net.axel.majesticcup.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "players")
public class Player {
    @Id
    private String id;
    private String name;
    private String surname;
    private String position;
    private Integer number;
}

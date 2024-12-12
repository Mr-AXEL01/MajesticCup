package net.axel.majesticcup.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "teams")

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Team {

    @Id
    private ObjectId id;

    private String name;

    private String city;

    private List<Player> players = new ArrayList<>();
}

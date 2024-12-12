package net.axel.majesticcup.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "matches")

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Match {
    @Id
    private ObjectId id;

    private Integer round;

    private ObjectId team1;

    private ObjectId team2;

    private Result result;

    private ObjectId winner;
}

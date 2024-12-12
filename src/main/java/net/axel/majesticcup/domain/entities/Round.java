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

@Document(collection = "rounds")

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Round {

    @Id
    private ObjectId id;

    private Integer roundNumber;

    private ObjectId competitionId;

    private List<Match> matches = new ArrayList<>();
}

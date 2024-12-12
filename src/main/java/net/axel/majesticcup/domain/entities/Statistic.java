package net.axel.majesticcup.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Statistic {

    private ObjectId playerId;

    private Integer goals;

    private Integer assists;

    private Integer yellowCards;

    private Integer redCards;
}

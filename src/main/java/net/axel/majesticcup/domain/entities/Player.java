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
public class Player {

    private ObjectId id;

    private String name;

    private String surname;

    private String position;

    private Integer number;
}

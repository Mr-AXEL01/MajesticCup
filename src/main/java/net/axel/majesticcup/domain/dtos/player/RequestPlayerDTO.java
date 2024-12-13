package net.axel.majesticcup.domain.dtos.player;

import jakarta.validation.constraints.NotNull;
import org.bson.types.ObjectId;

public record RequestPlayerDTO(

        ObjectId id,

        @NotNull String name,

        @NotNull String surname,

        @NotNull String position,

        @NotNull Integer number
) {
}

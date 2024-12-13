package net.axel.majesticcup.domain.dtos.player;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.bson.types.ObjectId;

public record ResponsePlayerDTO(

        @NotNull ObjectId id,

        @NotBlank String name,

        @NotBlank String surname,

        @NotBlank String position,

        @NotNull Integer number
) {
}

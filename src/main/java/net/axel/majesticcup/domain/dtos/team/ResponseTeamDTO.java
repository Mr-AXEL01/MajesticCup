package net.axel.majesticcup.domain.dtos.team;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import net.axel.majesticcup.domain.dtos.player.ResponsePlayerDTO;
import net.axel.majesticcup.domain.entities.Player;
import org.bson.types.ObjectId;

import java.util.List;

public record ResponseTeamDTO(

        @NotNull ObjectId id,

        @NotBlank String name,

        @NotBlank String city,

        @NotNull List<ResponsePlayerDTO> players
) {
}

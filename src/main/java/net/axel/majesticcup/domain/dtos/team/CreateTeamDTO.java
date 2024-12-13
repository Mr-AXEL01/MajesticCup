package net.axel.majesticcup.domain.dtos.team;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import net.axel.majesticcup.domain.dtos.player.RequestPlayerDTO;

import java.util.List;

public record CreateTeamDTO(

        @NotBlank String name,

        @NotBlank String city,

        @NotNull List<RequestPlayerDTO> players
) {
}

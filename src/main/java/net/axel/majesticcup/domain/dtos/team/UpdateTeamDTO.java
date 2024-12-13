package net.axel.majesticcup.domain.dtos.team;

import net.axel.majesticcup.domain.entities.Player;

import java.util.List;

public record UpdateTeamDTO(

        String name,

        String city,

        List<Player> players
) {
}

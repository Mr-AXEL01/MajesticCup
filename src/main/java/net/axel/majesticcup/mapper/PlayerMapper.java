package net.axel.majesticcup.mapper;

import net.axel.majesticcup.domain.dtos.player.RequestPlayerDTO;
import net.axel.majesticcup.domain.dtos.player.ResponsePlayerDTO;
import net.axel.majesticcup.domain.entities.Player;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerMapper extends BaseMapper<Player, RequestPlayerDTO, ResponsePlayerDTO> {
}

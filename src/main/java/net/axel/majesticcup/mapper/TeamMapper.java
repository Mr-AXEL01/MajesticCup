package net.axel.majesticcup.mapper;

import net.axel.majesticcup.domain.dtos.team.CreateTeamDTO;
import net.axel.majesticcup.domain.dtos.team.ResponseTeamDTO;
import net.axel.majesticcup.domain.entities.Team;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeamMapper extends BaseMapper<Team, CreateTeamDTO, ResponseTeamDTO>{
}

package net.axel.majesticcup.service;

import net.axel.majesticcup.domain.dtos.team.CreateTeamDTO;
import net.axel.majesticcup.domain.dtos.team.ResponseTeamDTO;

public interface TeamService {

    ResponseTeamDTO create(CreateTeamDTO dto);
}

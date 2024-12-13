package net.axel.majesticcup.service.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.axel.majesticcup.domain.dtos.player.RequestPlayerDTO;
import net.axel.majesticcup.domain.dtos.team.CreateTeamDTO;
import net.axel.majesticcup.domain.dtos.team.ResponseTeamDTO;
import net.axel.majesticcup.domain.entities.Player;
import net.axel.majesticcup.domain.entities.Team;
import net.axel.majesticcup.mapper.PlayerMapper;
import net.axel.majesticcup.mapper.TeamMapper;
import net.axel.majesticcup.repository.TeamRepository;
import net.axel.majesticcup.service.TeamService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class TeamServiceImpl implements TeamService {

    private final TeamRepository repository;
    private final TeamMapper mapper;
    private final PlayerMapper playerMapper;

    public TeamServiceImpl(TeamRepository repository, TeamMapper mapper, PlayerMapper playerMapper) {
        this.repository = repository;
        this.mapper = mapper;
        this.playerMapper = playerMapper;
    }

    @Override
    public ResponseTeamDTO create(CreateTeamDTO dto) {
        System.out.println("---------"+dto+"---------------------");
        List<Player> players = dto.players()
                .stream()
                .map(playerMapper::toEntity)
                .peek(player -> player.setId(new ObjectId()))
                .toList();

        System.out.println("---------"+players+"-----------------------");

        Team team = mapper.toEntity(dto)
                .setPlayers(players);
        System.out.println("---------"+team+"-----------------------");

        Team savedTeam = repository.save(team);
        return mapper.toResponseDto(savedTeam);
    }
}

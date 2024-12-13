package net.axel.majesticcup.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.axel.majesticcup.domain.dtos.team.CreateTeamDTO;
import net.axel.majesticcup.domain.dtos.team.ResponseTeamDTO;
import net.axel.majesticcup.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TeamController.CONTROLLER_PATH)

public class TeamController {

    public final static String CONTROLLER_PATH = "/api/v1/admin/teams";

    private final TeamService service;

    public TeamController(TeamService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<ResponseTeamDTO> create(@RequestBody @Valid CreateTeamDTO dto) {
        ResponseTeamDTO team = service.create(dto);
        return new ResponseEntity<>(team, HttpStatus.CREATED);
    }

}

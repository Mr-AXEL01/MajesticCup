package net.axel.majesticcup.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Result {

    private Integer team1Goals;

    private Integer team2Goals;

    private List<Statistic> statistics = new ArrayList<>();
}

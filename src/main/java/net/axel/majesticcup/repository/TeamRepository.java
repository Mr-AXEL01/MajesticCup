package net.axel.majesticcup.repository;

import net.axel.majesticcup.domain.entities.Team;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, ObjectId> {
}

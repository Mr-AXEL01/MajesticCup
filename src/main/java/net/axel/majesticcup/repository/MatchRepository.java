package net.axel.majesticcup.repository;

import net.axel.majesticcup.domain.entities.Match;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository extends MongoRepository<Match, ObjectId> {
}

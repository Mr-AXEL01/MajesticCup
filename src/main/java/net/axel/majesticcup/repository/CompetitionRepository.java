package net.axel.majesticcup.repository;

import net.axel.majesticcup.domain.entities.Competition;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompetitionRepository extends MongoRepository<Competition, ObjectId> {
}

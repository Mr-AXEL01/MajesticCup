package net.axel.majesticcup.repository;

import net.axel.majesticcup.domain.entities.Round;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoundRepository extends MongoRepository<Round, ObjectId> {
}

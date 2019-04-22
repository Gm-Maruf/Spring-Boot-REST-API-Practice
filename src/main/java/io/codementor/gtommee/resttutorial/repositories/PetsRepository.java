package io.codementor.gtommee.resttutorial.repositories;

import io.codementor.gtommee.resttutorial.models.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetsRepository extends MongoRepository<Pets, String> {
  Pets findBy_id(ObjectId _id);
}

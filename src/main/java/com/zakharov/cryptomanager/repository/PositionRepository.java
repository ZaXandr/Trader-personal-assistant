package com.zakharov.cryptomanager.repository;

import com.zakharov.cryptomanager.entities.Position;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PositionRepository extends MongoRepository<Position,String> {
}

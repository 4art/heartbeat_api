package com.firulia.gbmulti.repo;

import com.firulia.gbmulti.model.Heartbeat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeartbeatRepository extends MongoRepository<Heartbeat, String> {
}

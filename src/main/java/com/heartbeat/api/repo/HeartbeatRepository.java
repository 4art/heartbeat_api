package com.heartbeat.api.repo;

import com.heartbeat.api.model.Heartbeat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeartbeatRepository extends MongoRepository<Heartbeat, String> {
}

package com.heartbeat.api.service;
import com.heartbeat.api.model.Heartbeat;
import com.heartbeat.api.repo.HeartbeatRepository;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Log4j
@Service
public class HeartbeatService {

    private final HeartbeatRepository heartbeatRepository;
    private final MongoTemplate mongoTemplate;

    @Autowired
    public HeartbeatService(HeartbeatRepository heartbeatRepository, MongoTemplate mongoTemplate) {
        this.heartbeatRepository = heartbeatRepository;
        this.mongoTemplate = mongoTemplate;
    }

    private boolean isMongoDBConnected() {
        try {
            String name = mongoTemplate.getDb().getName();// Attempt to get the database name
            log.info("MongoDB is connected. Default DB is " + name);
            return true; // Connection successful
        } catch (Exception e) {
            log.error("Error connecting to MongoDB");
            return false; // Connection failed
        }
    }

   public Heartbeat getHeartbeat() {
       return Heartbeat.builder().dbActive(isMongoDBConnected()).build();
   }
}

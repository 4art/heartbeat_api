
package com.heartbeat.api.controller;

import com.heartbeat.api.model.Heartbeat;
import com.heartbeat.api.service.HeartbeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*") // Allow all origins
public class HeartbeatController {

    @Autowired
    private HeartbeatService heartbeatService;

    @GetMapping("/heartbeat")
    public Heartbeat heartBeatConnection() {
        return heartbeatService.getHeartbeat();
    }
}

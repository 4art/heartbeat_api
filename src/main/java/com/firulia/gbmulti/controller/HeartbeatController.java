
package com.firulia.gbmulti.controller;

import com.firulia.gbmulti.model.Heartbeat;
import com.firulia.gbmulti.service.HeartbeatService;
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

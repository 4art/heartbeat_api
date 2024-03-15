// src/main/java/com/example/demo/TestController.java

package com.firulia.gbmulti.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*") // Allow all origins
public class HeartbeatController {

    @GetMapping("/test")
    public String testConnection() {
        return "{\"status\":\"good\"}";
    }
}

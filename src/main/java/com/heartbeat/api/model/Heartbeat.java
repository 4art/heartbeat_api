package com.heartbeat.api.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class Heartbeat {
    private boolean dbActive;
}
package com.studentscheduleapp.appapigateway.properties.gateway;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "gateway.identity.path")
@Component
public class GatewayIdentityPathProperties {
    private String registerPath;
    private String verifyPath;
    private String loginPath;
    private String refreshPath;
}

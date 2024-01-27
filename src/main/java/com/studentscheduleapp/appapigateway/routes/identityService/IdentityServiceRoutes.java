package com.studentscheduleapp.appapigateway.routes.identityService;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class IdentityServiceRoutes {
    @Autowired
    private RegisterRoute registerRoute;
    @Autowired
    private RefreshRoute refreshRoute;
    @Autowired
    private LoginRoute loginRoute;
    @Autowired
    private VerifyRoute verifyRoute;
}

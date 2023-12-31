package com.studentscheduleapp.appapigateway.configurations;

import com.studentscheduleapp.appapigateway.routes.identityService.IdentityServiceRoutes;
import com.studentscheduleapp.appapigateway.routes.resourceProviderService.ResourceProviderRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {
    @Autowired
    private IdentityServiceRoutes identityServiceRoutes;
    @Autowired
    private ResourceProviderRoutes resourceProviderRoutes;
    @Bean
    RouteLocator routeLocator (RouteLocatorBuilder builder){
        return builder.routes()
                .route("register", identityServiceRoutes.getRegisterRoute().getRoute())
                .route("refresh",identityServiceRoutes.getRefreshRoute().getRoute())
                .route("login",identityServiceRoutes.getLoginRoute().getRoute())
                .route("verify",identityServiceRoutes.getVerifyRoute().getRoute())
                .build();
    }
}

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
                .route(identityServiceRoutes.getRegisterRoute().getRoute())
                .route(identityServiceRoutes.getRefreshRoute().getRoute())
                .route(identityServiceRoutes.getLoginRoute().getRoute())
                .route(identityServiceRoutes.getVerifyRoute().getRoute())
                .build();
    }
}

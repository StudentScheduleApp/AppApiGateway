package com.studentscheduleapp.appapigateway.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
@Configuration
public class GatewayConfig {
    @Autowired
    IdentityServiceProperties identityServiceProperties;
    @Value("${service.token.header}")
    private String serviceTokenHeader;
    @Value("${service.token}")
    private String serviceToken;
    @Bean
    RouteLocator routeLocator (RouteLocatorBuilder builder){
        return builder.routes()
                .route("register",route -> route.path("/auth/register")
                        .and()
                        .method(HttpMethod.POST)
                        .filters(gatewayFilterSpec -> gatewayFilterSpec.stripPrefix(2)
                                .prefixPath(identityServiceProperties.getRegisterPath())
                                .addRequestHeader(serviceTokenHeader,serviceToken))
                        .uri(identityServiceProperties.getServiceUri()))
                .route("verify",route -> route.path("/auth/verify")
                        .and()
                        .method(HttpMethod.POST)
                        .filters(gatewayFilterSpec -> gatewayFilterSpec.stripPrefix(2)
                                .prefixPath(identityServiceProperties.getVerifyPath())
                                .addRequestHeader(serviceTokenHeader,serviceToken))
                        .uri(identityServiceProperties.getServiceUri()))
                .route("login",route -> route.path("/auth/login")
                        .and()
                        .method(HttpMethod.POST)
                        .filters(gatewayFilterSpec -> gatewayFilterSpec.stripPrefix(2)
                                .prefixPath(identityServiceProperties.getLoginPath())
                                .addRequestHeader(serviceTokenHeader,serviceToken))
                        .uri(identityServiceProperties.getServiceUri()))
                .route("refresh", route -> route.path("/auth/refresh")
                        .and()
                        .method(HttpMethod.POST)
                        .filters(gatewayFilterSpec -> gatewayFilterSpec.stripPrefix(2)
                                .prefixPath(identityServiceProperties.getRefreshPath())
                                .addRequestHeader(serviceTokenHeader,serviceToken))
                        .uri(identityServiceProperties.getServiceUri()))
                .build();
    }
}

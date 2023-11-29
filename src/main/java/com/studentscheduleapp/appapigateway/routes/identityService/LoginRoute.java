package com.studentscheduleapp.appapigateway.routes.identityService;

import com.studentscheduleapp.appapigateway.interfaces.Routable;
import com.studentscheduleapp.appapigateway.properties.GlobalProperties;
import com.studentscheduleapp.appapigateway.properties.gateways.GatewayIdentityPathProperties;
import com.studentscheduleapp.appapigateway.properties.services.IdentityServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class LoginRoute implements Routable {
    @Autowired
    private IdentityServiceProperties identityServiceProperties;
    @Autowired
    private GlobalProperties globalProperties;
    @Autowired
    private GatewayIdentityPathProperties gatewayIdentityPathProperties;
    @Override
    public Function<PredicateSpec, Buildable<Route>> getRoute() {
        return predicateSpec -> predicateSpec.path(gatewayIdentityPathProperties.getLoginPath())
                .and()
                .method(HttpMethod.POST)
                .filters(gatewayFilterSpec -> gatewayFilterSpec.stripPrefix(2)
                        .prefixPath(identityServiceProperties.getLoginPath()))
                .uri(identityServiceProperties.getUri());
    }
}

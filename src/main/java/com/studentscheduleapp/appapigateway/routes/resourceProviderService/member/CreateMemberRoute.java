package com.studentscheduleapp.appapigateway.routes.resourceProviderService.member;

import com.studentscheduleapp.appapigateway.interfaces.Routable;
import com.studentscheduleapp.appapigateway.properties.gateways.GatewayResourceProviderPathProperties;
import com.studentscheduleapp.appapigateway.properties.services.ResourceProviderServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CreateMemberRoute implements Routable {
    @Autowired
    private GatewayResourceProviderPathProperties gatewayProperties;
    @Autowired
    private ResourceProviderServiceProperties serviceProperties;

    @Override
    public Function<PredicateSpec, Buildable<Route>> getRoute() {
        return predicateSpec -> predicateSpec.path(gatewayProperties.getCreateMemberPath())
                .and()
                .method(HttpMethod.POST)
                .filters(gatewayFilterSpec -> gatewayFilterSpec.stripPrefix(2)
                        .prefixPath(serviceProperties.getCreateMemberPath()))
                .uri(serviceProperties.getUri());
    }
}

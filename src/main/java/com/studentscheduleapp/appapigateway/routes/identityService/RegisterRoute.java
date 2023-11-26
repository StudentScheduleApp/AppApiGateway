package com.studentscheduleapp.appapigateway.routes.identityService;

import com.studentscheduleapp.appapigateway.interfaces.Routable;
import com.studentscheduleapp.appapigateway.properties.GlobalProperties;
import com.studentscheduleapp.appapigateway.properties.gateway.GatewayIdentityPathProperties;
import com.studentscheduleapp.appapigateway.properties.services.IdentityServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
@Component
public class RegisterRoute implements Routable {
    @Autowired
    IdentityServiceProperties identityServiceProperties;
    @Autowired
    GatewayIdentityPathProperties gatewayIdentityPathProperties;
    @Autowired
    GlobalProperties globalProperties;

    @Override
    public java.util.function.Function<PredicateSpec, Buildable<Route>> getRoute() {
        return predicateSpec -> predicateSpec.path(gatewayIdentityPathProperties.getRegisterPath())
                .and()
                .method(HttpMethod.POST)
                .filters(gatewayFilterSpec ->  gatewayFilterSpec.stripPrefix(2)
                        .addRequestHeader(globalProperties.getServiceTokenHeader(),
                                globalProperties.getServiceTokenHeader())
                        .prefixPath(identityServiceProperties.getRegisterPath()))
                .uri(identityServiceProperties.getUri());
    }
}

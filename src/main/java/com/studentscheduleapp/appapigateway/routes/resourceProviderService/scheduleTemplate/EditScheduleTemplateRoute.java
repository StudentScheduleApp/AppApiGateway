package com.studentscheduleapp.appapigateway.routes.resourceProviderService.scheduleTemplate;

import com.studentscheduleapp.appapigateway.interfaces.Routable;
import com.studentscheduleapp.appapigateway.properties.gateway.GatewayResourceProviderPathProperties;
import com.studentscheduleapp.appapigateway.properties.service.ResourceProviderServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class EditScheduleTemplateRoute implements Routable {
    @Autowired
    private ResourceProviderServiceProperties serviceProperties;
    @Autowired
    private GatewayResourceProviderPathProperties gatewayProperties;

    @Override
    public Function<PredicateSpec, Buildable<Route>> getRoute() {
        return predicateSpec -> predicateSpec.path(gatewayProperties.getEditScheduleTemplatePath())
                .and()
                .method(HttpMethod.PATCH)
                .filters(gatewayFilterSpec -> gatewayFilterSpec.stripPrefix(2)
                        .prefixPath(serviceProperties.getEditScheduleTemplatePath()))
                .uri(serviceProperties.getUri());
    }
}

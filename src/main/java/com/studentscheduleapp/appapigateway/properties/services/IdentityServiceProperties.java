package com.studentscheduleapp.appapigateway.properties.services;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@Getter
@NoArgsConstructor
public class IdentityServiceProperties {
    @Value("${identity.service.uri}")
    private String uri;
    @Value("${identity.service.registerPath}")
    private String registerPath;
    @Value("${identity.service.verifyPath}")
    private String verifyPath;
    @Value("${identity.service.loginPath}")
    private String loginPath;
    @Value("${identity.service.refreshPath}")
    private String refreshPath;
    @Bean
    public IdentityServiceProperties getIdentityServicePropertiesBean(){
        return new IdentityServiceProperties();
    }
}

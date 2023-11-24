package com.studentscheduleapp.appapigateway.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
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
    public String getServiceUri() {
        return uri;
    }

    public String getRegisterPath() {
        return registerPath;
    }

    public String getVerifyPath() {
        return verifyPath;
    }

    public String getLoginPath() {
        return loginPath;
    }

    public String getRefreshPath() {
        return refreshPath;
    }
    @Bean
    public IdentityServiceProperties getIdentityServiceProperties(){
        return new IdentityServiceProperties();
    }
}

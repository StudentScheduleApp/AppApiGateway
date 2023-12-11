package com.studentscheduleapp.appapigateway.routes.resourceProviderService.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoArgsConstructor
@Getter
public class UserRoutes {
    @Autowired
    private GetUserByIdRoute getUserByIdRoute;
    @Autowired
    private EditUserRoute editUserRoute;
    @Bean
    public UserRoutes userResourceProviderRoutesBean(){
        return new UserRoutes();
    }
}

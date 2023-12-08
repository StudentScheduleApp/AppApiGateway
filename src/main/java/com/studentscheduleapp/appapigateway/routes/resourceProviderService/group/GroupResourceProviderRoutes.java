package com.studentscheduleapp.appapigateway.routes.resourceProviderService.group;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@NoArgsConstructor
public class GroupResourceProviderRoutes {
    @Autowired
    private CreateGroupRoute createGroupRoute;
    @Autowired
    private DeleteGroupRoute deleteGroupRoute;
    @Autowired
    private EditGroupRoute editGroupRoute;
    @Autowired
    private GetGroupByIdRoute getGroupByIdRoute;
    @Bean
    public GroupResourceProviderRoutes groupResourceProviderRoutesBean(){
        return new GroupResourceProviderRoutes();
    }
}

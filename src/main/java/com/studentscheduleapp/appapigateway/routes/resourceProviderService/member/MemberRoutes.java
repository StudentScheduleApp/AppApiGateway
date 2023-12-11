package com.studentscheduleapp.appapigateway.routes.resourceProviderService.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@NoArgsConstructor
public class MemberRoutes {
    @Autowired
    private GetMemberByIdRoute getMemberByIdRoute;
    @Autowired
    private GetMemberByUserIdRoute getMemberByUserIdRoute;
    @Autowired
    private GetMembersByGroupIdRoute getMembersByGroupIdRoute;
    @Autowired
    private EditMemberRoute editMemberRoute;
    @Autowired
    private DeleteMemberRoute deleteMemberRoute;
    @Autowired
    private CreateMemberRoute createMemberRoute;
    @Bean
    public MemberRoutes memberResourceProviderRoutesBean(){
        return new MemberRoutes();
    }
}

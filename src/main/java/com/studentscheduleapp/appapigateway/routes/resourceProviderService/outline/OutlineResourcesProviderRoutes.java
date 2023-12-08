package com.studentscheduleapp.appapigateway.routes.resourceProviderService.outline;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@NoArgsConstructor
public class OutlineResourcesProviderRoutes {
    @Autowired
    private CreateOutlineRoute createOutlineRoute;
    @Autowired
    private DeleteOutlineRoute deleteOutlineRoute;
    @Autowired
    private EditOutlineRoute editOutlineRoute;
    @Autowired
    private GetOutlineByUserIdRoute getOutlineByUserIdRoute;
    @Autowired
    private GetOutlineBySpecificLessonIdRoute getOutlineBySpecificLessonIdRoute;
    @Autowired
    private GetOutlineByIdRoute getOutlineByIdRoute;
    @Bean
    public OutlineResourcesProviderRoutes outlineResourcesProviderRoutesBean(){
        return new OutlineResourcesProviderRoutes();
    }
}

package com.studentscheduleapp.appapigateway.routes.resourceProviderService.outlineMedia;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoArgsConstructor
@Getter
public class OutlineMediaRoutes {
    @Autowired
    private CreateOutlineMediaRoute createOutlineMediaRoute;
    @Autowired
    private EditOutlineMediaRoute editOutlineMediaRoute;
    @Autowired
    private DeleteOutlineMediaRoute deleteOutlineMediaRoute;
    @Autowired
    private GetOutlineMediaByIdRoute getOutlineMediaByIdRoute;
    @Autowired
    private GetOutlineMediasByOutlineIdRoute getOutlineMediasByOutlineIdRoute;
    @Bean
    public OutlineMediaRoutes outlineMediaResourcesProviderRoutesBean(){
        return new OutlineMediaRoutes();
    }
}

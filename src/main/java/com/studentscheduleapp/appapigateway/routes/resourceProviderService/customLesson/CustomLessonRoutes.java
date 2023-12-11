package com.studentscheduleapp.appapigateway.routes.resourceProviderService.customLesson;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@NoArgsConstructor
public class CustomLessonRoutes {
    @Autowired
    private CreateCustomLessonRoute createCustomLessonRoute;
    @Autowired
    private DeleteCustomLessonRoute deleteCustomLessonRoute;
    @Autowired
    private EditCustomLessonRoute editCustomLessonRoute;
    @Autowired
    private GetCustomLessonByIdRoute getCustomLessonByIdRoute;
    @Autowired
    private GetCustomLessonsByGroupIdRoute getCustomLessonsByGroupIdRoute;
    @Bean
    public CustomLessonRoutes customLessonRoutesBean(){
        return new CustomLessonRoutes();
    }
}

package com.studentscheduleapp.appapigateway.routes.resourceProviderService.lessonTemplate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoArgsConstructor
@Getter
public class LessonTemplateRoutes {
    @Autowired
    private CreateLessonTemplateRoute createLessonTemplateRoute;
    @Autowired
    private DeleteLessonTemplateRoute deleteLessonTemplateRoute;
    @Autowired
    private EditLessonTemplateRoute editLessonTemplateRoute;
    @Autowired
    private GetLessonTemplateByIdRoute getLessonTemplateByIdRoute;
    @Autowired
    private GetLessonTemplatesByScheduleTemplateIdRoute getLessonTemplatesByScheduleTemplateIdRoute;
    @Bean
    public LessonTemplateRoutes lessonTemplateRoutesBean(){
        return new LessonTemplateRoutes();
    }
}

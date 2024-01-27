package com.studentscheduleapp.appapigateway.routes.resourceProviderService.scheduleTemplate;

import com.studentscheduleapp.appapigateway.routes.resourceProviderService.outline.GetOutlineByUserIdRoute;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class ScheduleTemplateRoutes {
    @Autowired
    private CreateScheduleTemplateRoute createScheduleTemplateRoute;
    @Autowired
    private DeleteScheduleTemplateRoute deleteScheduleTemplateRoute;
    @Autowired
    private EditScheduleTemplateRoute editScheduleTemplateRoute;
    @Autowired
    private GetScheduleTemplateByIdRoute getScheduleTemplateByIdRoute;
    @Autowired
    private GetOutlineByUserIdRoute getOutlineByUserIdRoute;

}

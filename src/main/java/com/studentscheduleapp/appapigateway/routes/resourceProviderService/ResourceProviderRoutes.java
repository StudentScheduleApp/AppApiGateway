package com.studentscheduleapp.appapigateway.routes.resourceProviderService;

import com.studentscheduleapp.appapigateway.routes.resourceProviderService.customLesson.CustomLessonRoutes;
import com.studentscheduleapp.appapigateway.routes.resourceProviderService.group.GroupRoutes;
import com.studentscheduleapp.appapigateway.routes.resourceProviderService.lessonTemplate.LessonTemplateRoutes;
import com.studentscheduleapp.appapigateway.routes.resourceProviderService.member.MemberRoutes;
import com.studentscheduleapp.appapigateway.routes.resourceProviderService.outline.OutlineRoutes;
import com.studentscheduleapp.appapigateway.routes.resourceProviderService.outlineMedia.OutlineMediaRoutes;
import com.studentscheduleapp.appapigateway.routes.resourceProviderService.outlineMediaComment.OutlineMediaCommentRoutes;
import com.studentscheduleapp.appapigateway.routes.resourceProviderService.scheduleTemplate.ScheduleTemplateRoutes;
import com.studentscheduleapp.appapigateway.routes.resourceProviderService.specificLesson.SpecificLessonRoutes;
import com.studentscheduleapp.appapigateway.routes.resourceProviderService.user.UserRoutes;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class ResourceProviderRoutes {
    @Autowired
    private CustomLessonRoutes customLessonRoutes;
    @Autowired
    private GroupRoutes groupRoutes;
    @Autowired
    private LessonTemplateRoutes lessonTemplateRoutes;
    @Autowired
    private MemberRoutes memberRoutes;
    @Autowired
    private OutlineRoutes outlineRoutes;
    @Autowired
    private OutlineMediaRoutes outlineMediaRoutes;
    @Autowired
    private OutlineMediaCommentRoutes outlineMediaCommentRoutes;
    @Autowired
    private ScheduleTemplateRoutes scheduleTemplateRoutes;
    @Autowired
    private SpecificLessonRoutes specificLessonRoutes;
    @Autowired
    private UserRoutes userRoutes;
}

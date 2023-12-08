package com.studentscheduleapp.appapigateway.properties.gateway;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@NoArgsConstructor
@Configuration
public class GatewayResourceProviderPathProperties {
    //User
    @Value("${gateway.resource.provider.user.path.idPath}")
    private String getUserByIdPath;
    @Value("${gateway.resource.provider.user.path.editPath}")
    private String editUserPath;
    //Member
    @Value("${gateway.resource.provider.member.path.memberIdPath}")
    private String getMemberByIdPath;
    @Value("${gateway.resource.provider.member.path.groupIdPath}")
    private String getMembersByGroupIdPath;
    @Value("${gateway.resource.provider.member.path.userIdPath}")
    private String getMemberByUserIdPath;
    @Value("${gateway.resource.provider.member.path.editPath}")
    private String editMemberPath;
    @Value("${gateway.resource.provider.member.path.createPath}")
    private String createMemberPath;
    @Value("${gateway.resource.provider.member.path.deletePath}")
    private String deleteMemberPath;
    //Group
    @Value("${gateway.resource.provider.group.path.idPath}")
    private String getGroupByIdPath;
    @Value("${gateway.resource.provider.group.path.createPath}")
    private String createGroupPath;
    @Value("${gateway.resource.provider.group.path.editPath}")
    private String editGroupPath;
    @Value("${gateway.resource.provider.group.path.deletePath}")
    private String deleteGroupPath;
    //Outline
    @Value("${gateway.resource.provider.outline.path.idPath}")
    private String getOutlineByIdPath;
    @Value("${gateway.resource.provider.outline.path.createPath}")
    private String createOutlineByIdPath;
    @Value("${gateway.resource.provider.outline.path.editPath}")
    private String editOutlinePath;
    @Value("${gateway.resource.provider.outline.path.deletePath}")
    private String deleteOutlinePath;
    @Value("${gateway.resource.provider.outline.path.specificLessonIdPath}")
    private String getOutlineBySpecificLessonIdPath;
    @Value("${gateway.resource.provider.outline.path.userIdPath}")
    private String getOutlineByUserIdPath;
    //ScheduleTemplate
    @Value("${gateway.resource.provider.sceduleTemplate.path.idPath}")
    private String getScheduleTemplateByIdPath;
    @Value("${gateway.resource.provider.sceduleTemplate.path.groupIdPath}")
    private String getScheduleTemplateByGroupIdPath;
    @Value("${gateway.resource.provider.sceduleTemplate.path.deletePath}")
    private String deleteScheduleTemplatePath;
    @Value("${gateway.resource.provider.sceduleTemplate.path.createPath}")
    private String createScheduleTemplatePath;
    @Value("${gateway.resource.provider.sceduleTemplate.path.editPath}")
    private String editScheduleTemplatePath;
}

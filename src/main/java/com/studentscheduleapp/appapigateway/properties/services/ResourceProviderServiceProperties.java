package com.studentscheduleapp.appapigateway.properties.services;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@NoArgsConstructor
public class ResourceProviderServiceProperties {
    @Value("${resource.provider.service.uri}")
    private String uri;
    //User resources
    @Value("${resource.provider.service.user.path.idPath}")
    private String getUserByIdPath;
    @Value("${resource.provider.service.user.path.editPath}")
    private String userEditPath;
    //Member
    @Value("${resource.provider.service.member.path.memberIdPath}")
    private String getMemberByIdPath;
    @Value("${resource.provider.service.member.path.groupIdPath}")
    private String getMembersByGroupIdPath;
    @Value("${resource.provider.service.member.path.userIdPath}")
    private String getMemberByUserIdPath;
    @Value("${resource.provider.service.member.path.editPath}")
    private String memberEditPath;
    @Value("${resource.provider.service.member.path.createPath}")
    private String memberCreatePath;
    @Value("${resource.provider.service.member.path.deletePath}")
    private String memberDeletePath;
    //Group
    @Value("${resource.provider.service.group.path.idPath}")
    private String getGroupByIdPath;
    @Value("${resource.provider.service.group.path.createPath}")
    private String createGroupPath;
    @Value("${resource.provider.service.group.path.editPath}")
    private String editGroupPath;
    @Value("${resource.provider.service.group.path.deletePath}")
    private String deleteGroupPath;
    //Outline
    @Value("${resource.provider.service.outline.path.idPath}")
    private String getOutlineByIdPath;
    @Value("${resource.provider.service.outline.path.createPath}")
    private String createOutlinePath;
    @Value("${resource.provider.service.outline.path.editPath}")
    private String editOutlinePath;
    @Value("${resource.provider.service.outline.path.deletePath}")
    private String deleteOutlinePath;
    @Value("${resource.provider.service.outline.path.specificLessonIdPath}")
    private String getOutlineBySpecificLessonIdPath;
    @Value("${resource.provider.service.outline.path.userIdPath}")
    private String getOutlineByUserIdPath;
    //Schedule Template
    @Value("${resource.provider.service.scheduleTemplate.path.idPath}")
    private String getScheduleTemplateByIdPath;
    @Value("${resource.provider.service.scheduleTemplate.path.groupIdPath}")
    private String getScheduleTemplateByGroupId;
    @Value("${resource.provider.service.scheduleTemplate.path.deletePath}")
    private String deleteScheduleTemplatePath;
    @Value("${resource.provider.service.scheduleTemplate.path.createPath}")
    private String createScheduleTemplatePath;
    @Value("${resource.provider.service.scheduleTemplate.path.editPath}")
    private String editScheduleTemplatePath;
}

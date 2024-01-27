package com.studentscheduleapp.appapigateway.routes.resourceProviderService.outlineMediaComment;

import com.studentscheduleapp.appapigateway.routes.resourceProviderService.outlineMedia.GetOutlineMediasByOutlineIdRoute;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class OutlineMediaCommentRoutes {
    @Autowired
    private GetOutlineMediaCommentByIdRoute getOutlineMediaCommentByIdRoute;
    @Autowired
    private GetOutlineMediasByOutlineIdRoute getOutlineMediasByOutlineIdRoute;
    @Autowired
    private EditOutlineMediaCommentRoute editOutlineMediaCommentRoute;
    @Autowired
    private DeleteOutlineMediaCommentRoute deleteOutlineMediaCommentRoute;
    @Autowired
    private CreateOutlineMediaCommentRoute createOutlineMediaCommentRoute;
}

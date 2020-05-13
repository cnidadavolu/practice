package com.learn.soap.webservices.demoSoap.soap;

import com.learn.soap.webservices.demoSoap.component.CourseDetailsService;
import com.learn.soap.webservices.demoSoap.soap.bean.Course;
import com.learning.courses.CourseDetails;
import com.learning.courses.GetCourseDetailsRequest;
import com.learning.courses.GetCourseDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseDetailsEndpoint {

    @Autowired
    private CourseDetailsService courseDetailsService;
    //input - GetCourseDetailsRequest
    //output - GetCourseDetailsResponse
    //http://learning.com/courses

    @PayloadRoot(namespace = "http://learning.com/courses", localPart = "GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse processCourseDetailsRequest
            (@RequestPayload GetCourseDetailsRequest req) {
        GetCourseDetailsResponse response = new GetCourseDetailsResponse();
        Course course = courseDetailsService.findById(req.getId());
        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setId(req.getId());
        courseDetails.setName("Java Soap Services");
        courseDetails.setDescription("This course to learn SOAP Services");
        response.setCourseDetails(courseDetails);
        return response;
    }
}

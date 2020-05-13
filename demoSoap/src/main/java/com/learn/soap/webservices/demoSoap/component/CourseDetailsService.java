package com.learn.soap.webservices.demoSoap.component;

import com.learn.soap.webservices.demoSoap.soap.bean.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CourseDetailsService {
    //course 1
    // course findById(int id)
    //Courses  LIst<Course> findAll();
    //delete

    private static List<Course> courses = new ArrayList<>();
    static {
        Course course1 = new Course(1,"Spring","Tutorial");
        courses.add(course1);
        Course course2 = new Course(2,"Spring Boot","Tutorial");
        courses.add(course2);
        Course course3 = new Course(3,"Microservices","Tutorial");
        courses.add(course3);
        Course course4 = new Course(4,"React JS","Tutorial");
        courses.add(course4);
        Course course5 = new Course(5,"Tutorial","Tutorial");
        courses.add(course5);
    }
    public Course findById(int id){
        for(Course course: courses){
            if(course.getId()==id)
                return course;
        }
        return null;
    }

    public List<Course> findAll(){
        return courses;
    }

    public int deleteById(int id){

        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()){
            Course course = iterator.next();
            if(course.getId()==id){
                iterator.remove();
                return 1;
            }
        }
        return 0;
    }


}

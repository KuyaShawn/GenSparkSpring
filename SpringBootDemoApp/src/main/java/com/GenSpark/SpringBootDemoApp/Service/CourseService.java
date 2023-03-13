package com.GenSpark.SpringBootDemoApp.Service;

import com.GenSpark.SpringBootDemoApp.Entity.Course;

import java.util.List;

public interface CourseService {
    // GET (/courses) Get All Course
    List<Course> getAllCourses();

    // GET (/courses/{courseId}) Get single Course of given id in URL
    Course getCourseById(int courseId);

    // POST (/courses) Add new Course
    Course addCourse(Course course);

    // PUT (/courses) Update Course
    Course updateCourse(Course course);

    // DELETE (/courses/{courseId}) Delete Course
    String deleteCourseByID(int courseId);

}

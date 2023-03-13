package com.GenSpark.SpringBootDemoApp.Controller;

import com.GenSpark.SpringBootDemoApp.Entity.Course;
import com.GenSpark.SpringBootDemoApp.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    // http://localhost:8080/ - Home page
    @GetMapping("/")
    public String localHost() {
        return "<HTML><h1>Welcome to course Application</h1></HTML>";
    }

    // GET (/courses) Get All Course
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getAllCourses();
    }

    // GET (/courses/{courseId}) Get single Course of given id in URL
    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId) {
        return this.courseService.getCourseById(Integer.parseInt(courseId));
    }

    // POST (/courses) Add new Course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    // PUT (/courses) Update Course
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    // DELETE (/courses/{courseId}) Delete Course
    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId) {
        return this.courseService.deleteCourseByID(Integer.parseInt(courseId));
    }
}

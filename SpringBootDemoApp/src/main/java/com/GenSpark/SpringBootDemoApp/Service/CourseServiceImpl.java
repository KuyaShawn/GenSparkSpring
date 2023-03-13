package com.GenSpark.SpringBootDemoApp.Service;

import com.GenSpark.SpringBootDemoApp.Dao.CourseDao;
import com.GenSpark.SpringBootDemoApp.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    // GET (/courses) Get All Course
    @Override
    public List<Course> getAllCourses() {
        return this.courseDao.findAll();
    }

    // GET (/courses/{courseId}) Get single Course of given id in URL
    @Override
    public Course getCourseById(int courseId) {
        Optional<Course> course = this.courseDao.findById(courseId);
        Course courseExist = null;
        if (course.isPresent()) {
            courseExist = course.get();
        } else {
            throw new RuntimeException("Course not found for ID: " + courseId);
        }

        return courseExist;
    }

    // POST (/courses) Add new Course
    @Override
    public Course addCourse(Course course) {
        return this.courseDao.save(course);
    }

    // PUT (/courses) Update Course
    @Override
    public Course updateCourse(Course course) {
        return this.courseDao.save(course);
    }

    // DELETE (/courses/{courseId}) Delete Course
    @Override
    public String deleteCourseByID(int courseId) {
        this.courseDao.deleteById(courseId);
        return "Successfully deleted course " + courseId;
    }


}

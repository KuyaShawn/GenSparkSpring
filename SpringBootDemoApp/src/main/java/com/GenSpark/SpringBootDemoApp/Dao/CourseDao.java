package com.GenSpark.SpringBootDemoApp.Dao;

import com.GenSpark.SpringBootDemoApp.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course,Integer> {

}



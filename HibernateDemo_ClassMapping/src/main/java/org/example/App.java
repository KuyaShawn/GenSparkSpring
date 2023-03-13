package org.example;

import org.example.Entity.Student;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        System.out.println("Welcome to DB");
        // SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();


        // Creates the Employee data
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Bob");
        s1.setAge(20);
        s1.setCity("Seattle");
        session.save(s1);

        /*
        // Retrieves the Student data
        Query query = session.createQuery("from Student");
        List<Student> studList = query.list();

        for (Student stu : studList) {
            System.out.println(stu.toString());
        }
         */

        /*
        // Retrieves the Student data From specified column from the database
        Query query = session.createQuery("from Student where empDept=:dept");
        query.setParameter("dept", "HR Dept");
        List<Student> studList = query.list();

        for (Student stu : studList) {
            System.out.println(stu.toString());
        }
         */

        /*
        // Updates the Student data From specified column from the database
        Query query = session.createQuery("update Student set name=:n where id=:i");
        query.setParameter("n", "Charlie");
        query.setParameter("i", 1);
        int status = query.executeUpdate();
        System.out.println(status);
        // remember to use the commit() method to update the database
         */

        /*
        // Updates the Student data From specified column from the database
        Query query = session.createQuery("select min(age) from Student");
        query.setInteger("age", 23);
        List<Student> studList = query.list();
         */


        // use .commit() to save data to the database
        //tx.commit();

        tx.commit();
        System.out.println("Update Successfully");
        factory.close();
        session.close();
    }
}

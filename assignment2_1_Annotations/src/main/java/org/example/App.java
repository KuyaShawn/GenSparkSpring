package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student = (Student) context.getBean(Student.class);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Address: " + student.getAdd().getCity() + ", " + student.getAdd().getState() +
                ", " + student.getAdd().getZipcode() + " - " + student.getAdd().getCountry());
        System.out.println("Phone Numbers: ");
        for (Phone phone : student.getPh()) {
            System.out.println(phone.getMob());
        }
        context.close();
    }
}

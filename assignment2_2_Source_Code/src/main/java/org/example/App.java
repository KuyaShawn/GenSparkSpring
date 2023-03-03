package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student = context.getBean(Student.class);
        Phone phone = context.getBean(Phone.class);
        Address address = context.getBean(Address.class);

        System.out.println(student);
        System.out.println(phone);
        System.out.println(address);


        context.close();
    }
}

package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.example")
public class StudentConfig {

    @Autowired
    private Phone phone;

    @Autowired
    private Address address;

    @Bean
    public Student student(){
        Student student1 = new Student();
        student1.setId(999);
        student1.setName("Bob");
        student1.setPh(List.of(phone));
        student1.setAdd(address);
        return student1;
    }

    @Bean
    public Phone phone1(){
        Phone phone = new Phone();
        phone.setMob("123-456-7890");
        return phone;
    }

    @Bean
    public Phone phone2(){
        Phone phone = new Phone();
        phone.setMob("987-654-3210");
        return phone;
    }

    @Bean
    public Address address(){
        Address address1 = new Address();
        address1.setCity("Seattle");
        address1.setState("WA");
        address1.setCountry("United States");
        address1.setZipcode("98178");
        return address1;
    }
}

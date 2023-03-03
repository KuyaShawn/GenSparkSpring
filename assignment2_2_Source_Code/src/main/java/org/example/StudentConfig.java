package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan("org.example")
public class StudentConfig {

    @Bean
    @Autowired
    public Student student(List<Phone> phones, Address address) {
        return new Student(10, "Charlie", phones, address);
    }

    @Bean
    public Phone phone() {
        return new Phone("098-765-4321");
    }

    @Bean
    public Address address() {
        return new Address("Seattle", "WA", "United States", "98178");
    }
}

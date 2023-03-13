package org.example;

import org.example.Entity.Employee;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        /*
        // Creates the Employee data
        Employee e1 = new Employee();
        e1.setEmpId(1);
        e1.setEmpName("Bob");
        e1.setEmpDept("HR Dept");
        session.save(e1);
         */

        /*
        // Retrieves the Employee data
        Query query = session.createQuery("from Employee");
        List<Employee> empList = query.list();

        for (Employee emp : empList) {
            System.out.println(emp.toString());
        }
         */

        /*
        // Retrieves the Employee data From specified column from the database
        Query query = session.createQuery("from Employee where empDept=:dept");
        query.setParameter("dept", "HR Dept");
        List<Employee> empList = query.list();

        for (Employee emp : empList) {
            System.out.println(emp.toString());
        }
         */

        /*
        // Updates the Employee data From specified column from the database
        Query query = session.createQuery("update Employee set empName=:n where empId=:i");
        query.setParameter("n", "Charlie");
        query.setParameter("i", 1);
        int status = query.executeUpdate();
        System.out.println(status);
        // remember to use the commit() method to update the database
         */


        // use .commit() to save data to the database
        //t.commit();

        System.out.println("Update Successfully");
        factory.close();
        session.close();
    }
}

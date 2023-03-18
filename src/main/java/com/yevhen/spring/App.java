package com.yevhen.spring;

import com.yevhen.spring.rest.Communication;
import com.yevhen.spring.rest.configuration.MyConfig;
import com.yevhen.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",
                Communication.class);
//
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);
//
//        Employee empByID = communication.getEmployee(5);
//        System.out.println(empByID);
//
//        Employee emp = new Employee("Sveta", "Sokolova",
//                "IT", 1200);
//
//        emp.setId(16);
//        communication.saveEmployee(emp);

//        communication.deleteEmployee(16);

    }
}

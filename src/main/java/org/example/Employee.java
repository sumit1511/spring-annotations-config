package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("emp")
public class Employee
{

    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Value("${salary}")
    private Double salary;
    @Value("${tasks}")
    private List<String> taskList;
    @Autowired
    private  Department department;
    public  void show()
    {
        System.out.println("Name-:"+name);
        System.out.println("Age-:"+age);
        System.out.println("Salary-:"+salary);
        System.out.println("tasks-:"+taskList);
        department.print();
    }
}

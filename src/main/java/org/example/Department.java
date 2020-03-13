package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Department {

    @Value("${deptName}")
    private  String deptName;

    @Autowired
    private Date createdOn;

    public void print()
     {
         System.out.println("Department name is "+this.deptName + "  "+this.createdOn );
     }
}

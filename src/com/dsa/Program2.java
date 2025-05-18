package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1{
    String name;
    int id;

    public Employee1(String name, int id){
        this.id=id;
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}


public class Program2 {
    List<Employee1> addEmployee = Arrays.asList(
            new Employee1("abhihskek",1),
            new Employee1("mamta",2),
            new Employee1("sang harsh",2)

    );

    List<Employee1> getAddEmployee = addEmployee.stream().filter(emp-> Boolean.parseBoolean(emp.getName())).collect(Collectors.toList());





}

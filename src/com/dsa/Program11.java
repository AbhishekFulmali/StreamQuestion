package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//49 Get the last 5 employees based on their roll number.
class Employee11{
    private String name ;
    private Long rollNumber;

    public Employee11(String name , Long rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Long rollNumber) {
        this.rollNumber = rollNumber;
    }
}

public class Program11 {

    List<Employee11> addemp = Arrays.asList(
      new Employee11("abhishek",1L),
      new Employee11("abhishek2",2L),
      new Employee11("abhishek3",3L),
      new Employee11("abhishek4",4L),
      new Employee11("abhishek5",5L),
      new Employee11("abhisheky7",7L)

    );

    List<Employee11> getLastFive = addemp.stream().skip(Math.max(addemp.size()-5,0)).collect(Collectors.toList());



}

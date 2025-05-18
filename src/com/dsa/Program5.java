package com.dsa;
//42 )Check if any employee is currently enrolled in more than one subject.

import java.util.Arrays;
import java.util.List;

class Employee5{
    String name;
    String subject;
    boolean anRolled;

    public Employee5(String name, String subject,boolean anRolled){
        this.name=name;
        this.subject=subject;
        this.anRolled=anRolled;
    }

    public boolean isAnRolled() {
        return anRolled;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

}

public class Program5 {

    public static void main(String []args){

        List<Employee5> addemployee= Arrays.asList(
              new Employee5("abhishek","math",true),
              new Employee5("sangharsh","physics",true),
                new Employee5("abhishek","physics",true)
        );
    }


}

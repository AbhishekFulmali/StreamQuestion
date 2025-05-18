package com.dsa;


//48-Count employees who have a specific subject as their primary subject

import java.util.Arrays;
import java.util.List;

class Employee10{
    private String name;

    private String primarySub;

    public Employee10(String name , String primarySub){
        this.name=name;
        this.primarySub=primarySub;
    }

    public  String getName(){
        return  name;
    }

    public String getPrimarySub(){
        return primarySub;
    }



}

public class Program10 {
    public static void main(String[] args) {
        List<Employee10> addemp = Arrays.asList(
           new Employee10("abhisshek","math"),
           new Employee10("rahan","physics"),
           new Employee10("mamta","english")

        );

        String targetSubject = "math";
       long count = addemp.stream().filter(e->targetSubject.equalsIgnoreCase(e.getPrimarySub())).count();
        System.out.println(count);

    }
}

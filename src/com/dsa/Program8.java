package com.dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 47 Retrieve employees sorted by first name then last name.
class Employee9 {
    private  String fistName;
    private String lastName;

    public Employee9(String fistName , String lastName){
        this.fistName=fistName;
        this.lastName=lastName;

    }

   public  String getFistName(){
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return fistName + " " + lastName;
    }
}

public class Program8 {
    public static void main(String[] args) {
        List<Employee9> addemp = Arrays.asList(
          new Employee9("abhishke","fulmali") ,
          new Employee9("mamta","sharma"),
          new Employee9("sangharsh","tamgadghe")
        );

        List<Employee9> getlist = addemp.stream().sorted(Comparator.comparing(Employee9::getFistName).thenComparing(Employee9::getLastName)).toList();
        addemp.forEach(System.out::println);
    }
}

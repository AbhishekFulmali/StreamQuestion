package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 51 -Find employees who are enrolled in a specific subject.
class Employee13{
    private String name;
    private List<String> subjects;

    public Employee13(String name ,  List<String> subjects){
        this.name=name;
        this.subjects=subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects() {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Employee13{" +
                "name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
public class Program13 {
    public static void main(String[] args) {

        List<Employee13> addemp = Arrays.asList(
             new Employee13("abhsihek" , Arrays.asList("math","physics")),
             new Employee13("sanghar", Arrays.asList("math","chemistry")),
             new Employee13("mamta", Arrays.asList("physchology","Biology")),
             new Employee13("rohan",Arrays.asList("datascience","phython"))
        );
        String targetSubject="math";
        List<Employee13> enrolledInMath = addemp.stream()
                .filter(e -> e.getSubjects().contains(targetSubject))
                .toList();
        enrolledInMath.forEach(System.out::println);

    }
}

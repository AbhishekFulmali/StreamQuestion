package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//List employees who have not enrolled in any subjects.
class Employee7{
    private int id;
    String name;
    private List<String> subjects;

    public Employee7(int id, String name , String...subjects){
        this.id = id ;
        this.name=name;
        this.subjects=new ArrayList<>(Arrays.asList(subjects));
    }

    public void enrollSubject(String subject){
        subjects.add(subject);
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public boolean hasNoSubjects() {
        return subjects.isEmpty();
    }
}


public class Program6 {
    public static void main(String [] args){
        List<Employee7> employee = Arrays.asList(
            new Employee7(101,"alice","math"),
            new Employee7(101,"abhi"),
            new Employee7(101,"mamta","physics"),
            new Employee7(101,"sangharsh","chemistry","Biology")
        );

        List<Employee7> unenrolledEmployees = employee.stream()
                .filter(Employee7::hasNoSubjects).collect(Collectors.toList());
        System.out.println("Employee not enrolled in any subjects");
        if(unenrolledEmployees.isEmpty()){
            System.out.println("all employees are enrolled in at least on e subject");
        }
        else{
            unenrolledEmployees.forEach(emp-> System.out.printf("ID:%d , Name: %s %n",emp.getId(),emp.getName()));
            System.out.printf("%nTotal: %d employee(s)%n", unenrolledEmployees.size());
        }
    }
}

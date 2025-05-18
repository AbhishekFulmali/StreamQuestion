package com.dsa;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Retrieve a list of employees with emails containing “student”.
class Employee12 {
    private String name;
    private String email;

    public Employee12(String name , String email){
        this.name=name;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee12{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class Program12 {

    public static void main(String[] args) {
        List<Employee12> addemp = Arrays.asList(
                new Employee12("abhisek", "abhishe@student.com"),
                new Employee12("sangharsh", "sangharsh@student.com"),
                new Employee12("rohan", "rohan@.com")
        );
        List<Employee12> getList = addemp.stream().filter(emp -> emp.getEmail().contains("student")).toList();
        getList.forEach(System.out::println);

    }

}




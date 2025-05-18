package com.dsa;
//Create a map of employee IDs to their corresponding emails.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee3{
    private  int id;
    private String email;

    public Employee3(int id , String email){
        this.id=id;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}

public class Program3 {
    public static void main(String[] args) {

        List<Employee3>addemploye = Arrays.asList(
          new Employee3(1,"abhishekfulmal@edu.in"),
          new Employee3(2,"sanghar@gmail.com"),
          new Employee3(3,"mamta@gmail.com")

        );

        Map<Integer,String> idtoemailMap=addemploye.stream().collect(Collectors.toMap(Employee3::getId,Employee3::getEmail));
        System.out.println(idtoemailMap);

    }
}

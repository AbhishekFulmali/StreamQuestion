package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 45.Get a list of employees whose attendance percentage is between 60% and 80%.
class Employee8{

    private int id;
    private  String name;
    private long attendance;

    public Employee8(int id, String name , long attendance){
        this.id=id;
        this.name=name;
        this.attendance=attendance;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getAttendance() {
        return attendance;
    }

    double  getpercentage(){
        return  (this.attendance*100)/100.00;
    }

    @Override
    public String toString() {
        return "Employee8{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attendance=" + attendance +
                '}';
    }
}
public class Program7 {
    public static void main(String []args){

        List<Employee8> addemp = Arrays.asList(
                new Employee8(1,"abhi",58),
                new Employee8(2,"abhi2",78),
                new Employee8(3,"abh3",60),
                new Employee8(4,"abhi4",90)

        );

        List<Employee8> getlistemp = addemp.stream().filter(emp->emp.getpercentage()>60 && emp.getpercentage()<80).toList();

        getlistemp.forEach(System.out::println);



    }
}

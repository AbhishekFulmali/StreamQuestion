package com.dsa;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//41 Get a summary of attendance percentages per department.
class Employee4{
    private  int id;
    private String name;
    private String deparment;
    private int presentDay;
    private int totalDays;

    public Employee4(int id, String name,String deparment){
        this.id=id;
        this.name=name;
        this.deparment=deparment;
        this.presentDay=0;
        this.totalDays=0;
    }
    public void markAttendance(boolean present){
        totalDays++;
        if(present){
            presentDay++;
        }
    }
    public String getDeparment(){return  deparment;}
    public  int getPresentDay(){return  presentDay;}
    public int getTotalDays(){return totalDays;}
    public double getAttendaPercentage(){
        if(totalDays==0) return 0.0;
        return (presentDay*100.0)/totalDays;

    }
}
public class Program4 {
    public static void main(String[] args){
        Employee4 emp1 = new Employee4(101, "Alice", "Engineering");
        Employee4 emp2 = new Employee4(102, "Bob", "Engineering");
        Employee4 emp3 = new Employee4(103, "Charlie", "HR");
        Employee4 emp4 = new Employee4(104, "Diana", "HR");
        Employee4 emp5 = new Employee4(105, "Eve", "Marketing");

        emp1.markAttendance(true); emp1.markAttendance(true); emp1.markAttendance(false);
        emp2.markAttendance(true); emp2.markAttendance(true); emp2.markAttendance(true);
        emp3.markAttendance(true); emp3.markAttendance(false);
        emp4.markAttendance(false); emp4.markAttendance(false);
        emp5.markAttendance(true); emp5.markAttendance(true); emp5.markAttendance(true); emp5.markAttendance(true);


      List<Employee4> employee4List = Arrays.asList(
        emp1,emp2,emp3, emp4,emp5
      );

        Map<String, DoubleSummaryStatistics>departmentStats=employee4List.stream().collect(Collectors.groupingBy(Employee4::getDeparment,Collectors.summarizingDouble(Employee4::getAttendaPercentage)));


        



    }

}

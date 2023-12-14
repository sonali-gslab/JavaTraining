package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeImpl {
    public static void main(String args[])
    {
        Employee e1=new Employee(101,"Sonali Pawase",28,10000,"HR");
        Employee e2=new Employee(102,"Monali Rohamare",22,20000,"ADMIN");
        Employee e3=new Employee(103,"Gansh Thorat",30,30000,"IT");
        Employee e4=new Employee(104,"Mahesh shinde",34,40000,"ADMIN");
        Employee e5=new Employee(105,"Reva Shende",21,50000,"CIS");
        Employee e6=new Employee(106,"Pratik Hon",28,10000,"IT");
        Employee e7=new Employee(107,"Kailas Pawase",25,20000,"ADMIN");
        Employee e8=new Employee(108,"Aboli Deshmukh",30,30000,"IT");
        Employee e9=new Employee(109,"Athaang Pawase",37,30000,"HR");
        Employee e10=new Employee(110,"Aarati aher",23,40000,"IT");
        Employee e11=new Employee(111,"Nikunj Aher",30,60000,"CIS");
        Employee e12=new Employee(112,"Rajveera Pawase",28,40000,"HR");
        Employee e13=new Employee(113,"Anita Shirke",24,50000,"HR");
        Employee e14=new Employee(114,"Sai Autade",28,10000,"CIS");
        Employee e15=new Employee(115,"Pratik Autade",28,20000,"ADMIN");
        List<Employee> list= Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15);

        // display all Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);



        // group Employees by department
        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> groupedByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDept));
        groupedByDepartment.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("   %s%n", employee));
                }
        );

        //Find Max salary Dept wise


    }
}

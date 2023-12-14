package java8;

public class Employee {
    private int empId;
    private String empName;
    private int empAge;
    private Long Salary;
private String dept;
    public Employee(int id, String name, int age, long salary,String dept) {
        this.empId=id;
        this.empAge=age;
        this.empName=name;
        this.Salary=salary;
        this.dept=dept;

    }
    public Employee(){}

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", Salary=" + Salary +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}

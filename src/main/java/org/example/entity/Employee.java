package org.example.entity;

import lombok.Getter;
import org.example.Exception.InvalidSalaryException;
import org.example.enumuration.Department;
import org.example.enumuration.JobLevel;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

@Getter
public class Employee {
    private final Long id;
    private String name;
    private BigDecimal salary;
    private static String companyName;
    private  Department department;
    private  JobLevel jobLevel;
    private static final AtomicLong counter = new AtomicLong(0);
    static {
        companyName = "Vois";
    }

    public Employee(String name,BigDecimal salary,Department department,JobLevel jobLevel) {
        this.id = counter.incrementAndGet();
        setName(name);
        setSalary(salary);
        setDepartment(department);
        setJobLevel(jobLevel);
    }


    public void setName(String name) {
        if(name==null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }



    public void setSalary(BigDecimal salary) {
        if(salary==null || salary.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidSalaryException("Salary must be greater than Zero");
        }
        this.salary = salary;
    }



    public void setDepartment(Department department) {
        validateEnum(department,"Department");
        this.department = department;
    }



    public void setJobLevel(JobLevel jobLevel) {
        validateEnum(jobLevel,"JobLevel");
        this.jobLevel = jobLevel;
    }

    public static String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='"+companyName+'\''+
                ", salary=" + salary +
                ", department='" + department+'\'' +
                ", jobLevel=" + jobLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private <E extends Enum<E>> void validateEnum(E value, String fieldName) {
        if (value == null) {
            throw new IllegalArgumentException(fieldName + " cannot be null");
        }
    }
}

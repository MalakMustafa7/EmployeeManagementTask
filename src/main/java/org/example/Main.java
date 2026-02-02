package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.CompanyInfo;
import org.example.entity.Employee;
import org.example.enumuration.Department;
import org.example.enumuration.JobLevel;
import static org.example.utility.EmployeeUtils.*;
import static org.example.utility.EmployeeUtils.DepartmentHelper.isTechnicalDept;
import static org.example.entity.Employee.getCompanyName;
import java.math.BigDecimal;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ahmed", BigDecimal.valueOf(20000), Department.IT, JobLevel.MID);
        Employee emp2 = new Employee("Ali", BigDecimal.valueOf(10000), Department.FINANCE, JobLevel.JUNIOR);

        displayEmployeeInfo(emp1);
        displayEmployeeInfo(emp2);

        CompanyInfo.displayInfo();
        log.info("CompanyName= {}",getCompanyName());


    }
    private static void displayEmployeeInfo(Employee emp) {
        log.info("{}",emp);
        log.info("Annual Salary: {}" , calculateAnnualSalary(emp));
        if(isHighEarner(emp)){
            log.info("{} is a high earner",emp.getName() );
        } else {
            log.info("{} is not a high earner",emp.getName() );
        }
        log.info("Is Technical Dept: {}" , isTechnicalDept(emp.getDepartment()));

        promote(emp);
        log.info("{}",emp);
        log.info("-----------------------");
    }
    }

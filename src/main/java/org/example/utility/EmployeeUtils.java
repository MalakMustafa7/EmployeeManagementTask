package org.example.utility;

import org.example.entity.Employee;
import org.example.enumuration.Department;

import java.math.BigDecimal;
import java.util.Set;

public class EmployeeUtils {

    public static final BigDecimal  THRESHOLD =BigDecimal.valueOf(15000);

    public static BigDecimal  calculateAnnualSalary(Employee emp){
        return emp.getSalary().multiply(BigDecimal.valueOf(12));
    }

    public static boolean isHighEarner(Employee emp){
        return emp.getSalary().compareTo(THRESHOLD) > 0;
    }

    public static void   promote(Employee emp){
       emp.setJobLevel(emp.getJobLevel().nextLevel());
    }

   public static class DepartmentHelper{
        private static final Set<Department> technicalDepts = Set.of(Department.IT,Department.SUPPORT);

        public static boolean isTechnicalDept(Department dept){
           return technicalDepts.contains(dept);
       }

    }



}

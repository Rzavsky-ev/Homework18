package pro.sky.Homework18.service;

import pro.sky.Homework18.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastNam);

    Employee removeEmployee(String firstName, String lastNam);

    Employee findEmployee(String firstName, String lastNam);

    Collection <Employee> showAllEmployees();
}


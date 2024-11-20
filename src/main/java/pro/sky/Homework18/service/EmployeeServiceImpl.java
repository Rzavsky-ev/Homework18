package pro.sky.Homework18.service;

import pro.sky.Homework18.model.Employee;
import pro.sky.Homework18.exceptions.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    private final int maxEmpoloyee = 20;

    public List getEmployees() {
        return employees;
    }


    @Override
    public Employee addEmployee(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            Employee obj = new Employee(firstName, lastName);
            if (employees.size() >= maxEmpoloyee) {
                throw new ArrayIsFull();
            } else if (employees.contains(obj)) {
                throw new EmployeeAlreadyAdded();
            } else {
                employees.add(obj);
                return obj;
            }
        }
        throw new ExceptionMissingData();
    }


    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            Employee obj = new Employee(firstName, lastName);
            if (!employees.isEmpty()) {

                if (employees.contains(obj)) {
                    employees.remove(obj);
                    return obj;
                } else {
                    throw new EmployeeNotFoundException();
                }
            }
            throw new ExceptionEmptySection();
        }
        throw new ExceptionMissingData();
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            Employee obj = new Employee(firstName, lastName);
            if (!employees.isEmpty()) {
                for (Employee employee : employees) {
                    if (obj.equals(employee)) {
                        return employee;
                    } else {
                        throw new EmployeeNotFoundException();
                    }
                }
            }
            throw new ExceptionEmptySection();
        }
        throw new ExceptionMissingData();
    }

    public Collection<Employee> showAllEmployees() {
        if (!employees.isEmpty()) {
            return Collections.unmodifiableList(employees);
        }
        throw new ExceptionEmptySection();
    }
}


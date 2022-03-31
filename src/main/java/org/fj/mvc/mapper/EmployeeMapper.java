package org.fj.mvc.mapper;

import org.fj.mvc.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> getAllEmployee();

    int deleteEmployee(Integer id);

    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Employee getEmployee(Integer id);
}

package case_study_furama_resort_module_2.repository;

import case_study_furama_resort_module_2.model.person.Employee;

import java.util.List;

public interface IEployeeRepo {
    List<Employee> display();
    void add(List<Employee> employeeList);
    void edit();
    void save(List<Employee> employeeList);
}

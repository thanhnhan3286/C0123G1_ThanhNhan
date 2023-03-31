package case_study_furama_resort_module_2.repository;

import case_study_furama_resort_module_2.model.person.Customer;

import java.util.List;

public interface ICustomerRepo {
    List<Customer> display();
    void add(List<Customer> customerList);
    void edit();
    void save(List<Customer> customerList);
}

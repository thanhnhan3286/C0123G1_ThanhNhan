package case_study_furama_resort_module_2.repository;

import case_study_furama_resort_module_2.model.person.Customer;
import case_study_furama_resort_module_2.util.read_and_write.ReadAndWriteCustomer;

import java.util.List;

public class CustomerRepoImpl implements ICustomerRepo{
    private static final String PATH_FILE_CUSTOMER = "src/case_study_furama_resort_module_2/data/customer.csv";
    List<Customer> customerList = ReadAndWriteCustomer.readFile(PATH_FILE_CUSTOMER);
    @Override
    public List<Customer> display() {
        return customerList;
    }

    @Override
    public void add(List<Customer> customerList) {

    }

    @Override
    public void edit() {

    }

    @Override
    public void save(List<Customer> customerList) {
        ReadAndWriteCustomer.writeFile(PATH_FILE_CUSTOMER,customerList);
    }
}

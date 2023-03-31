package case_study_furama_resort_module_2.repository;

import case_study_furama_resort_module_2.model.person.Employee;
import case_study_furama_resort_module_2.util.read_and_write.ReadAndWriteEmployee;

import java.util.List;

public class EmployeeRepo implements IEployeeRepo {
    private static final String PATH_FILE_EMPLOYEE = "src/case_study_furama_resort_module_2/data/employee.csv";
    static List<Employee> employeeList = ReadAndWriteEmployee.readFile(PATH_FILE_EMPLOYEE);
    @Override
    public List<Employee> display() {
        return employeeList;
    }

    @Override
    public void add(List<Employee> employeeList) {

    }

    @Override
    public void edit() {

    }

    @Override
    public void save(List<Employee> employeeList) {
        ReadAndWriteEmployee.writeFile(PATH_FILE_EMPLOYEE,employeeList);
    }
}

package case_study_furama_resort_module_2.util.read_and_write;

import case_study_furama_resort_module_2.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    public static List<Employee> readFile(String pathFileEmployee) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(pathFileEmployee);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        try {
            if (file.length() > 0) {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                    String[] str = line.split(",");
                    employeeList.add(new Employee(str[0], str[1], str[2], str[3], str[4], str[5],
                            str[6], str[7], str[8], str[9]));
                }
                bufferedReader.close();
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public static void writeFile(String pathFileEmployee, List<Employee> employeeList) {
        File file = new File(pathFileEmployee);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < employeeList.size(); i++) {
                bufferedWriter.write(((employeeList.get(i).getInfoToCSV())));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

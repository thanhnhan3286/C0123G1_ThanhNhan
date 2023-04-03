package case_study_furama_resort_module_2.util.read_and_write;

import case_study_furama_resort_module_2.model.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteCustomer {
    public static List<Customer> readFile(String pathFileCustomer){
        List<Customer> customerList = new LinkedList<>();
        File file = new File(pathFileCustomer);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        try{
            if(file.length()>0){
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine())!=null&&!line.equals("")){
                    String[] str = line.split(",");
                    customerList.add(new Customer(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8]));
                }
                bufferedReader.close();
                fileReader.close();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }return customerList;
    }
    public static void writeFile(String pathFileCustomer, List<Customer> customerList){
        File file = new File(pathFileCustomer);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < customerList.size(); i++) {
                bufferedWriter.write(customerList.get(i).getInfoToCSV());
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

package case_study_furama_resort_module_2.util.read_and_write;

import case_study_furama_resort_module_2.model.Contract;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReadAndWriteContract {
    private static final String PATH_FILE_CONTRACT = "src/case_study_furama_resort_module_2/data/contract.csv";
    public static Queue<Contract> readFile(){
        Queue<Contract> contractList = new LinkedList<>();
        File file = new File(PATH_FILE_CONTRACT);
        String line = null;
        try{
            if(file.length() > 0){
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                    String[] str = line.split(",");
                    contractList.add(new Contract(str[0],str[1],str[2],str[3],str[4]));
                }
                bufferedReader.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return contractList;
    }
    public static void writeFile(Queue<Contract> contractList){
        File file = new File(PATH_FILE_CONTRACT);
        try{
            BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(file));
            for (Contract contract : contractList){
                bufferedWriter.write(contract.getInforToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

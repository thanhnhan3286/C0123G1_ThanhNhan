package case_study_furama_resort_module_2.util.read_and_write;

import case_study_furama_resort_module_2.model.facility.House;
import case_study_furama_resort_module_2.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWriteHouse {
    public static Map<House,Integer> readFile(String pathFileHouse) {
        Map<House,Integer> houseMap = new LinkedHashMap<>();
        House houseList;
        int typeOfUsed;
        File file = new File(pathFileHouse);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        try {
            if (file.length() > 0) {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                    String[] str = line.split(",");
                    houseList = new House(str[0], str[1], str[2], str[3], str[4], str[5],
                            str[6],str[7]);
                    typeOfUsed = Integer.parseInt(str[8]);
                    houseMap.put(houseList,typeOfUsed);
                }
                bufferedReader.close();
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseMap;
    }

    public static void writeFile(String pathFileHouse, Map<House,Integer> houseMap) {
        File file = new File(pathFileHouse);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<House,Integer> entry : houseMap.entrySet()) {
                bufferedWriter.write(entry.getKey().getInfoToCSV()+","+entry.getValue());
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

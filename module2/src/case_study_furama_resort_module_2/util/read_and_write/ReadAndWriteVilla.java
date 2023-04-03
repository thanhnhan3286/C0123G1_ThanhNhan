package case_study_furama_resort_module_2.util.read_and_write;

import case_study_furama_resort_module_2.model.facility.Villa;


import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteVilla {
    public static Map<Villa, Integer> readFile(String pathFileVilla) {
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        Villa villaList;
        int typeOfUsed;
        File file = new File(pathFileVilla);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        try {
            if (file.length() > 0) {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                    String[] str = line.split(",");
                    villaList = new Villa(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7]);
                    typeOfUsed = Integer.parseInt(str[8]);
                    villaMap.put(villaList,typeOfUsed);
                }
                bufferedReader.close();
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaMap;
    }

    public static void writeFile(String pathFileVilla, Map<Villa,Integer> villaMap) {
        File file = new File(pathFileVilla);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa,Integer> entry:villaMap.entrySet()) {
                bufferedWriter.write(entry.getKey().getInfoToCSV() + ","+entry.getValue());
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

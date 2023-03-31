package case_study_furama_resort_module_2.util.read_and_write;

import case_study_furama_resort_module_2.model.facility.Villa;
import ss16_stream.bai_tap.doc_file_csv.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteVilla {
    private static final String PATH_FILE_VILLA = "src\\case_study_furama_resort_module_2\\data\\villa.csv";

    public static List<Villa> readFile() {
        List<Villa> villasList = new ArrayList<>();
        File file = new File(PATH_FILE_VILLA);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                villasList.add(new Villa(str[0], Double.parseDouble(str[1]), Double.parseDouble(str[2]),
                        Integer.parseInt(str[3]), str[4], str[5], Double.parseDouble(str[6]),
                        Integer.parseInt(str[7])));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villasList;
    }

    public static void writeFile(List<String> strList, boolean append) {
        File file = new File(PATH_FILE_VILLA);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < strList.size(); i++) {
                bufferedWriter.write(strList.get(i));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

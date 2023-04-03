package case_study_furama_resort_module_2.util.read_and_write;

import case_study_furama_resort_module_2.model.facility.House;
import case_study_furama_resort_module_2.model.facility.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWriteRoom {
    public static Map<Room, Integer> readFile(String pathFileRoom) {
        Map<Room, Integer> roomMap = new LinkedHashMap<>();
        Room roomList;
        int typeOfUsed;
        File file = new File(pathFileRoom);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        try {
            if (file.length() > 0) {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                    String[] str = line.split(",");
                    roomList = new Room(str[0], str[1], str[2], str[3], str[4], str[5], str[6]);
                    typeOfUsed = Integer.parseInt(str[7]);
                    roomMap.put(roomList, typeOfUsed);
                }
                bufferedReader.close();
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomMap;
    }

    public static void writeFile(String pathFileRoom, Map<Room, Integer> roomMap) {
        File file = new File(pathFileRoom);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Room, Integer> entry : roomMap.entrySet()) {
                bufferedWriter.write(entry.getKey().getInfoToCSV() + "," + entry.getValue());
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

package case_study_furama_resort_module_2.util.read_and_write;

import case_study_furama_resort_module_2.model.Booking;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteBooking {
    public static Set<Booking> readFile(String pathFile) {
        Set<Booking> bookingSet = new TreeSet<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        try {
            if (file.length() > 0) {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                    String[] str = line.split(",");
                    bookingSet.add(new Booking(str[0], str[1], str[2], str[3], str[4], str[5]));
                }
                bufferedReader.close();
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bookingSet;
    }
    public static void writeFile(String pathFile, Set<Booking> bookingSet){
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter =null;
        try{
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking booking : bookingSet) {
                bufferedWriter.write(booking.getInfoToCSV());
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

package ss16_stream.bai_tap.doc_file_csv;

import java.util.List;
import java.util.Scanner;

public class MainCountry {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        String linkFile = "src/ss16_stream/bai_tap/doc_file_csv/Countres.csv";
        List<Country> countries = readFile.readFile(linkFile);
        for (Country c:countries) {
            System.out.println(c);
        }
    }
}

package ss16_stream.bai_tap.copy_the_file;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadAndWrite readAndWriteFile = new ReadAndWrite();
        System.out.println("Nhập đờng dẫn File muốn copy ");
        String fileCopy = sc.nextLine();
        System.out.println("Nhập đường dẫn File muốn paste");
        String filePaste = sc.nextLine();
        List<String> str = readAndWriteFile.readFile(fileCopy);
        readAndWriteFile.writeFile(filePaste, str,false);
    }
}

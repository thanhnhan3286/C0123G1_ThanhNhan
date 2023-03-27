package ss17_io_binary_file_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CopyFileBinary {
    public static List<String> readFileBinary(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        String str = "";
        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                int i = -1;
                while ((i = fileInputStream.read()) != -1) {
                    str += (char) i;
                }
                objectInputStream = new ObjectInputStream(fileInputStream);
                stringList = (List<String>) objectInputStream.readObject();
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static void writeListStringToFileDat(String pathFile, List<String> stringList) {
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            if (file.length() > 0) {
                fileOutputStream = new FileOutputStream(file);
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(stringList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String source = "src\\ss17_io_binary_file_serialization\\bai_tap\\copy_file_nhi_phan\\SourceFile.dat";
        String target = "src\\ss17_io_binary_file_serialization\\bai_tap\\copy_file_nhi_phan\\TargetFile.dat";
        writeListStringToFileDat(target, readFileBinary(source));
    }
}
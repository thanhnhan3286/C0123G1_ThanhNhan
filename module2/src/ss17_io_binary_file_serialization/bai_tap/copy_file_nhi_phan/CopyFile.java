package ss17_io_binary_file_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;

public class CopyFile {
    public static String readFile(String pathFile) {
        File file = new File(pathFile);
        String str = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i;
            while ((i = fileInputStream.read()) != -1) {
                str += i;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
    public static void writeFile(String pathFile, String line){
        File file = new File(pathFile);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bytes = line.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                fileOutputStream.write(bytes[i]);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String source = "src\\ss17_io_binary_file_serialization\\bai_tap\\copy_file_nhi_phan\\SourceFile.dat";
        String target = "src\\ss17_io_binary_file_serialization\\bai_tap\\copy_file_nhi_phan\\TargetFile.dat";
        writeFile(target,readFile(source));
    }
}

package ss17_io_binary_file_serialization.thuc_hanh.copy_cac_file_co_dung_luong_lon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    private static void copyFileUsingJava7File(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        String sourcePath ="src/ss17_io_binary_file_serialization/thuc_hanh/copy_cac_file_co_dung_luong_lon/test" ;
        String destPath ="src/ss17_io_binary_file_serialization/thuc_hanh/copy_cac_file_co_dung_luong_lon/copy" ;
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
//            copyFileUsingJava7File(sourceFile,destFile);
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("đã xong");
        } catch (IOException e) {
            System.out.println("ko copy được");
            throw new RuntimeException(e);
        }

    }
}

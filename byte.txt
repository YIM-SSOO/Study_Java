package java03.day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIO {
    //Byte 단위 입출력
    public static void main(String[] args) {
        FileInputStream fis = null;  // 파일을 읽기위한 객체
        FileOutputStream fos = null; // 파일을 쓰기위한 객체
        try {
            fis = new FileInputStream("src/java03/day05/ByteIO.java");
            fos = new FileOutputStream("byte.txt");

            int readData = -1;
            while ((readData = fis.read()) != -1) {
                fos.write(readData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package JavaStudy.day0719;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIO {

    public static void main(String[] args) {

        //method started time(메소드가 시작된 시간을 구하기)
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis =  new FileInputStream("src/JavaStudy/day0719/ByteIO.java");
            fos = new FileOutputStream("bytes.txt");

            int readCount = -1;
            byte[] buffer = new byte[512];

            while((readCount = fis.read(buffer)) != -1){
                fos.write(buffer, 0, readCount); // readCount만큼 쓰기
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                fos.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                fis.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        //method finished time(메소드가 끝났을때 시간 구하기)
        long endTime = System.currentTimeMillis();
        //method performed time(매소드가 수행된 시간 구하기)
        System.out.println("메소드가 수행된 시간 >> " + (endTime-startTime));
    }

}

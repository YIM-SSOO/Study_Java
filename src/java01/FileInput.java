package java01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {

        // 파일 읽기

        //원시자료형을 제외한 나머지는 모두 null 값을 가질 수 있다.
        //FileInputStream은 파일로부터 데이터를 읽어서 이것을 입력소스로 사용할 수 있게 해주는 타입.
        FileInputStream inputStream = null;

        {
            try {
                //inputStream = new FileInputStream("src/chicken.txt");
                inputStream = new FileInputStream("src/acrony.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            Scanner scanner = new Scanner(inputStream);

            //다음 줄이 존재하는지 판단
            // 다음줄이 존재 == true 반환
            // 그렇지 않다면 == false
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);

            }


           /*
            //scnner.nextLine()을 이용해서 데이터를 한줄 읽어보고, 출력
            String line = scanner.nextLine();
            System.out.println(line);
            String line2 = scanner.nextLine();
            System.out.println(line2);

            하지만 이 방법은 내가 문서에 몇줄이 있는 지 모르기때문에 예외가 발생할 수 있다.
            그렇기때문에 반복문을 활용해서 다시 해보자.
            */
        }
    }
}

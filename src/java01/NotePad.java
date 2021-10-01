package java01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotePad {

    // 간단 메모장 만들기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("원하는 작업 번호를 입력해주세요.");
            System.out.println("1. 메모 읽기");
            System.out.println("2. 새 메모");
            System.out.println("3. 종료");

            // 사용자로부터 입력 받은 작업 번호를 저장할 변수 선언
            int taskNum;


            // try 블록안에서 사용자의 입력을 받아
            // 이 입력값을  정수로 변환해 taskNum에 대입한다.
            try {
                String input = scanner.nextLine();
                taskNum = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
                // continue를 이용하여 반복문의 처음으로 돌아간다.
                continue;

            }

            // 메모 읽기
            if (taskNum == 1) {
                System.out.println("메모 파일명을 입력해주세요");

                //사용자로부터 메모 파일명 입력받기 
                String fileName = scanner.nextLine();

                //파일을 읽기 위해서 FileInputStream을 선언
                FileInputStream inputStream = null;
                try {
                    // FileInputStream 생성 
                    // -> 그리고 사용자가 입력한 파일명을 FileInputStream에  첫번째 인자로 전달
                    inputStream = new FileInputStream(fileName);

                } catch (FileNotFoundException e) {
                    //파일이 존재하지 않을때 출력메세지
                    System.out.println("파일이 존재하지 않습니다.");
                    continue;
                }
                System.out.println(fileName + "의 내용을 출력합니다.");
                // 파일의 내용을 읽기위해서 Scanner를 하나 더 생성
                // 그리고 Scanner의 입력 소스로 방금 만든 inputStream을 넘겨준다.
                Scanner reader = new Scanner(inputStream);

                // reader에 다음 줄이 있는 동안
                while (reader.hasNextLine()) {
                    // 한줄씩 읽어서 출력
                    System.out.println(reader.nextLine());
                }
                // 다 읽어서 출력했으면 줄바꿈 처리해주고
                System.out.println("\n");
                // 리더의 클로즈를 이용해서 fileInputStream을 닫아준다.
                reader.close();
            }

            //메모 쓰기
            else if (taskNum == 2) {
                System.out.println("저장할 메모 파일명을 입력하세요.");

                //사용자로부터 메모 파일명을 입력받기
                String fileName = scanner.nextLine();

                //파일 쓰기를 위해서 FileWriter를 하나 선언.
                FileWriter writer = null;

                try {
                    //사용자가 입력한 파일명을 FileWriter의 인자로 넘겨준다.
                    writer = new FileWriter(fileName);
                } catch (IOException e) {
                    //FileWriter 생성에 실패한 경우 메세지 출력
                    System.out.println("파일 생성에 실패했습니다.");
                    //반복문의 처음으로 다시 돌아간다.
                    continue;
                }
                //정상적으로 FileWriter가 생성되면 메세지 출력
                System.out.println("메모할 문자열을 입력하세요");

                System.out.println("종료는 빈줄에서 엔터를 입력해주세요!");

                //사용자의 입력
                while (true) {
                    //사용자로부터 문자열을 한줄씩 입력받기
                    String input = scanner.nextLine();

                    //만일, 사용자가 빈줄을 입력했다면
                    if (input.equals("")) {
                        break;
                    }
                    try {
                        writer.write(input);
                        writer.write("\n");
                    } catch (IOException e) {
                        System.out.println("파일에 문자열을 쓰지 못했습니다.");
                    }
                }

                try {
                    //사용자 입력이 끝나면
                    writer.close();
                } catch (IOException e) {
                    System.out.println("파일을 닫는데 실패했습니다.");
                }
            }
            else if(taskNum == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FIleOutPut {

    public static void main(String[] args) {

        // 파일 쓰기
        // 파일이 생성 후 작성이 잘 됨.

        //
        FileWriter writer = null;

        try {

            //writer = new FileWriter("src/output01.txt");
            // 데이터를 계속 추가하고 싶은 때는  true 옵션을 사용
            //  프로그램을 실행할 때마다 파일의 뒤에 우리가 썼던 문자열들이 계속 추가 된다.
            writer = new FileWriter("src/output01.txt", true);
        } catch (IOException e) {
            //에러를 출력해주는
            System.out.println("파일 생성에 실패하였습니다.");
            //정상종료가 되지 않았을때 1이 출력된다.
            System.exit(1);
        }

        //만약 사용자가 입력한 문자열을 파일에 쓰고 싶다면?
        Scanner scanner = new Scanner(System.in);
        System.out.println("종료하시려면 입력없이 엔터를 눌러주세요!");

        while(true) {
            String input = scanner.nextLine();

            //입력 값이 없으면
            if(input.equals("")){
                System.out.println("파일 입력을 종료합니다.");
                break;
            }

            try {
                //입력받은 글은 줄바꿈 처리 
                writer.write(input + "\n");
                // writer.write("치킨은 살 안쪄요.\n"); // 줄바꿈 \n
                //writer.write("내가 쪄요.");
                //FileWriter를 사용할 때는 꼭 다 사용 후 close()를 해줘야한다.

            } catch (IOException e) {
                System.out.println("파일에 데이터를 쓰는 데에 실패했습니다.");
                System.exit(2);
            }
        }
        try{
            writer.close();

        }catch (IOException e){
            System.out.println("파일 닫기에 실패했습니다.");
        }
    }
}

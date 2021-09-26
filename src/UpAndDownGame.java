import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {

    public static void main(String[] args) {


        System.out.println("업 앤 다운 게임을 시작합니다.");

        System.out.println("지금부터 제가 0에서 255 사이에서 숫자를 하나 뽑겠습니다.");
        System.out.println("여러분은 제가 뽑은 숫자를 맞춰보세요!");

        Random random = new Random();

        //뽑을 숫자 범위
        int randomNumber = random.nextInt(256);
        //사용자 입력
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            // 총 횟수 8번 i가 증가하는 수 만큼 횟수가 감소
            System.out.println(8 - i + "번의 기회가 있습습니다.");

            System.out.println("추측한 숫자를 입력해주세요!");
            String input = scanner.nextLine();
            int guess = Integer.parseInt(input);

            if (randomNumber == guess) {
                System.out.println("짝짝짝! 저를 맞추시다니 멋져요!");
                break;
            } else if (randomNumber < guess) {

                System.out.println("제가 생각한 숫자보다는 작아요!");
            } else {
                System.out.println("제가 생각한 숫자보다 크네요!");
            }

            if (i == 7) {
                System.out.println("더 이상 기회가 남지 않았습니다. ㅠㅠ");
            }
        }//for End

        System.out.println("게임을 종료합니다.");

    }
}

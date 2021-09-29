import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("달러 환율을 입력하세요");

        String exchangeString = scanner.nextLine();

        try {
            System.out.println(" 음식 값을 입력해주세요 .");
            String food = scanner.nextLine();
            double exchange = Double.parseDouble(exchangeString);

            double price = Double.parseDouble(food);
            System.out.println("음식은 " + price / exchange + "달러입니다.");


        } catch (Exception e) {
            System.out.println("숫자로 입력해주셔야 합니다.");
        }
    }


}

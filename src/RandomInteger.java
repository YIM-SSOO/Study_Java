import java.util.Random;

public class RandomInteger {

    public static void main(String[] args) {

        //난수 생성
        Random random = new Random();
        
        // 임의의 숫자 범위 (265미만(255까지))
        int randomNumber = random.nextInt(256);
        System.out.println(randomNumber);
    }
}

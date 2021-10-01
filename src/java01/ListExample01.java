package java01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListExample01 {

    public static void main(String[] args) {

        // 문자열를 계속해서 입력받아 중복되지 않는 문자열들만 입력한 후에
        // 프로그램이 종료될 때, 목록을 출력해주는 코드

        System.out.println("저장할 음식 이름을 입력.(종료:0)");

        // 문자열 리스트를 만들고
        List<String> foods = new ArrayList<>();

        //사용자 입력
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String food = scanner.nextLine();
            // 문자열이 0인 경우, 종료
            if (food.equals("0")) {
                break;
            }
            // 만약, 리스트안에 입력 받은 값이 있으면,
            // 이미 목록에 있다고 출력
            if (foods.contains(food)) {
                System.out.println("이미 목록에 있습니다.");
            } else {
                // 만약 입력 받은 적이 없는 값이라면 목록에 추가
                foods.add(food);
            }

        }
        // 리스트를 정렬해주는 Collections
        // sort() 리스트를 오름차순으로 정렬 가나다라
        Collections.sort(foods);

        // reverse() 내림차순 정렬 하파타카
        Collections.reverse(foods);

        // 목록을 랜덤한 순서로 섞는 shuffle()
        Collections.shuffle(foods);


        //while문이 종료 되면, 저장된 목록을 출력
        System.out.println(foods);
        // 랜덤하게 해서 한개를 추천 받기
        System.out.println("음식 추천:" + foods.get(0));
    }
}

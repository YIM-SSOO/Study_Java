package java01;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        //중복 값을 허용하지 않는 set

        // Set 변수 선언 - 제너릭 타입
        // Set과 부모자식 관계인 HashSet<>()
        Set<String> myFavoriteFoods = new HashSet<>();

        //set에도 List와 동일하게 add라는 메소드가 있다.
        // 중복 값을 허용하지 않으므로 치킨, 피자가 한번씩 들어간다.
        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("피자");

        // 애시당초 중복값을 허용하지 않기 때문에  remove()를 사용하면
        // 치킨이란 값을 삭제되고 피자만 출력된다.
        myFavoriteFoods.remove("치킨");

        System.out.println(myFavoriteFoods);
    }
}

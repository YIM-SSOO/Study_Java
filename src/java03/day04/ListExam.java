package java03.day04;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

    public static void main(String[] args) {
        // List 선언  제너릭을 이용해서 String 값만 담을 수 있도록 정의
        // List도 인터페이스이기때문에  리스트가 인스턴스가 될 수 없다.
        // 이런 리스트를 구현하고 있는 가장 많이 사용되는 ArrayList<>()를 생성
        List<String> list = new ArrayList<>();
        // 리스트에 데이터를 넣기
        list.add("KIM");
        list.add("HONG");
        list.add("KIM");

        // 리스트에 저장된 자료의 수를 출력받을 수 있는 size() 호출
        // 이런 size()는 리스트 부모인터페이스인 콜렉션인터페이스가 가지고 있는 메소드.
        System.out.println(list.size()); // 출력 : 3 - 리스트는 똑같은 값이 중복되게 들어갈 수 있다

        // 리스트에서 값을 꺼내오기
        // 리스트는 순서가 있는 자료구조이기때문에
        // 인덱스를 이용해서 값을 꺼내올 수 있다.
        // index를 이용할 수 있도록 For문을 지정
        // list의 사이즈만큼 반복하면서 값을 꺼내오게 할 수 있게된다.
        for (int i = 0; i < list.size(); i++) {
            // 리스트에서 값을 꺼낼 때는 list.get()를 사용
            // 여기에 index 값을 넣어주면 그러면 0번째 인덱스부터 시작해서 값을 가져올 것이다.
            // String값이 들어가 있었고 String 값을 꺼내올 것이니깐
            // get이라는 메소드를 사용해서 꺼내온 값을 String 변수 str이 받아준다.
            String str = list.get(i);

            // 그 값을 출력
            System.out.println(str);

        }
    }
}
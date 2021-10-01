package java01;

import java.util.*;

public class ListExample02 {

    public static void main(String[] args) {

        // 문자열을 담는 목록
        //List<String> names = new ArrayList<>();


        //값을 하나하나 추가하려면 일일히 입력해야하는 불편함이 있다.
        // 이것을 편리하게 목록을 초기화 하는 방법이 있다. ==> 이중 하나는 배열을 리스트로 만드는 것이다.
        //names.add("보아");
        //names.add("윤아");
        //names.add("미주");
        //names.add("사랑");

        // 배열을 리스트로 만들기
        // asList() - 배열을 리스트로 바꿀수 있다. (사용법 2가지가 있음)

        // 1. 각요소들을 asList()의 인자로 하나하나 넣어주는 방법
        List<String> names = Arrays.asList("보아", "윤아", "아이유", "미주");
        System.out.println(names);

        //2. asList()의 인자로 배열변수를 넣어주는 방법이 있다.


    }
}

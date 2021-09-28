import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        //Map이란 키와 값이 쌍으로 이루어진 자료구조


        // 영한사전 만들기

        // Map 선언
        // Map도 제너릭 타입이지만 List와 Set와는 조금 다르다.
        // Map의 경우, 키로 쓰일 타입과 값으로 쓰일 두가지 모두를 명시해야한다.
        Map<String, String> dictionary = new HashMap<>();

        // map에 값을 넣을때는 put() -> put()의 첫번째 인자로 키를 입력, 두번째 인자로 값을 입력
        dictionary.put("chicken", "닭");
        dictionary.put("pizza", "피자");

        //List와 Set과는 달리 'chicken=닭이다' 라는 관계를 표현해준다.
        // 이렇게 데이터가 목록으로 들어가 있다면 가져다 쓸 방법이 필요하다.
        System.out.println(dictionary);

        //Map에도 get()이라는 존재
        // get()의 첫번째 인자로 키를  입력하게되면 그에 해당하는 값을 반환하게 되어있다.
        // 출력 결과 === > 닭
        // 만약 없는 것을 키로 사용하면 null을 반환한다.
        System.out.println(dictionary.get("chicken"));

    }
}

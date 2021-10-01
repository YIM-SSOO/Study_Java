package java01;

import java.util.*;

public class DictionaryFor {
    public static void main(String[] args) {
        //영한사전 만들기

        Map<String, String> dictionary = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        //데이터 넣기
        dictionary.put("chicken", "닭");
        dictionary.put("pizza", "피자");

        //데이터 빼기
        // 1. put()를 이용해 특정키의 값을 null로 반환해주기
        // 이런 방법은 chicken을 null로 반환시켰기때문에 사전에 존재하지 않는다고 출력되지만
        // 값을 제거해도 프로그램을 실행하면 여전히 두개의 값이 있다고 출력이 되는 문제가 있다.
        //dictionary.put("chicken", null);

        // 2. 확실하게 제거하기 - remove()
        // remove() 첫번째 인자로 키 값을 넣어주면 된다.
        //dictionary.remove("chicken");

        // Map이 비었는지를 확인하는 isEmpty()
        if (dictionary.isEmpty()) {
            System.out.println("단어가 존재하지 않습니다.");
            //프로그램을 바로 종료시키기
            System.exit(0);
        } else {
            //목록의 개수를 반환해주는 size()
            System.out.println(dictionary.size() + "개의 단어가 있습니다.");
        }

        //Map을 반복문에 적용하는 방법
        // Map은 List와 Set과는 달리 값만을 저장하는 것이 아니고
        // 키와 값을 같이 가지고 있기때문에
        // 키의 목록만 가져오는 방법
        // 값의 목록만 가져오는 방법이 별도로 있다.

        //1. 키의 목록만 가져오는 방법
        // keySet()
        //Collection<String> keys = dictionary.keySet();

        //List와 Set과 동일하게 Collection을 Foreach에 적용할 수 있다.
       /* for(String english :  keys){
            // 키를 알고 있다면, 값도 가져올 수 있다.
            String korean = dictionary.get(english);

            System.out.println(korean);
        }*/
        //2. 값의 목록만 가져오는 방법
        // valuse() - 반환되는 타입이 Collection, List와 Set의 아버지쯤 되는 타입으로 거의 동일하게 사용가능하다.
        // Collection<String> values = dictionary.values();

        //entrySet() - Set을 반환하는 데, Set이 가지고 있는 타입이 Entry라는 것이다.
        // Entry는 Map에서 가지고 있는 키/값 쌍 하나를 말한다.
        // 이렇게 Entry를 호출하게 되면 Collenction이 아닌 Set을 받아야한다.
        //그리고 Set이 가지고 있는 값은 Entry(java.util.Map)라는 타입이고,
        // Map.Entry 또한 키의 타입과 값의 타입을 명시해주어야한다.
        Set<Map.Entry<String, String>> enteries = dictionary.entrySet();

        //forEach문 안에서 사용될 요소의 이름도 Entry로 변경
        for (Map.Entry<String, String> entry : enteries) {
            //키 값 가져오기
            String english = entry.getKey();
            // 값 가져오기
            String korean = entry.getValue();

            System.out.println(english + ": " + korean);
        }

    }
}

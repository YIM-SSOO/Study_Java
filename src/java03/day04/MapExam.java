package java03.day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {

        // Map생성
        // 키와 밸류도 제너릭을 이용해서 값을 지정할 수 있다.
        Map<String, String> map = new HashMap<>();

        // 이 맵에는 값을 저장할 때 키와 밸류가 쌍으로 저장되어야하기때문에
        // put()
        map.put("001", "KIM");
        map.put("002", "HONG");
        map.put("003", "JIM");

        // 같은 키 값은 중복된 값은 안된다. 체크
        map.put("001", "kang");

        // 맵에 들어있는 데이터의 저장되는 자료의 수가 몇개인지 알 수 있다.
        System.out.println(map.size()); // 출력 : 3 -

        // 어떤 데이터가 있는지 확인

        // 1. 하나씩 꺼내기
        // get메소드를 이용해서 이때 꺼내고 싶은 key값을 넣어주면 된다.
        System.out.println(map.get("001")); // 출력 :  kang
        // kang으로 출력되는 이유
        // 같은 키로 값이 또 들어왔을 때 맵은
        // 기존에 있었던 값을 새로 들어온 값으로 바꾼다
        // 그래서 마지막으로 들어온 kang이라는 값이 저장되어 있는것을 알 수 있다.

        // 2. 맵이 가지고 있는 모든 key값을 꺼내고 싶다
        // keySet() - 키만 꺼내서 Set자료구조에 넣어주는 것이다.
        // keySet의 리턴타입이 Set이였으므로 Set이라고 사용
        // Set에 담을때 모두 String타입이므로 제너릭해주면 된다.
        Set<String> key = map.keySet();

        // key를 갖고 있는 Set을 Iterator를 이용해서 꺼내주면
        // key 값들을 모두 차례대로 꺼낼 수 있다.
        // key값을 이용하면 우리는 value값을 얻어낼 수 있다.

        // key가 가지고 있는 iterator메소드를 이용
        Iterator<String> ite = key.iterator();
        while (ite.hasNext()) {
            String keys = ite.next();
            // 키 값을 받아서 맵이 가지고 있는 get이라는 메소들 이용해서 key를 넣어준다.
            String value = map.get(keys);
            System.out.println(keys + ": " + value);
        }

    }
}

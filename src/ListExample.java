import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        //List : 배열과 같은 순서를 가진 목록형 자료
        // List가 배열보다 편한 이유는 요소를 마음대로 추가/제거 할 수 있고
        // 여러가지 메서드를 제공한다.


        // List 선언 방법

        //1.  List<목록에 담을 타입>
        // == List와 같은 제네릭타입들은 int같은 원시 자료를 허용하지 않기때문에 꼭 Integer라는 레퍼타입을 사용해줘야한다.
        // new 키워드를 이용해 리스트를 생성할껀데, 여기서 중요한것은 리스트는 일종의 모양새를 정의하는 껍데기 같은 것이다. 그래서 직접 생성해서 사용할 수 없다.
        //그래서 리스트의 모양을 그대로 따르는 ArrayList라는 것을 사용한다.
        List<String> list = new ArrayList<>();

        //2. 똑같지만 다른 방법, ArrayList<>()의 <>안에 리스트에 담을 타입과 동일한 타입을 명시해주는 방법
        //List<Integer> list2 = new ArrayList<Integer>();

        //3. 변수 선언자체를 List가 아니고 ArrayList로 하는 방법
        //ArrayList<Integer> list3 = new ArrayList<>();
        //이렇게 List와 ArrayList와 같은 관계를 부모자식관계에 비유한다.
        //변수 선언을 부모타입으로 하고  각 생성을 자식 타입으로 하면 한가지 모양새에 대한 여러가지 구현체를 사용할 수 있다.

        list.add("치킨");
        list.add("피자");

        // 이 List에서 요소를 제거하려면 remove()를 사용할 수 있다.
        // remove() 2가지 사용법
        // 1. 값을 그대로 넣는 방법
        //list.remove("치킨");
        //2. 인덱스를 넣어주는 방법
        //list.remove(0);

        // List의 값을 변경해주는 메서드 - set()
        // set(첫번째인자 요소의 번호, 두번째 인자 - "값")
        list.set(1, "치킨");

        //List에서 요소 하나만 가져다 쓰기 위해서 쓰는 메서드 - get()
        // System.out.println(list);
        System.out.println(list.get(0));


    }
}

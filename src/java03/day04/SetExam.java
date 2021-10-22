package java03.day04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

    public static void main(String[] args) {

        //1. HashSet을 인스턴스로 만들어보자
        // Set은 인터페이스이기때문에 new해서 객체를 생성할 수 없다
        // Set을 구현한 클래스인 HashSet이용해서 인스턴스를 만든다.
        Set<String> set1 = new HashSet<>(); // String 값만 담을 수 있음.
        Boolean flag1 = set1.add("Hong"); // add를 활용해서 값을 저장
        Boolean flag2 = set1.add("Kim");
        Boolean flag3 = set1.add("Hong");

        // set이라는 자료구조의 크기가 얼마냐를 출력
        // size() 이용
        System.out.println(set1.size()); // 출력:  2  이유 -  같은 값이 있었기 때문이다.

        // 저장할때 반환했던 Boolean 값 출력
        System.out.println(flag1); //true
        System.out.println(flag2); //true
        System.out.println(flag3); //false -> 같은 값이 또 들어갔을 때는 false를 반환

        // set 자료 구조에서 이 들어있는 값들을 하나씩 하나씩 꺼내보기위해서는
        // set에 부모클래스인 컬렉션이 가지고 있는 lterator라는 인터페이스를 이용해야지만 한다.
        // set으로부터 Iterator를 구한다.

        // literator 인터페이스 이용
        Iterator<String> iter = set1.iterator(); // iterator 인터페이스를 구현한 객체가 리턴된다.

        // 이때 여기에 들어있는 값을 하나씩 꺼낼 때에는
        // iterator는 hasNext라고 하는 메소드를 가지고 있는데
        // 이 메소드는 지금 현재 set의 자료구조에 데이터가 있니?라고 물어봐서
        // 있으면 true, 없으면 false를 반환해주는 메소드이다.
        // 값을 다 꺼낼 때 인덱스가 필요한게 아니기 때문에
        // for 구문보다는 while문을 활용하면 된다.


        // iterator가 제공하고 있는 hasNext()라는 메소드를 이용하게되면
        // 데이터가 있는 동안만 true를 리턴할것이기 때문에 데이터를 모두 꺼내올 수 있다.

        while(iter.hasNext()){
            // iterator가 가지고 있는 next()
            // 해당 메소드는 값을 꺼내줘라는 메소드
            // 하나를 꺼내주고 하나를 꺼내면 자동으로 다음 것을 참조하게 된다.
            String str = iter.next(); // String 값을 가지고 있었기 때문에 string 타입으로 값을 꺼내준다.
            System.out.println(str);
        }

    }
}

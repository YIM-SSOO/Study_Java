package java03.day01;

import java.util.Objects;

public class Student {
    //이름
    String name;
    //학번
    String number;
    //생년
    int birthYear;


    // 단축키 - Alt + insert
    // Generate Equals and Hashcode()
    @Override
    public boolean equals(Object o) { //메소드의 파라미터로 들어온 오브젝트와 자신과 비교한다
        // this와 obj가 같다면, 참조가 같은 것을 의미하므로 무조건 같다.
        if (this == o) return true;

        // 또한 인자로 들어온 obj가 null이라면 비교할 필요도 없이 false라는 것을 알 수 있다.
        if (o == null || getClass() != o.getClass()) return false;

        // obj를 Student로 형변환한 후에 자신의 number와
        Student student = (Student) o;
        // obj의 number를 비교해서 같으면 true를 반환
        // 같지 않다면 false 를 반환
        return birthYear == student.birthYear && name.equals(student.name) && number.equals(student.number);
    }

    @Override
    public int hashCode() {
        /*
            해시코드를 구하는 것은 일종의 수학식이다.
            되도록 유일하지 않은 값을 반환하도록 한다.
            소수중의 하나인 31값과 특정수를 몇개 곱하여 만든다.
            해시코드를 구하는 방법은 자동으로 만들어진 코드 말고도
            알고리즘 공부를 통해 가능하다.
        */
        return Objects.hash(name, number, birthYear);
    }

    // toString() 활용  - 단축키 Alt + insert
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.number = "1234";
        s1.birthYear = 1995;

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.number = "1234";
        s2.birthYear = 1995;

        if (s1.equals(s2)) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


        //toString()
        System.out.println(s1); // toString()이 아닐경우 주소 값이 출력된다. ==> toString()을 활용하면 Json형태로 출력
        System.out.println(s1.toString()); // 이 방법으로도 toString()


    }

}

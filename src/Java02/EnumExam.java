package Java02;

public class EnumExam {

    //열거형
    // 자바는 열거타입을 이용하여 변수를 선언할 때 변수타입으로 사용할 수 있다.


    // JDk 5 이전에는 상수를 열거형 대신으로 사용했다.
    // 이전 상수를 활용했던 방법
    // 상수 선언 final, 대문자로 하는 것이 관례
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {

        // 여성 또는 남성  둘 중에 한가지 값만 가지게하고 싶다면?
        String gender1;

        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;


        // 아래와 같이 하면 gender1은 String이기만하면 컴파일에는 문제는 없다
        // 하지만 누가 여성이 아닌 남자가 들어와도 들어와지는 문제가 생긴다.
        // 이런 문제가 발생하지 않도록 하기위해 열거형을 사용한다.
        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        // gender2 = "boys"; // 에러 발생 - 다른값은 저장할 수 없기때문에, 즉.  특정 값만 가져다 써야한다면 이때 열거형을 사용한다.
    }
}
// 열거형 사용하기
// 선언 방법 - enum 이름 {값1, 값2 ; }
enum Gender{
    MALE,FEMALE;
}
package Java02;

public class InnerExam1 {
    // 내부클래스를 static 하게 선언
    static class Cal {

        int value = 0;

        public void plus() {
            value++;
        }
    }

    public static void main(String[] args) {
        // 이때 이 Cal 은 정적인 필드와 같기 때문에 아까와는 다르게 사용해야한다.
        // 아까는 Cal이라는 내부클래스에 접근하기 위해서 외부에 있는 이너이그잼을 반드시 먼저 생성한다음에 접근했어야했다
        // static한 필드이기때문에 생성할 필요가 없다.
        InnerExam1.Cal cal = new InnerExam1.Cal();

        cal.plus();
        System.out.println(cal.value);
    }
}

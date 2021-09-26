public class ArrayFor01 {

    public static void main(String[] args) {
        //배열의 특정요소 바꾸기

        //배열 선언
        String[] days ={"월", "화","수","목","금","토","일"};

        days[0] = "일";

        //반복문 
        // i가 days.length보다 작을때까지
        for(int i = 0; i < days.length; i++)
            //days의 i번째를 출력
            System.out.println(days[i] + "요일");

        // => 월, 화 .. 이 출력된다.
    }
}

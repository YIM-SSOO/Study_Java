package Java02;

public class While {

    public static void main(String[] args) {

        // While 문 : 반복문은 실행문을 반복적으로 실행해야할 때 사용한다.
        // 반복문은 어떠한것을 반복적으로 사용하고 싶을 때
        // 종류 : while 문, do-while 문, for 문


        //  while :  조건문의 실행 결과가 true일 동안 반복해서 실행한다.
        //  while (true){


        // 10번 반복하면서 0부터 9까지 출력하는 반복문
        /*int i = 0;

        while (i < 10) { // 조건 -  i가 10보다 작을 때까지

            System.out.println(i); // 무한루프 상태가 되버림. 00000000...이기때문에 조건에서 나올 수 가 없음

            i++; // 증감 연산자로 i = i + 1과 같다.   => 01231456789까지 출력. 그리고 while문을 만족시키기 때문에 빠져나갈 수 있다.

        }*/

        // 1부터 100까지 계속 돌면서 합을 구하기

        int total = 0;  //합계를 담을 변수
        int i = 1;     //증가시킬 변수

        while (i <= 100) { //i가 100보다 작거나 같을 때까지

            // 합계 구하기
            // 합계를 담을 수 잇는 total이라는 변수에다가 값을 계속 누적시켜줘야한다.
            // 누구를 누적시키냐면 i  => 그래야지 i가 0일때 +1,+2...로 계속 누적시킬 수 있다.
            total = total + i;
            i++; // 수행이 될때마다 i라는 값을 1씩 증가시킨다.

        }
        // while문이 끝까지 수행되고 난 다음 total 값을 출력
        System.out.println(total);


        // 조건자체를  true 로 주어질 때
        // 조건문 if문을 실행해서 while문을 빠져나갈 수 있게 한다.

        while (true) { //무한루프
            System.out.println("hello");
        }
    }
}

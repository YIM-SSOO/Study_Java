package Java02;

public class ForEach {
    public static void main(String[] args) {

        // foreach 문
        // for(데이터타입 값을 받아줄 변수명: 출력하고 싶은 자료구조)

        int[] iarr = {10,20,30,40,50};

        // for문
        for(int i = 0; i < iarr.length; i++){ // i가 배열의 length보다 작을때까지 인덱스를 하나씩 증가.

            //꺼낸 값을 담을 변수
            int value = iarr[i]; // 값을 꺼낼 때,  배열의 인덱스를 부여해서 값을 꺼낸다.

            // 꺼낸 값을 출력하기
            System.out.println(value);

        }

        // forEach문

        for( int value :  iarr){
            System.out.println(value);
        }
    }
}

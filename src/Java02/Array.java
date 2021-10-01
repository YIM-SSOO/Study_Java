package Java02;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        // 배열

        // 배열의 메모리 크기
        // 배열을 구성하는 데이터의 자료형에 따라서 배열의 메모리 크기가 결정된다.
        int[] arr = new int[3];
        // => int == 4 byte / int[0] == 4byte == arr = 12byte



        // 배열의 기본 속성
        // 기본 자료형 데이터를 담고 있는 변수와 달리 배열변수는 배열 데이터의 주소를 담고 있다.

        //배열 기본 속성
        int[] arrAtt1 = {10,20,30,40,50,60};
        int[] arrAtt2 = null;
        int[] arrAtt3 = null;

        //배열길이
        System.out.println("arrAtt1.length : " + arrAtt1.length);

        // 배열 요소 출력
        System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));

        // 배열 요소 복사
        arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
        System.out.println("aeeAtt3 : " + Arrays.toString(arrAtt3));

        // 배열 레퍼런스
        //기본 자료형 데이터를 담고 있는 변수와 달리 배열 변수는 배열 데이터의 주소를 담고 있다.

        arrAtt2 = arrAtt1;
        System.out.println("arrAtt1: " + arrAtt1);
        System.out.println("arrAtt2: " + arrAtt2);
        System.out.println("arrAtt3: " + arrAtt3);

    }
}

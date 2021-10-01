package java01;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        // 2차원 배열 (배열들의 배열)
        String[][] days = {
                             //[0]번째 인덱스
                            {"월", "화", "수", "목", "금", "토", "일"},
                            //[1]번째 인덱스
                            {"월", "화", "수", "목", "금", "토", "일"},
                            //[2]번째 인덱스
                            {"월", "화", "수", "목", "금", "토", "일"}
                         };

        System.out.println(Arrays.toString(days[0]));
        System.out.println(Arrays.toString(days[1]));
        System.out.println(Arrays.toString(days[2]));
    }
}

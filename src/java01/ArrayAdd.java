package java01;

import java.util.Arrays;

public class ArrayAdd {

    public static void main(String[] args) {
        //배열에 값 추가하기

        //배열 선언
        String[] days ={"월", "화","수","목","금","토","일"};
        
        // copyOf() == 배열이 복사가 된다.
        // 괄호안에 첫번째로는 복제하길 원하는 원래의 배열, 복제될 배열이 가져야 될 배열의 요소 길이를 입력
        String[] days2= Arrays.copyOf(days, 8);
        
        days2[7] = "월";
        for(String tmp : days2)
            System.out.println(tmp);
        
        
                    
  
    }
}

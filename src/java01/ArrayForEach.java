package java01;

public class ArrayForEach {

    public static void main(String[] args) {
        //ForEach 문 활용하기

        //배열 선언
        String[] days ={"월", "화","수","목","금","토","일"};

        //반복문
        for(String day : days)
            // for (배열의 각 요소를 나타낼 변수인 String day를 선언, :(콜론)뒤에 배열의 변수명 days를 넣어준다)
            System.out.println(day + "요일");
            
                    
  
    }
}

package algorithm;

public class ArrayGugudan {

    // 메소드를 활용해 분리하여 구구단 실행
    public static int[] caculate(int tip) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = tip * (i + 1);
        }
        return result;

    }
    //3단
    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }


    public static void main(String[] args) {


        //배열을 활용해 구구단 구현
        // 2단
      /*  int[] result = new int[9]; //9개의 int 데이터를 가진 배열

        // 계산 결과를 result 배열에 저장
        // 배열의 첫번째위치는 0이기때문에 1을 더한다.
        for (int i = 0; i < result.length; i++){
            result[i] = 2 * (i + 1);
        }

        for (int i = 0; i < result.length; i++) {
            // 배열에  담긴 값을 꺼내오기
            System.out.println(result[i]);

        }*/


        // 메소드로
        int[] result = caculate(2); //9개의 int 데이터를 가진 배열
        print(result);


        // 3단 (2중 for문)
        int[] tip = caculate(3);

        print(result);


        // 4단 (2중 for문)
        int[] tip1 = caculate(4);

        print(result);

    }


}


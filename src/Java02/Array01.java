package Java02;

public class Array01 {
    // 2차원배열 : 배열의 배열

    public static void main(String[] args) {

        // 2차원 배열 선언 방법

        // arr = 2차원배열을 가를킬 수 있는 변수
        // [3] = 1차원 배열을 가르킬 수 있는 참조변수가 3개 생긴 것, [4] = 실제 정수 값을 담을 수 있는 그릇들
        int[][] arr = new int[3][4];

        // 배열에 값을 담을때
        // arr[0] = 10; ---> 에러 - 배열 0번째 인덱스를 이부분을 의미하는데, 실제 int값을 담을 수 있는 부분이 아니라 int형 배열을 가르킬 수 있는 참조변수이기때문에 정수값을 담을 수 가 없다.
        // 실제로 값을 담을때에는 다음 인덱스까지 지정해주어야한다.
        arr[0][1] = 10; //0번째 인덱스가 가르키고 있는 1번에 10을 넣겠다 지정하면, 0이가르키고 있는 1차원 배열 인덱스가 1번인 곳에 10을 넣어주는 의미이다.

        // 2차원 배열을 선언할때 크기가 다른 배열도 생성가능하다.

        int[][] arr1 = new int[3][]; // 뒤에있는 사이즈를 비워주게되면 실제로 값을 담을 수 있는 1차원 배열은 만들어지지 않은 상태

        // 만들어지지 않은상태에서 하게 되면 0번째가 가르키고 있는 0번째 인덱스에 값을 넣겠다하면
        // arr1[0][0] = 10;
        // -> 실행시 오류가 발생한다. 이유는 현재 arr1에 0번째 인덱스가 가르키고있는 것은 참조형 변수이기때문에 배열의 0번째에다가 뭘 넣게다라했는데 실제 이 0번째는 가르키는게 없기 때문이다.

        // 그래서 반드시 그부분을 사용하기 위해서는 arr1에 0번째 인덱스가 실제 가르키는 배열을 만들어주어야한다.
        arr1[0] = new int[1];   // 1차원 배열 하나 짜리를 만들겠어요 --> 정수를 하나 담을 수 있는 배열을 생성해서 arr1의 0번째 인덱스가 참조한다.

        arr1[0][0] = 10;  //  생성 후 실행했을 때 오류가 발생하지 않는다.

        // 2차원배열도 선언과 동시에 초기화하는 방법
        int[][] arr2 = {{1}, {1, 2}, {1, 2, 3}};  // 초기화와 동시에 값을 넣을 수 있다.
        // 위와 같이 선언할 경우, arr2[1][0]은 2이다.

        System.out.println(arr2[0][0]); //arr2에 0번째 인덱스에 0번쨰 0번째인덱스를  출력 ==> 1

        System.out.println(arr2[2][2]); //arr2에 2번째 인덱스에 2번째 2번을 출력 ==> 3
    }


}

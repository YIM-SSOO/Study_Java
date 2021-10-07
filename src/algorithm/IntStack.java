package algorithm;

public class IntStack{

    int max; // 스택용량: 스택에 쌓을 수 있는 최대 데이터수
    int ptr; // stackPointer: 스택에 쌓여있는 데이터 수
    int[] stk; // 스택의 본체 : 실제로는 배열 본체가 아니라, 본체를 참조하는 배열 변수. 배열 전체는 생성자에 생성

    // 실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException{
        //pointer가 -1인 상태
        public EmptyIntStackException(){
            System.out.println(" 스택이 비어 있습니다.");
        }
    }

    //실행시 예외 : 스택이 가득참
    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){
            System.out.println("스택이 가득 찼습니다.");
        }
    }

    //생성자
    public IntStack(int capacity){
        ptr = 0;
        max = capacity;

        try{
            stk = new int[max]; // 본체 배열 생성
        }catch(OutOfMemoryError e){
            //생성하지 못함
            max = 0;
        }
    }
}

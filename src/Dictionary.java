import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {

        //영한사전 만들기

        Map<String, String> dictionary = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        //데이터 넣기
        dictionary.put("chicken", "닭");
        dictionary.put("pizza", "피자");

        //데이터 빼기
        // 1. put()를 이용해 특정키의 값을 null로 반환해주기
        // 이런 방법은 chicken을 null로 반환시켰기때문에 사전에 존재하지 않는다고 출력되지만
        // 값을 제거해도 프로그램을 실행하면 여전히 두개의 값이 있다고 출력이 되는 문제가 있다.
        dictionary.put("chicken", null);

        // 2. 확실하게 제거하기 - remove()
        // remove() 첫번째 인자로 키 값을 넣어주면 된다.
        dictionary.remove("chicken");

        // Map이 비었는지를 확인하는 isEmpty()
        if (dictionary.isEmpty()) {
            System.out.println("단어가 존재하지 않습니다.");
            //프로그램을 바로 종료시키기
            System.exit(0);
        } else {
            //목록의 개수를 반환해주는 size()
            System.out.println(dictionary.size() + "개의 단어가 있습니다.");
        }

        System.out.println("찾고 싶은 영단어를 입력해주세요!");
        //사용자에게 입력값을 받기
        String eng = scanner.nextLine();
        // 사용자가 입력한 문자열을 키로 사용해 한글단어를 가져오기
        String kor = dictionary.get(eng);

        // 만약 한글 단어가 null이라면 사전에 단어가 존재 X
        if (kor == null) {
            System.out.println("사전에 없는 단어입니다.");
        } else {
            //한글이 존재한다면 출력
            System.out.println(eng + "은(는) " + kor + "입니다.");
        }

    }
}

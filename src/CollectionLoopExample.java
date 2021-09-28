import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionLoopExample {

    public static void main(String[] args) {

        //List방식
        //List<String> foods = new ArrayList<>();

        //Set방식
        Set<String> foods = new HashSet<>();


        /*foods.add("치킨");
        foods.add("피자");
        foods.add("고구마");*/

        //리스트의 반복문을 적용해서 리스트의 내용을 출력
        /*for (String food : foods) {
            System.out.println(food + "맛있어요");
        }*/

        // 이 목록이 비었는지 확인해보기
        // size() -  사이즈 비교
        //if (foods.size() == 0) {
        // isEmpty() --> 목록이 비어있는지 여부를 boolean값으로 반환해준다.
        if (foods.isEmpty()) {
            System.out.println("이 목록은 비어있습니다.");
        } else {
            System.out.println("총 " + foods.size() + "개의 음식이 있습니다.");
        }

    }
}

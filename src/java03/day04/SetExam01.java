package java03.day04;

import java.util.HashSet;
import java.util.Set;

public class SetExam01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("a");
        set.add("b");

        System.out.println("set의 내용을 출력합니다.");
        for (String str : set) {
            System.out.println(str);
        }
    }
}

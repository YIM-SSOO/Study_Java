package java01;

import java.util.Arrays;
import java.util.Scanner;

public class RoomInCave {

    public static void main(String[] args) {

        //각 방을 정의
        int[] rooms = {0, 1, 2, 3};

        // 각 방에서 이동할 수 있는 방들의 목록을 정의
        int[][] links = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1}, {0, 1, 2}};

        // 현재 있는 방의 위치를 정의해주는 변수, 초기 값은 0번 방
        int currentRoom = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("지금" + currentRoom + "번 방에 있습니다.");
            System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요.");

            // 이동할 수 있는 방을 제시
            System.out.println(Arrays.toString(links[currentRoom]));

            int roomNumber = scanner.nextInt();

            currentRoom = roomNumber;

        }

    }
}

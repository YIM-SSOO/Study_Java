package java01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MoveAndSituation {


    //움퍼스게임

    public static int[] rooms = {0, 1, 2, 3};

    public static int[][] links = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1}, {0, 1, 2}};

    //장애요소
    public static String BAT = "Bat"; //박쥐
    public static String PIT = "Pit"; // 구덩이
    public static String WUMPUS = "Wumpus"; //움퍼스
    public static String NOTHING = "Nothing"; //빈방

    public static String[] hazards = {NOTHING, BAT, PIT, WUMPUS};

    public static int currentRoom = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("지금 " + currentRoom + "번 방에 있습니다.");

            int[] nextRooms = links[currentRoom];

            System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요");
            System.out.println(Arrays.toString(nextRooms));

            int roomNumber = scanner.nextInt();

            move(roomNumber);

        }
    }

    /*
        플레이어가 이동했을 때 이동과 그 뒤의 이벤트들을 처리하는 메소드
        이동을 하게 되면 그 방에 어떤 위험요소가 있는지를 판단하고
        각 위험 요소에 해당하는 이벤트를 처리
     */

    private static void move(int room) {
        //입력한 방으로 이동합니다.
        currentRoom = room;

        String hazardInRoom = hazards[currentRoom];

        //현재 방에 움퍼스가 있는 경우
        if (hazardInRoom.equals(WUMPUS)) {
            System.out.println("움퍼스에게 잡아먹혔습니다.");
            //게임오버처리
        }
        // 현재 방에 구덩이가 있는 경우
        else if (hazardInRoom.equals(PIT)) {
            System.out.println("구덩이에 빠졌습니다.");
            //게임오버처리
        }
        //현재 방에 박쥐가 있는 경우
        else if (hazardInRoom.equals(BAT)) {
            System.out.println("박쥐가 당신을 잡아 다른 방에 떨어뜨렸습니다.");

            Random random = new Random();

            do {
                //방들의 갯수 범위안에서 랜덤한 숫자 하나를 가져다가 플레이어의 위치에 대입
                currentRoom = random.nextInt(rooms.length);
                //만약 위험요소가 박쥐라면(true)라면 다시 변경
            } while (hazards[currentRoom].equals(BAT));

            hazards[room] = NOTHING;

            while (true) {
                //박쥐가 빈방으로 이동시키기
                int newBatRoom = random.nextInt(rooms.length);


                if (newBatRoom == currentRoom) {
                    continue; // 다시 랜덤한 방을 고르고
                }

                //위험요소가 없다면 그방에 박쥐를 위치시킨다.
                if (hazards[newBatRoom].equals(NOTHING)) {
                    hazards[newBatRoom] = BAT;
                    break;
                }
            }
            move(currentRoom);
        }
    }
}

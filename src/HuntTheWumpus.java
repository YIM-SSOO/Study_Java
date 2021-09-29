import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class HuntTheWumpus {

    public static Integer[] rooms = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            10, 11, 12, 13, 14, 15, 16, 17, 18, 19
    };

    //2차원 배열 - 이동할 수 있는 방의 다른방들
    public static Integer[][] links = {
            {1, 7, 4}, {0, 9, 2}, {1, 11, 3}, {2, 13, 4}, {3, 0, 5},
            {4, 14, 6}, {5, 16, 7}, {6, 0, 8}, {7, 17, 9}, {8, 1, 10},
            {9, 18, 11}, {10, 2, 12}, {11, 19, 13}, {12, 3, 14}, {13, 5, 15},
            {14, 19, 16}, {15, 6, 17}, {16, 8, 18}, {17, 10, 19}, {18, 12, 15}
    };

    public static String BAT = "Bat"; //박쥐
    public static String PIT = "Pit"; // 구덩이
    public static String WUMPUS = "Wumpus"; //움퍼스
    public static String NOTHING = "Nothing"; //빈방

    // 각 방에 위치한 위험 요소를 표현하는 리스트
    public static ArrayList<String> hazards = new ArrayList<>();

    // 게임룰에서 주변방에 어떤 위험요소가 있는지에 따라 주인공이 대사들을 닮을 맵
    public static HashMap<String, String> hazardMessages = new HashMap<>();

    // 사용자의 입력을 받고 랜덤한 방을 선택하는 변수
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    // 게임 오버 변수
    public static boolean gameOver = true;

    // 게임 상에서 수시로 변하는 스테이터스 중 전역적으로 관리되어야 한 변수
    public static int currentRoom;  //플레이어의 현재 위치
    public static int arrowCount;   // 현재 플레이어가 가지고 있는 화살 개수
    public static int wumpusRoom;   // 현재 움퍼스의 개수

    public static void main(String[] args) {
        showIntro(); //인트로

        initializeStaticValuse(); // 게임이 동작하는 내내 변하지 않는 값들을 초기화해주는 메서드


        // 전체적인 게임에 대한 루프
        while (true) {
            initializeStaticVariables(); // 플레이어와 관련된 변수값들을 초기화 시켜주는 메서드

            setupHazards(); // 각 방의 위험요소들을 랜덤으로 배치해주는 메서드

            //게임 시작으로 알리는
            delay(1000L); //1초 쉬고
            System.out.println("\n....");
            delay(1000L);
            System.out.println("....");
            delay(1000L);
            System.out.println("동굴에 들어왔습니다...\n");
            delay(1000L);
            System.out.println("\"섬뜩한 곳이군.\"");
            delay(1000L);

            game(); // 게임 1회 분량의 전체 게임의 로직을 반복해 줄 메서드

            selectReply(); // 게임 종료? 시작 여부

        }
    }

    private static void initializeStaticVariables() {
        gameOver = false;

        currentRoom = random.nextInt(rooms.length);
        arrowCount = 5;
    }

    private static void selectReply() {
        System.out.println("게임이 끝났습니다. 다시 플레이하시겠습니까?");

        while (true) {
            System.out.println("0: 종료, 1: 다시 플레이");
            String action = scanner.nextLine();

            if (action.equals("0")) {
                System.out.println("게임을 종료합니다.");
                System.exit(0);
            } else if (action.equals(1)) {
                System.out.println("게임을 다시 플레이합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private static void game() {
        while (gameOver == false) {
            System.out.println("\n당신은 " + currentRoom + "번 방에 있습니다.");
            System.out.println("행동을 선택하세요.");
            System.out.println("1. 이동");
            System.out.println("2. 화살 쏘기");
            System.out.println("3. 통로 목록");
            System.out.println("0. 플레이 종료");

            String action = scanner.nextLine();

            // 1번 선택
            if (action.equals("1")) {
                // links로부터 현재 위치에서 갈 수 있는 방들의 번호를 가져와 플레이어에게 알려준다.
                Integer[] nextRooms = links[currentRoom];

                System.out.println("\n 몇 번 방으로 이동하시겠습니까?");
                System.out.println(Arrays.toString(nextRooms));

                String nextRoomInput = scanner.nextLine();
                // 정수를 변환
                int nextRoom = parseIntegerOrNegative1(nextRoomInput);

                if (Arrays.asList(nextRoom).contains(nextRoom)) {
                    move(nextRoom);
                } else {
                    System.out.println("선택한 방으로는 이동할 수 없습니다.");
                }
                // 2번 선택
            } else if (action.equals("2")) {
                Integer[] nextRooms = links[currentRoom];

                System.out.println("\n 몇 번 방에 화살을 쏘시겠습니까?");
                System.out.println(Arrays.toString(nextRooms));

                String targetRoomInput = scanner.nextLine();
                int targetRoom = parseIntegerOrNegative1(targetRoomInput);

                if (Arrays.asList(nextRooms).contains(targetRoom)) {
                    shoot(targetRoom);
                } else {
                    System.out.println("선택된 방에는 화살을 쏠 수 없습니다.");
                }
                // 3번 선택
            } else if (action.equals("3")) {
                System.out.println("현재 연결된 통로는 다음과 같습니다.");
                System.out.println(Arrays.asList(links[currentRoom]));

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private static void shoot(int room) {

        arrowCount = arrowCount - 1;

        delay(1000L);
        System.out.println("슈웅");
        delay(300L);

        if (hazards.get(room).equals(WUMPUS)) {
            System.out.println("퓨슉");
            delay(100L);
            System.out.println("\"쿠에에엑\"");
            delay(1000L);
            System.out.println("축하합니다! 당신은 움퍼스를 죽였습니다!");
            gameOver = true;
        } else if (random.nextInt(4) != 0) {
            System.out.println("당신은 움퍼스를 깨웠습니다.");
            delay(1000L);

            Integer[] nextRooms = links[wumpusRoom];

            int nextRoom = nextRooms[random.nextInt(3)];

            if (hazards.get(nextRoom).equals(NOTHING)) {
                hazards.set(wumpusRoom, NOTHING);
                hazards.set(nextRoom, WUMPUS);
                wumpusRoom = nextRoom;
            }

            if (wumpusRoom == currentRoom) {
                System.out.println("\"으아아아아악!\"");
                delay(300L);
                System.out.println("움퍼스가 당신을 잡아 먹었습니다.");
                gameOver = true;
            } else if (wumpusRoom == nextRoom) {
                System.out.println("움퍼스가 도망갔습니다.");
            }
        }
    }

    private static void move(int room) {

        currentRoom = room;
        System.out.println(currentRoom + "번 방으로 이동했습니다.");
        String hazard = hazards.get(currentRoom);

        delay(1000L);

        if (hazard.equals(WUMPUS)) {
            System.out.println("\"으아아아아악!\"");
            delay(3000L);
            System.out.println("움퍼스가 당신을 잡아 먹었습니다.");
            gameOver = true;
        } else if (hazard.equals(PIT)) {
            System.out.println("\"으아아아아악!\"");
            delay(1000L);
            System.out.println("\"쿵!\"");
            delay(300L);
            System.out.println("당신은 구덩이에 빠졌습니다.");
            delay(300L);
            System.out.println("더이상 움퍼스를 사냥할 수 없습니다..");
            gameOver = true;
        } else if (hazard.equals(BAT)) {
            System.out.println("쿵");
            delay(300L);
            System.out.println("박쥐가 당신을 잡아 다른 방에 떨어뜨렸습니다.");

            do {
                currentRoom = random.nextInt(rooms.length);
            } while (hazards.get(currentRoom).equals(BAT));

            hazards.set(room, NOTHING);

            while (true) {
                int newBatRoom = random.nextInt(rooms.length);

                if (newBatRoom == currentRoom) {
                    continue;
                }
                if (hazards.get(newBatRoom).equals(NOTHING)) {
                    hazards.set(newBatRoom, BAT);
                    break;
                }
            }
            move(currentRoom);
        } else {
            List<Integer> nextRooms = Arrays.asList(links[currentRoom]);
            Collections.shuffle(nextRooms);

            System.out.println("\n(연결되어 잇는 통로를 살핀다\"");
            for (int nextRoom : nextRooms) {
                delay(700L);
                String hazardAround = hazards.get(nextRoom);
                System.out.println(hazardMessages.get(hazardAround));
            }
            Collections.shuffle(nextRooms);
        }
    }

    private static int parseIntegerOrNegative1(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void delay(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {

        }
    }

    private static void setupHazards() {
        // 위험 요소 리스트에 아무것도 없다면
        if (hazards.size() == 0) {
            for (int i = 0; i < rooms.length; i = i + 1) {
                // 방 개수만큼 nothig을 추가
                hazards.add(NOTHING);
            }
        }
        //게임을 재 시작 되었을 때 모든 방의 위험요소를 비워죽는 역할
        for (int i = 0; i < rooms.length; i = i + 1) {
            hazards.set(i, NOTHING);
        }

        // 배치할 위험요소 순서, 그리고 출현 빈도를 나타낸다.
        String[] ordinals = {WUMPUS, BAT, BAT, BAT, PIT, PIT};

        for (String hazard : ordinals) {
            int room;

            while (true) {
                room = random.nextInt(rooms.length);


                if (isTooCloseWithPlayer(room)) {
                    continue;
                }
                if (hazards.get(room).equals(NOTHING)) {
                    break;
                }
            }

            hazards.set(room, hazard);

            if (hazards.equals(WUMPUS)) {
                wumpusRoom = room;
            }
        }

    }

    // 위험요소가 플레이어의 초기 위치가 너무 가깝지 않은지 판단하는 메서드
    private static boolean isTooCloseWithPlayer(int room) {
        if (currentRoom == room) {
            return true;
        }

        // 플레이어의 초기 위치에서 이동할 수 있는 방들의 목록을 가져와
        List<Integer> linkedRooms = Arrays.asList(links[currentRoom]);
        // 위험요소가 배치 될 방이 플레이어의 초기 위치와 인접해있는지를 contains로 확인
        if (linkedRooms.contains(room)) {
            return true;
        }
        return false;
    }

    private static void showIntro() {
        try {
            FileInputStream inputStream = new FileInputStream("src/intro.txt");
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                delay(500L);
            }

        } catch (FileNotFoundException e) {
            System.out.println("인트로를 읽을 수 없어 생략합니다.");
        }
    }

    //정적변수들을 초기화해주는 메서드
    private static void initializeStaticValuse() {
        hazardMessages.put(WUMPUS, "\"어디선가 끔찍한 냄새가 난다.\"");
        hazardMessages.put(BAT, "\"어디선가 부스럭 소리가 난다.\"");
        hazardMessages.put(PIT, "\"바람이 부는 소리가 들리는 것 같다.\"");
        hazardMessages.put(NOTHING, "\"저 방은 아무것도 없는 것 같다.\"");
    }
}

package java03.day02;

public class BoxExam {
    public static void main(String[] args) {
  /*      Box box = new Box();*/

        //박스에다가 값을 넣어주고 싶을 때 이용하는 setObj()
        // Object 객체를 하나 생성해서 넣어주면 값을 담아낼 수 있다
     /*  *//**//* box.setObj(new Object());*/

        // 값을 꺼내서 쓸때
        // getObj()를 이용하면 박스가 가지고 있는 object 클래스를 리턴해줄 것이다.
        // box.getObj();
        // 그 값이 사용할 수 있도록 변수를 미리 준비해야한다.
       /* Object obj = box.getObj();*/

        // 박스에 String값을 넣어주고 싶을때
      /*  box.setObj("Hello");*/
        // 가능하다. 왜냐하면 상속 시 타입이 메소드상에서 들어 올 수 있는 타입이 Object 라는 것은
        // Object 타입이 Object라는 것은 Object 타입만 들어올 수 있는것이아니라
        // Object 타입의 후손/ 자식 클래스들이라면 무엇이든 들어올 수 있기때문이다.

        // Object타입으로 자식들을 다 가리킬 수 있었으나, 자식이 가진 메소드에는 접근할 수 없다.
        // String이 가지고 있는 특징들을 가지고 다 사용하고 싶다 ==> 형변환을 거쳐야만 한다.
   /*     String str = (String)box.getObj();


        box.setObj(1);
        int value = (int) box.getObj();*/


        // java 5에서는 제너릭이라는 하는 문법이 사용됨으로써
        // 인스턴스를 만들 때, 사용하는 타입을 지정하는 문법이 추가되었다.

        // 기존에 보면 Object 타입으로 받았기때문에 모든 객체가 다 들어갈 수 가 있지만,
        // 모든 객체가 다 들어가기때문에 다시 꺼내서 사용할 때는 매번 형변환 작업을 해줘야한다.

        // 그래서 제너릭으로 선언하게 되면 다음과 같다.
        // class 뒤쪽에다가 꺽새괄호를 이용하면 된다.

        // 제너릭 지정
        // Box를 생성하는데 나는 Object타입을 받아들일 수 있도록 생성하겠다.
        Box<Object> box = new Box<>();

        box.setObj(new Object());
        Object obj = box.getObj();

        Box<String> box1 = new Box<>();
        //box1.setObj(3); //String 타입이 아니기 때문에 에러
        box1.setObj("Hello");
        String str = box1.getObj();

        Box<Integer> box2 = new Box<>();
        // box2.setObj("sdd"); //에러 Integer 타입만 입력 가능하기 때문
        box2.setObj(152);
        int v1 = box2.getObj();
    }
}

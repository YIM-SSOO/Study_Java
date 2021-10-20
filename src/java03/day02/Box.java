package java03.day02;

// class 뒤쪽에다가 꺽새괄호를 이용하면 된다.
//public class Box {
public class Box<E> { // 제너릭 선언
    // Box는 Object타입으로 obj라는 필드를 갖게 할거고요
    // private Object obj;

    // 제너릭 선언 후 E로 수정
    private E obj;

    //이 필드에 값을 설정할 수 있는 setObj()와
    // 해당 Object의 값을 반환하는 getObj()라는 메소드를 설정

    // 값을 설정하는 부분이기때문에 리턴타입은 필요없다.
    // 값을 받아와서 설정해야할테니까 Object타입으로 값을 받아내면 된다.
    //public void setObj(Object obj) {


    public void setObj(E obj) {
        // 지금 obj라는 것이 매개변수로 들어온 변수의 obj와
        // 필드의 obj가 같기 때문에 this라는 키워드를 이용하여
        // obj의 값을 설정하게 하면 된다.
        this.obj = obj;
    }

    // 값을 꺼내다 쓸 수 있는 getObj()
    // 값을 리턴해줘야하니깐 리턴타입
    // object의 값을 리턴할거니깐 타입은 obj
    // public Object getObj() {
    public E getObj() {
        return obj;
    }
}

// 박스는 가상클래스 E를 사용하겠다는 의미이다.
// Object를 받아들여서 리턴하는 부분을 모두 E로 변경하고 있다.
// E는 실제로 존재하는 클래스는 아니다.
// 이렇게 지정하는 것을 제너릭을 사용했다라고 한다.
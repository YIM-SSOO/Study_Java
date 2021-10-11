package Java02;

public class AccessObjExam {

    public static void main(String[] args) {

        //AccessObj를 사용하기 위해 객체생성
        AccessObj obj = new AccessObj();

        System.out.println(obj.p);      //public
        System.out.println(obj.p2);     //protected
        System.out.println(obj.k);      //default
        //System.out.println(obj.i);      //private --> 에러 - 접근이 안됨.


    }
}

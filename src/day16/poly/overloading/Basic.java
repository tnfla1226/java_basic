package day16.poly.overloading;

public class Basic {

    // add(int, int)
    int add(int n1, int n2) {
        System.out.println("2개짜리 실행");
        return n1 + n2;
    }
    // add(int, int, int)
    int add(int n1, int n2, int n3) {
        System.out.println("3개짜리 실행");
        return n1 + n2 + n3;
    }
    // add(int, string)
    int add(int x, String y) {
        return 0;
    }
    // add(String, int)
    void add(String m, int n) {     //리턴타입은 상관없음. 매개변수와 타입만 볼것

    }
    // add()
    void add() {}

    public static void main(String[] args) {

        Basic basic = new Basic();
        basic.add(3, 5, 9);
//        basic.addThree(3, 5, 9);

        System.out.println();
    }
}

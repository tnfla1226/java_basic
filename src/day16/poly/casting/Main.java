package day16.poly.casting;

public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();
        parent.m2();
//        parent.m3();

        System.out.println("=============================");
        Child child = new Child();
        child.m1();
        child.m2();
        child.m3();

        System.out.println("============================");

        Parent c = new Child();
        System.out.println(c);
        c.m2(); //자식꺼 실행됨
//        c.m3();   //부모의 흉내를 내다보니 자신의 오리지날 메서드는 사용 못함
        ((Child)c).m3();    //강제 타입 변환  //다운캐스팅

    }
}

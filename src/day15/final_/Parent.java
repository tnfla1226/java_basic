package day15.final_;

class Child extends Parent {
//    @Override
//    void m1() {}

}

//public final class Parent {   //상속 불가
public class Parent {
    String s;

    final void m1() {}  //오버라이딩 불가
    void m2() {}
}

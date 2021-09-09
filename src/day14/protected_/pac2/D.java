package day14.protected_.pac2;

import day14.protected_.pac1.A;

public class D extends A {
    public D() {
//        super(5);
        super("43243");     //protected는 다른 패키지여도 상속관계이면 가져올수있음

//        super.f1 = 1;
        super.f2 = 3;

//        super.m1();
        super.m2();
    }
}

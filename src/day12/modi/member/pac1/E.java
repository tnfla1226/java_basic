package day12.modi.member.pac1;

public class E {

    public E() {
        D d = new D();
        d.f1 = 1; //public
        d.f2 = 2; //dedault
//        d.f3 = 3; //default

        d.m1(); //public
        d.m2(); //default
//        d.m3(); //private
    }
}

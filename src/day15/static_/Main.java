package day15.static_;

public class Main {

    public static void main(String[] args) {

        //y는 static이라서 하나의 값을 공유함, x는 공유하지 않고 계속 값 생성
        Count c1 = new Count();
        c1.x = 5;
        Count.y = 10;

        Count c2 = new Count();
        c2.x++;
        c2.y++;

        System.out.println("c1.x= " + c1.x);
        System.out.println("c2.x= " + c2.x);
        System.out.println("========================");
        System.out.println("c1.y= " + Count.y);
        System.out.println("c2.y= " + Count.y);

        Count c3 = new Count();
//        c3.y += 40;
        Count.y += 40;

        System.out.println("c3.y= " + c3.y);

        c1.m1();
        c2.m1();

        Count.m2(c3);

        Calculator sharpCal = new Calculator("샤프", "파랑");
//        sharpCal.paint(("빨강"));

        double result = Calculator.calcAreaCircle(5);   //객체 생성 없이도 쓸수있음
        System.out.println("result = " + result);

    }
}

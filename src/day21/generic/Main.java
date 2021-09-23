package day21.generic;

import day14.protected_.pac1.A;
import day14.protected_.pac1.B;

public class Main {

    public static void main(String[] args) {

        /*AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        System.out.println(ab.getApple());*/

        Basket<Apple> ab = new Basket<Apple>();
        ab.setF(new Apple());
        System.out.println(ab.getF());

        Basket<Banana> bb = new Basket<>(); //왼쪽 다이아몬드에 쓰면 오른쪽은 생략가능
        bb.setF(new Banana());
        System.out.println(bb.getF());

//        Basket<Water> wb = new Basket<>();
    }
}

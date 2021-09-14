package day16.poly.car;

import day12.modi.cls.pac1.B;
import day12.modi.cls.pac2.C;

public class Main {

    public static void main(String[] args) {

        Car t = new Tucson();
        Car s = new Sonata();
        Car b = new Boxster();

        Car[] sArr = {s, t, b, new Sonata(), new Tucson()};

        for (Car car : sArr) {
            car.run();
        }

//        Rich richMan = new Rich();
//        richMan.myCars = new Tucson[30];
//        richMan.myCars[0] = t;

        System.out.println("============================");

        Driver park = new Driver();
        park.drive(new Boxster());

        System.out.println("============================");

        Sonata mySonata = (Sonata) park.buyCar("소나타");
        mySonata.run();

        mySonata.joinClub();

        sArr[0] = mySonata;

        System.out.println("===========================");

        CarShop shop = new CarShop();

        int money = shop.sellCar(t);
        System.out.println("money = " + money);
    }
}

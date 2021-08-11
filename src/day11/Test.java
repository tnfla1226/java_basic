package day11;

//다른 패키지에 있는 클래스를 불러올 때 패키지명을 생략할 수 있게 해줌
//import day11.fruit.Banana;
//import day11.fruit.Mango;
import day11.fruit.*; // fruit의 모든 패키지명을 생략할 수 있게 해줌
import day11.company.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Banana b = new Banana();
        Mango mango = new Mango();
        day11.company.Apple apple = new day11.company.Apple();
        day11.fruit.Apple apple2 = new day11.fruit.Apple();

        Scanner sc = new Scanner(System.in);
    }
}

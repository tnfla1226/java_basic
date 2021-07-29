package day03;

import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    //쉽게쓰기: new Sc정도만 입력하고 Scanner.util? 클릭 -> 컨트롤+알트+V

        System.out.print("너 얼마있어? ");
        int money = sc.nextInt();
        sc.close();

        String food = money >= 5000 ? "김치찌개" : money >= 2500 ? "라면" : "굶어!";

        System.out.println("선태된 음식: " + food);

    }
}

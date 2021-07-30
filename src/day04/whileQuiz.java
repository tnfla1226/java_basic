package day04;

import java.util.Scanner;

public class whileQuiz {

    public static void main(String[] args) {

        int total = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int num1 = sc.nextInt();

        System.out.print("정수2: ");
        int num2 = sc.nextInt();
        sc.close();
        /*
        int n = num1;
        while(n <= num2) {
                total += n;
                n++;
        }
        */

        for (int n = num1; n <= num2; n++) {
            total += n;
        }
        System.out.printf("%d~%d까지의 총합: %d\n", num1, num2, total);
    }
}

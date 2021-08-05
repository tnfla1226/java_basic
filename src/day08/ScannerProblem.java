package day08;

import java.util.Scanner;

public class ScannerProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        int n = sc.nextInt();
        sc.nextLine();  // 정수입력 후 \n을 미리 먹어줌

        System.out.print("문자: ");
        String str = sc.nextLine();
        System.out.println("str = " + str);

        System.out.println("입력종료!");
        sc.close();
    }
}

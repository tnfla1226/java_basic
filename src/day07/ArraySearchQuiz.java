package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(members));

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");
            String newMember = sc.next();

            int idx = -1;
            boolean change = false;

            for(int i = 0; i < members.length; i++) {
                if (newMember.equals(members[i])) {

                    idx = i;

                    System.out.printf("%s의 별명을 변경합니다.\n", newMember);
                    System.out.print("> ");
                    newMember = sc.next();

                    members[i] = newMember;

                    System.out.println("변경 완료!");
                    System.out.println("* 변경 후 정보: " + Arrays.toString(members));
                    change = true;
                    break;
                }
            }

            //수정 여부 결정
            if (idx == -1) {
                System.out.printf("%s은(는) 없는 이름입니다.\n", newMember);
            }
            // while 탈출 조건
            if (change == true) {
                break;
            }
        }
    }
}

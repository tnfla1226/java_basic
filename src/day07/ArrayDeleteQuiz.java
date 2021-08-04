package day07;

import java.util.*;

public class ArrayDeleteQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nickNames = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(nickNames));

        while (true) {
            System.out.println("- 삭제할 학생의 이름을 입력하세요!");
            System.out.print("> ");
            String targetName = sc.next();

            int delIdx = -1;
            for (int i = 0; i < nickNames.length; i++) {
                if (targetName.equals(nickNames[i])) {
                    delIdx = i;
                    break;
                }
            }

            if (delIdx != -1) {
                for (int i = delIdx; i < nickNames.length - 1; i++) {
                    nickNames[i] = nickNames[i+1];
                }

                String[] temp = new String[nickNames.length - 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = nickNames[i];
                }
                nickNames = temp; temp = null;

                System.out.println(targetName + "의 별명을 삭제합니다.");
                System.out.println("* 삭제 후 정보: " + Arrays.toString(nickNames));
                sc.close();
                break;
            } else {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n", targetName);
            }
        }
    }
}

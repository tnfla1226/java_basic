package day05;

import java.util.Scanner;

public class LoopQuiz {

    public static void main(String[] args) {

        /*
        1. 일단 1~20의 랜덤 숫자로 두 수의 덧셈문제를 1문제 출제한 후
           정답인지 오답인지 출력해보세요.
        2. 0을 입력할 때까지 반복해서 새로운 덧셈문제를 출제하고
           지속해서 정답 오답을 출력해보세요.
        3. 프로그램 종료되면 그동안의 정답횟수와
           오답횟수를 출력하세요.
        4. 빼기 기능을 추가하세요.
        5. 곱하기 기능을 추가하세요.
        6. 만약 두번째 숫자가 더 크다면 빼기 문제를 낼 때
           양수가 나올 수 있도록 앞숫자와 교체해주세요
           ex)  4 - 17 = ?    <- 이런문제가 출제될 경우
               17 - 4 = ?      <- 이렇게 바꿔서 출제할 것!
        7. 난이도 기능을 추가하세요 [상, 중, 하]
           - 상: 1~1000사이 정수로 문제출제
           - 중: 1 ~100 사이
           - 하: 1 ~ 10 사이
         */
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int wAnswerCount = 0;
        int answerCount = 0;


        System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");
        System.out.print("# 엔터를 누르면 시작합니다.");
        sc.nextLine();
        System.out.println("=============================");
        System.out.println("# 난이도를 입력하세요! [상, 중, 하]");
        System.out.print(">> ");
        String level = sc.next();

        int randomNum1 = 0;
        int randomNum2 = 0;


            while (true) {

                switch (level) {
                    case "상":
                        randomNum1 = (int) (Math.random() * 1000 + 1);
                        randomNum2 = (int) (Math.random() * 1000 + 1);
                        break;

                    case "중":
                        randomNum1 = (int) (Math.random() * 100 + 1);
                        randomNum2 = (int) (Math.random() * 100 + 1);
                        break;
                    case "하":
                        randomNum1 = (int) (Math.random() * 20 + 1);
                        randomNum2 = (int) (Math.random() * 20 + 1);
                        break;
                    default:
                        System.out.println("난이도를 잘못 입력했습니다. 상급 난이도로 자동 시작합니다.");
                        randomNum1 = (int) (Math.random() * 1000 + 1);
                        randomNum2 = (int) (Math.random() * 1000 + 1);
                        break;

                }
                int realAnswer = randomNum1 + randomNum2;
                int randomSign = (int) (Math.random() * 3);
                String sign = "";

                switch (randomSign) {
                    case 0:
                        sign = "+";
                        realAnswer = randomNum1 + randomNum2;
                        break;
                    case 1:
                        sign = "-";
                        if (randomNum2 > randomNum1) {
                            int temp = randomNum1;
                            randomNum1 = randomNum2;
                            randomNum2 = temp;
                        }
                        realAnswer = randomNum1 - randomNum2;
                        break;
                    case 2:
                        sign = "x";
                        realAnswer = randomNum1 * randomNum2;
                        break;
                }

                System.out.printf("Q%d) %d %s %d = ", count, randomNum1, sign, randomNum2);
                int answer = sc.nextInt();

                if (realAnswer == answer) {
                    System.out.println("정답입니다!\n");
                    answerCount++;
                } else if (answer == 0) {
                    System.out.println("=============================");
                    System.out.printf("# 정답 횟수: %d회, 오답 횟수: %d회", answerCount, wAnswerCount);
                    break;
                } else {
                    System.out.println("틀렸습니다!\n");
                    wAnswerCount++;
                }
                count++;
            }
    }
}

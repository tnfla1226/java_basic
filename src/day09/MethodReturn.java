package day09;

public class MethodReturn {

    //리턴값이 없는 메서드 : 메서드가 코드만 실행하고 호출부로 값을
    //전달하지 않는 경우
    static void showMultiply(int n1, int n2) {
        System.out.printf("%d x %d = %d\n", n1, n2, n1 * n2);
    }

    static int add(int n1, int n2) {
        return n1 + n2;
    }

    static void sayHello(String name) {
        if (name.length() > 5) {
            System.out.println("이름이 너무 깁니다!");
            return;
        }
        System.out.println(name + "님 안녕!");
    }

    //모든 메서드의 리턴값은 오직 한개!
    //두 개의 정수를 전달받아 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 리턴
    static int[] operateAll(int n1, int n2) {
        return new int[]{n1 + n2, n1 - n2, n1 * n2, n1 / n2};   //컨트롤+알트+N으로 리팩토링
    }

    public static void main(String[] args) {

        //return값이 없는 void타입 메서드는 단독호출해서 사용
        showMultiply(5, 8);
        int result = add(1, 2);
        showMultiply(add(5, 5), add(3, 3));
        //add(showMultiply(3, 3), showMultiply(5, 5));

        System.out.println("===================================");
        sayHello("홍길동");
        sayHello("king got hong gil dong");

        System.out.println("===================================");

        int[] operList = operateAll(10, 5);
        System.out.println("덧셈결과: " + operList[0]);
        System.out.println("뺄셈결과: " + operList[1]);
        System.out.println("곱셈결과: " + operList[2]);
        System.out.println("나눗셈결과: " + operList[3]);

    }
}

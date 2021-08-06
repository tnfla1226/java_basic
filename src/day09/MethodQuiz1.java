package day09;

public class MethodQuiz1 {

    static int calDivisor(int num) {
        int divTotal = 0;

        System.out.print(num + "의 약수: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.printf("%d ", i);
                divTotal += i;
            }
        }
        System.out.println();
        return divTotal;
    }

    public static void main(String[] args) {

        System.out.println("10의 약수의 총합: " + calDivisor(10));
        System.out.println("---------------------------");
        System.out.println("30의 약수의 총합: " + calDivisor(30));
    }
}

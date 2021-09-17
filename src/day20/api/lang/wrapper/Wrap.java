package day20.api.lang.wrapper;

public class Wrap {

    static int x;
    static Integer y;

    public static void main(String[] args) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = 5;
        y = 7;
        System.out.println(x +  y);

        Object[] arr = {5, 8.8, "hello"};   //Integer, Double, String으로 넣음 (객체)

        int n = 100;
        Integer m = n;

        //문자열 변환기능
        String s1 = "90";
        String s2 = "5.11";

        int i = Integer.parseInt(s1);
        double d = Double.parseDouble(s2);

        System.out.println(i + d);
    }
}

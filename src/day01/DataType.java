package day01;

import java.sql.SQLOutput;

public class DataType {

    public static void main(String[] args) {

        //정수형
        byte a = 127;
        short b = 32767;
        int c = 2147483647; //21억 넘으면 int 사용X
        long d = 2147483648L; //long에 들어가기 전에 int로 들어가기 때문에 막힘, L은 long타입으로 변환

        //실수형
        float f1 = 3.84848484848F;   //4byte
        double d1 = 3.848484848484848;  //8byte

        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);


        double n = 0.0;
        for (int i = 0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println("0.1을 100번 더한 결과: " + n);    //실수를 계산할때 어느정도 살짝 오차는 발생함

        //논리형
        boolean b1 = true;
        boolean b2 = false;
        //자바의 논리형은 js처럼 falsy값이 존재하지 않는다.
//        boolean b3 = 0; //false로 안됨
//        boolean b4 = null;
//        boolean b5 = "true";
//        boolean b6 = False;

        //문자형
        //char : 단일문자를 저장, 홑따옴표 사용
        char c1 = 'A';
        //String: 문자열을 저장, 곁따옴표 사용, 기본타입 아님
        String s1 = "abcdef";

        System.out.println("100" + "200");
        //  숫자와 문자열의 덧셈은 문자열 덧셈처리
        System.out.println(100 + "200");

//        System.out.println("200" - 100);

    }
}

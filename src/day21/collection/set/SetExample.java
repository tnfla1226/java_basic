package day21.collection.set;

import java.util.HashSet;
import java.util.Set;


public class SetExample {

    public static void main(String[] args) {

        //Set: 중복 저장 허용X, 순서없이 빠르게 저장, 전체탐색속도 빠름름
        Set<String> set = new HashSet<>();

        //add(obj):set에 객체 추가
        set.add("김말이");
        set.add("닭강정");
        set.add("단무지");
        set.add("김밥");
        set.add("김말이");

        System.out.println("size: " + set.size());
        System.out.println(set);

        //set 반복문 처리
        System.out.println("========================");
        for (String s : set) {
            System.out.println(s);
        }

        //remove(obj): set의 객체 삭제
        set.remove("단무지");
        System.out.println(set);

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}

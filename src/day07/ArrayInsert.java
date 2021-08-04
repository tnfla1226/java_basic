package day07;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        //배열의 중간데이터 삽입
        int[] arr = {10, 20, 40, 50};
        int insertData = 30;
        System.out.println("삽입 전: " + Arrays.toString(arr));

        //삽입 인덱스
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < temp.length-1; i++) {
            temp[i] = arr[i];
        }

        int insertIdx = 2;
        for (int i = temp.length-1; i > insertIdx; i--) {
            temp[i] = temp[i-1];
        }
        temp[insertIdx] = insertData;

        arr = temp; temp = null;

        System.out.println("삽입 후: " + Arrays.toString(arr));
    }
}

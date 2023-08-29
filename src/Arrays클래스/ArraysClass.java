package Arrays클래스;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;

// Arrays 클래스는 배열을 다루기 위한 다양한 메소드가 포함되어 있습니다.
public class ArraysClass {
    public static void main(String[] args) {
        Integer[] int_arr = {5, 3, 4, 7, 8, 9, 2, 1};
//      Arrays.sort(int_arr);
        Arrays.sort(int_arr, Collections.reverseOrder()); // 컬렉션 구조에서는 참조형을 받지 않아서 박싱을 해야한다.
        for (int e : int_arr) System.out.println(e + " ");
        // 정렬 오버라이딩 : 재정의
        // Arrays.sort(int_arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                if (i1 > i2) return 1; // 오름차순
//                if (i1 < i2) return -1; // 내림차순
//
//  });
    }
}

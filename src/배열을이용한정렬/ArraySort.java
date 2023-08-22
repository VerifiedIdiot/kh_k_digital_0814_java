package 배열을이용한정렬;
// 1차원 배열을 이용한 기본 정렬 (버블 정렬 / 삽입 정렬)
// 사용 예시의 버블 정렬은 일반적인 방법과 약간의 차이가 있다.
// 기본적인 버블정렬이나 삽입정렬은 시간의 복잡도를 나타내는 빅오표기법으로 표시하면 0(n2)

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
// Arrays.sort() 의 동작 과정을 절차지향으로 풀면 다음과 같다
        int[] arr = {9, 4, 3, 10, 5, 8, 7, 6, 2, 1}; //
        int tmp = 0; // 정렬을 위한 임시 공강(데이터)
        for(int i = 0; i <arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int i : arr) System.out.print(i + " ");


//        Arrays.sort(arr);
//        System.out.print(Arrays.toString(arr));
    }
}

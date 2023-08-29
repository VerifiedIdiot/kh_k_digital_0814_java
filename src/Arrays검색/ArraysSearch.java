package Arrays검색;

import java.util.Scanner;
import java.util.Arrays;
public class ArraysSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열의 갯수 :");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("찾을 수 입력 : ");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * num) * 1;
        }
        Arrays.sort(arr);
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        int result = Arrays.binarySearch(arr, key); // 정렬된 배열을 이분 검색 함
        if(result >= 0) System.out.println(result); // 인덱스가 넘어옴

    }
}

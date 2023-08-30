package X보다작은수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LessThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt(); // 배열의 갯수
        int x = sc.nextInt(); // 크기를 비교하는 기준 값 (미만 값을 찾음)
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // 리스트 입력 받은 값 출력
        }
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " "); // 리스트 순회에서 미만 값 출력
        }
    }
}

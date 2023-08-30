package 홀짝나눠담기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// 7개의 정수를 입력 받는 메서드 만들기
// 홀수와 짝수 배열로 나누어 담는 함수 만들기
// 홀수와 짝수를 출력 하는 함수 만들기
// 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6
// 클래스를 생성해서 만들기
public class OddEvenArray {
    public static void main(String[] args) {
        arrayInt result = new arrayInt();
        result.inputInt();
        result.numbers();
        result.output();
    }
}


class arrayInt {
    int[] arr = new int[7];
    int[] arr2 = new int[7];
    int[] arr3 = new int[7];
    int idx1 = 0;
    int idx2 = 0;


    void inputInt() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void numbers() {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                arr2[idx1++] = i;
            else arr3[idx2++] = i;
        }
    }

    void output() {
        System.out.println("짝수");


//        arr2 = Arrays.stream(arr2).distinct().toArray();
//            System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < idx1; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
        System.out.println("홀수");

//        arr3 = Arrays.stream(arr3).distinct().toArray();
//        List<Integer> newList = Arrays.stream(arr3)
//                                .boxed().collect(Collectors.toList());
//        newList.remove(Integer.valueOf(0));
            //System.out.println(Arrays.toString(arr3));
            for (int i = 0; i < idx2; i++) {

                System.out.print((arr3[i]) + " ");
            }
        }
    }


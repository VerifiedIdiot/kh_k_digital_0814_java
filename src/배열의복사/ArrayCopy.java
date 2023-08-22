package 배열의복사;
// 자바의 배열은 한번 선언하면 크기를 동적으로 변경 할 수 없습니다.
// 배열의 크기를 변경하기 위해서는 더 큰 배열을 만들고 기존 배열의 데이터를 옮겨 담아야 합니다.
// arraycopy() : System.arraycopy(Obj src, int srcPos, Obj dest, int destPos, int Length);

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
//        int newLen = 5;
//        int[] arr2 = new int[newLen];
//        System.arraycopy(arr1, 0, arr2, 0, arr1.length); //
//        for (int i : arr2) {
//            System.out.println(i);
        int[] arr3 = Arrays.copyOf(arr1, 10);
        for(int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
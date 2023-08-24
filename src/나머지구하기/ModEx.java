package 나머지구하기;
// 10개의 수를 입력 받은 뒤, 이를 42로 나눈 나머지를 구함



import java.util.Arrays;
import java.util.Scanner;

public class ModEx {
    public static void main(String[] args) {
        int[] arr = new int[42];
        int n; // 입력 받은 값
        int cnt = 0; // 42로 나눈 나머지가 다른 경우에 대한 총 횟수
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 10개 입력 : ");
        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            arr[n % 42] = 1;  // 입력 받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입
        }
//        for(int val : arr) cnt += val;
//        System.out.println(cnt);
        System.out.println(Arrays.toString(arr));
    }

}

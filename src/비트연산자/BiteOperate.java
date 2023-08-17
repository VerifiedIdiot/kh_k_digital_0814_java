package 비트연산자;
// 비트 연산자는 비트 단위의 연산을 수행 합니다.
// AND : & 비교하는 두개의 비트가 모두가 1이여야 1
// OR : | 비교하는 두개의 비트가 한쪽만 1이면 1이됨
// XOR : ^ 비교하는 두 비트가 서로 다른 경우만 1
// NOT : ~ 현재의 비트의 값을 반전 시킴
// 왼쪽 쉬프트 : << 비트를 왼쪽으로 이동 시킴
// 오른쪽 쉬프트 : >> 비트를 오른쪽으로 이동 시킴
public class BiteOperate {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);
        System.out.println(num1 << 1);
        System.out.println(num1 >> 1);
    }
}

package 스택기본;

import java.util.Stack;

// Stack은 제일 나중에 들어 온 값이 가장 먼저 빠져 나가는 구조
public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek()); // 맨 위에 값을 확인 = 4
        System.out.println(stack.pop()); // 맨 나중에 들어 온 값을 끄집어 냄 = 4
        System.out.println(stack.empty()); // 현재 스택이 비어 있는지 확인
        System.out.println(stack.size()); // 스택이 내에서 몇개의 데이터가 있는지 확인
        System.out.println(stack.contains(1)); // 매개변수의 값이 스택 내에 존재하는지
    }
}

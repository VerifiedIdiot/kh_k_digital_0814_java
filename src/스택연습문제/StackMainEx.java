package 스택연습문제;

import java.util.Scanner;
import java.util.Stack;

public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("수식을 입력 : ");

        String exp = sc.next();
        // 입력 받은 문자열 길이 만큼 반복 순회
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.empty()) st.pop(); // 닫힌 괄호 일 때 pop
                else {
                    System.out.println("괄호가 일치 하지 않습니다.");
                    return;
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("괄호가 일치 합니다.");
        } else {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}

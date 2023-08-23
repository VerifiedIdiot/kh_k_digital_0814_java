package KMP;

// Knuth-Morris-Pratt => KMP
// Mirko-Slavko ==> MS

import java.util.Scanner;

// split("-") 메서드를 이용해서 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
// 0번째 선택, "-" 다음의 첫번째 문자를 선택하는 방법
// 대문자만 골라냄 (charAt(인덱스) , toCharArray())
public class KMPEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 내가 한 방법 replaceAll() 로 소문자 및 "-" 전부 제거
        while (true) {
            System.out.println("문자열을 입력하세요 (종료 exit 입력): ");
            String name = sc.next();

            if ("exit".equals(name)) {
                System.out.println("종료.");
                break;
            }

            // 소문자들을 ""(빈 문자열)로 대체 및 - 제거
            String result = name.replaceAll("[a-z]", "");
            result = result.replaceAll("-", "");
            System.out.println("결과: " + result);
        }
//
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
        // 1. charAt(인덱스)
//        for (int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) >= 'A' && name.charAt(i) <='Z') System.out.print(name.charAt(i));
//        }

        // 2. 첫번째 문자 선택, '-' 다음 문자 선택

//        for (int i = 0; i < name.length(); i++) {
//            if (1 == 0) System.out.print(name.charAt(i));
//            else {
//                if (name.charAt(i) == '-') System.out.print(i+1);
//            }
//        }

        // 3. split() 메서드를 사용하는 방법
//
//        String[] splitName = name.split("-");
//        for(String e : splitName) System.out.println(e.charAt(0));

        // 4. toCharArray() : 문자열을 문자 배열[0,1,2,3]로 변경
//        char[] chName = name.toCharArray(); // 문자열을 문자 배열로 변환
//        for (char ch : chName){
//            if (ch >= 'A' && ch <= 'Z') System.out.print(ch);
//        }


    }
}
package 문자열반전;
//  문자열을 입력 받음 : abcd -> dcba
//  문자열의 길이는 length()로 확인 가능
//  문자열의 인덱스는 0부터 시작함에 유의 해야함


import java.util.Scanner;

public class CharacterReverse {
    public static void main(String[] args) {
        System.out.print("문자열을 입력 해 주세요 : ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(word.length());

        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);  // 문자 하나를 가져옵니다.
            System.out.print(ch);      // 해당 문자를 출력합니다.
        }
        System.out.println();  // 줄바꿈을 위한 출력
    }
}
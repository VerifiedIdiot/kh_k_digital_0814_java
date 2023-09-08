package 가장많이사용한알파벳구하기알고리즘;

import java.util.Scanner;

public class AlphabetVerifier {

    static int[] alpha;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();


        for (int i = 0; i < A.length(); i++) { // Mississipi
            if(A.charAt(i) >= 'a') alpha[A.charAt(i) - 'a']++;
            else alpha[A.charAt(i) - 'A']++;
        }
    }
}

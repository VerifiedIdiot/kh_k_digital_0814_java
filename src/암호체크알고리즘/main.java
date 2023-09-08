package 암호체크알고리즘;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        while(true) {
            password = sc.next();
            if(password.equalsIgnoreCase("quit")) break;
            PasswordChecker.inputPW(password);
        }
    }
}

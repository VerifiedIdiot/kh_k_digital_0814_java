package 알고리즘_저항항;

import java.util.Scanner;

public class 저항 {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] multiple = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int Val1 = 0, Val2 = 0, Val3 = 0;
        Scanner sc = new Scanner(System.in);
        String Color1 = sc.nextLine();
        String Color2 = sc.nextLine();
        String Color3 = sc.nextLine();
        for(int i = 0; i < 10; i++) {
            if(Color1.equals(color[i])) Val1 = i;
            if(Color2.equals(color[i])) Val2 = i;
            if(Color3.equals(color[i])) Val3 = multiple[i];
        }
        System.out.println(Integer.toString(Val1) +(Val2 * Val3));
    }
}
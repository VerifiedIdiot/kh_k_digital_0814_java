package 문자열다루기;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_Exercise {
    public static void main(String[] args) {

        int[] menu = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.print("메뉴를 입력 하쇼 : ");
            menu[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(menu));
//        int min_burger = menu[2];
//        int min_drink = menu[4];
//        for(int i = 0; i < 5; i++) {
//            if((i < 3) && (min_burger > menu[i])) min_burger = menu[i];
//            if((i > 2) && (min_drink > menu[i])) min_drink = menu[i];
//        }
//        System.out.println((min_burger + min_drink -50));

        int[] burgers;
        int[] drinks;
        burgers = Arrays.copyOfRange(menu, 0 , 2);
        drinks = Arrays.copyOfRange(menu , 3 ,4);
        Arrays.sort(burgers);
        Arrays.sort(drinks);
        System.out.println(burgers[0] + drinks[0] -50);
    }
}

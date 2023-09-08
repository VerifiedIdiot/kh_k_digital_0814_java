package 손익분기점알고리즘;

import java.util.Scanner;

public class main {
    int static_cost; // 고정비 (A)
    int flexible_cost; // 가변 비용 (B)
    int laptop; // 노트북 비용 (C)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int static_cost = sc.nextInt(); // 고정비 (A)
        int flexible_cost = sc.nextInt(); // 가변 비용 (B)
        int laptop = sc.nextInt(); // 노트북 비용 (C)

        System.out.println(static_cost + " " +flexible_cost + " " + laptop );

        if (flexible_cost >= laptop) {
            System.out.println("가변값이 노트북 판매값보다 비싸서 손해");
            return;
        }
        while(true) {
            if(static_cost + (flexible_cost * cnt) < laptop * cnt) break;
            cnt++;
        }
        System.out.println(cnt);


    }
}

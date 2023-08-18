package 별찍기연습;

// 크리스마스트리형 별찍기
// 입력 받은 수만큼 별찍기


import java.util.Scanner;

public class StarEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력을 해주쇼 : ");
        int star = sc.nextInt();


        for(int i=0; i<star; i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
           System.out.println("");
        }

    }
}

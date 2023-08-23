package PC방알바;

import java.util.Scanner;
import java.util.Arrays;
public class PcRoomEx {
    public static void main(String[] args) {

        int[] pcRoom = new int[100];
        int cnt = 0, seatNum;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("원하는 자리를 선택해 주세요. : ");

        while (true) {


            pcRoom[n] = -1;
            System.out.println(n+"번 자리를 차지하였습니다.");
            if (n == -1) {
                System.out.println(n+"번 자리는 이미 사람이 있습니다.");
                cnt = cnt +1 ;
                break;
            }

        }

//            for (int i = 0; i < 100; i++) {
//                if (pcRoom[n] == -1) {
//                    cnt++;
//                }
            }
        }
    //    System.out.println((pcRoom[n]));

  //  }

//            System.out.println("원하는 자리를 선택해 주세요. : ");
//            System.out.println("현재 차지한 자리 : " + n +"번");
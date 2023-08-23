package 영화표예매;

import java.util.Scanner;

public class MovieTicket {
    // 좌석의 개수
    int seat[] = new int[10]; // 인스턴스 필드
    int ticketPrice;
    MovieTicket(int price) {
        ticketPrice = price;
    }


    // 판매된 좌석의 개수를 확인 총 판매 금액을 구해서 반환
    int totalAmount() {
        int cnt = 0; // 지역 변수
        for (int val : seat) { // val이라는 벼수는 seat 배열을 처음부터 끝까지 순회함
            if (val == 1) cnt++;
            
        }
        return cnt * 12000; // 반환값이 int형
    }
    void printSeat() { // 선택 가능한 좌석의 리스트를 보여 줌
        for (int i = 0; i < seat.length; i++) {
            if (seat[i] == 0)
                System.out.print("[X]"); // 판매가 안된 좌석
            else System.out.print("[O]"); //이미 판매가 된 좌석을 의미

        }
        System.out.println(); //
    }
    void selectSeat() {
        printSeat();
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호를 입력 하세요. : ");
        int seatPos = sc.nextInt();
        if(seat[seatPos-1] == 0) {
            seat[seatPos-1] = 1;
            printSeat();
        } else System.out.println("이미 예약된 좌석 입니다. 다른 좌석을 선택 하세요.");
    }
}
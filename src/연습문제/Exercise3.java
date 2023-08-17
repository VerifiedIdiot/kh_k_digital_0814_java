package 연습문제;


import java.time.format.DateTimeFormatter;



import java.time.Month;
import java.util.Scanner;


public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("제목 : ");
        String title = sc.next();

        System.out.print("일시 : ");
        String date = sc.next();

        System.out.print("시간 : ");
        String time = sc.nextLine();

        String str_month = date.substring(4, 6);
        //Month month = convertToMonth(str_month);
        switch (str_month) {
            case "12":
            case "01":
            case "02":
                System.out.print("추운겨울");
                break;
            case "03":
            case "04":
            case "05":
                System.out.print("봄");
                break;
            case "06":
            case "07":
            case "08":
                System.out.print("여름");
                break;
            case "09":
            case "10":
            case "11":
                System.out.print("가을");
                break;

        }
    }
}
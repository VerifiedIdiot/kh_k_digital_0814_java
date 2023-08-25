package 인터페이스실습;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NetworkAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택 하세요[1]LAN, [2]WiFi, [3]LTE : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 -> {
                adapter = new LAN("KT Magapass");
                adapter.connect();
            }
            case 2 -> {
                adapter = new WiFi("SK Telecom");
                adapter.connect();
            }
            case 3 -> {
                adapter = new LTE("LG U+");
                adapter.connect();
            }
            default -> System.out.println("네트워크 선택이 잘 못 되었습니다.");
        }
    }
}
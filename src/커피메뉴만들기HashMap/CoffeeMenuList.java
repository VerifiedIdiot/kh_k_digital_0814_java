package 커피메뉴만들기HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// HashMap으로 커피 메뉴 리스트 만들기
public class CoffeeMenuList {
    // 문자열로 만들어진 키와 커피의 여러가지 정보가 포함된 객체를 값으로 사용
    static Map<String, MenuInfo> map = new HashMap<>();

    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }

    static void makeMenu() {
        map.put("아메리카노", new MenuInfo("아메리카노", 1500, "커피", "기본커피"));
        map.put("에스프레소", new MenuInfo("에스프레소", 1000, "커피", "커잘알 전용"));
        map.put("카페라떼", new MenuInfo("카페라떼", 2000, "커피", "근본"));


    }

    static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key = null; // 키를 받기 위한 문자열 변수
        while (true) {
            System.out.println("=".repeat(5) + "메뉴를 선택 하세요 : " + "=".repeat(5));
            System.out.println("[1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴수정, [6]종료 :");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1:
                    System.out.println("=".repeat(5) + "메뉴보기" + "=".repeat(5));
                    for (String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).category);
                        System.out.println("설명 : " + map.get(e).description);
                        System.out.println("=".repeat(20));
                    }
                    break;
                case 2:
                    System.out.println("조회할 메뉴를 선택 하세요");
                    key = sc.next();
                    // 포함여부를 확인하는 메소드 containsKey(key) : map 내의 해당 키가 있는지 확인 후 true or fals 결과를 반환
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).category);
                        System.out.println("설명 : " + map.get(key).description);
                    } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;
                case 3:
                    System.out.print("추가 할 메뉴를 입력 하세요 : ");
                    key = sc.next(); // key 이면서 메뉴이름이 된다.
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.nextLine();
                        sc.nextLine();
                        //sc.nextLine(); // 버퍼 비우기
                        System.out.print("설명 입력 : ");
                        String description = sc.next();
                        map.put(key, new MenuInfo(key, price, category, description));
                    }
                    break;
                case 4:
                    System.out.print("삭제할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + " 메뉴를 삭제 하였습니다.");
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    }
                    break;
                case 5:
                    System.out.print("수정할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        //sc.nextInt(); // 버퍼 비우기
                        System.out.print("설명 입력 : ");
                        String description = sc.next();
                        map.replace(key, new MenuInfo(key, price, category, description));
                    } else {
                        System.out.println("수정 할 메뉴가 없습니다.");
                    }
                    break;
                case 6:
                    System.out.println("메뉴를 종료 합니다.");
                    System.exit(0);
                default: System.out.println("선택하신 메뉴가 없습니다.");


            }




        }
    }
}
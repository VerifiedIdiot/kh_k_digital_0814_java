package List인터페이스;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        // list 인터페이스의 참조변수로 ArrayList 객체를 참조함
        ArrayList<MenuInfo> menuList = new ArrayList<>();
        // add는 객체를 추가, 추가 할 때 마다 크기가 변함
        menuList.add(new MenuInfo("Americano", 2000, true));
        menuList.add(new MenuInfo("Latte", 4000, true));
        menuList.add(new MenuInfo("Espresso", 2500, true));
        // 향상된 for문 : 배열이나 Collection 클래스 자식들
        for (MenuInfo m : menuList) {
            System.out.println(m.getJsonFormat());
        }
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(menuList.get(i).getJsonFormat());
        }
    }
}


class MenuInfo {
    String name = "";
    int price;
    String category = "";
    String desc = "";
    boolean isTax;

    MenuInfo(String name, int price, boolean isTax) {
        this.name = name;
        this.price = price;
        this.isTax = isTax;
    }

    public String getJsonFormat() {
        return "{" + "\"name\":" + name + "," + "\"price\":" + price + "," + "\"isTax\":" + isTax + "}";
    }
}



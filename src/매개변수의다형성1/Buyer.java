package 매개변수의다형성1;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) { // 구매에 대한 메소드, 부모 클래스의 참조 변수로 자식 객체를 접근함
        money -= p.price;
        bonusPoint += p.bonusPoint;


    }
    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);

    }


}

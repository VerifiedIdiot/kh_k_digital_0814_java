package 디폴트메소드중복;

public interface Buy {
    void buy(); // public abstract 자동으로 추가 됨
    default void order() { // 예외적으로 구현부를 가짐
        System.out.println("구매 주문");
    }
}

interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}

class Customer implements Buy, Sell {

    @Override
    public void sell() {

    }

    @Override
    public void buy() {

    }

    @Override
    public void order() {
        Buy.super.order(); // 부모의 참조변수를 명시적으로 지정하였기에 에러 x
        Sell.super.order(); // 부모의 참조변수를 명시적으로 지정하였기에 에러 x
    }
}

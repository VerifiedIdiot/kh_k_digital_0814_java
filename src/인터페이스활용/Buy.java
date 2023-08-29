package 인터페이스활용;

public interface Buy {
    void buy();
}

interface Sell {
    void sell();
}


class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}
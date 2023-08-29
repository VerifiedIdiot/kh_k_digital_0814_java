package 다중인터페이스상속;

public class Car {
    protected int speed; // 상속 관계가 성립되면 접근 가능
    protected String color;
    protected String year;
    public Car() {
        speed = 150;
        color = "white";
        year = "1999";
    }
}

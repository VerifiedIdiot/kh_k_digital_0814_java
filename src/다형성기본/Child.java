package 다형성기본;

public class Child extends  Parent{
    private int x = 100;
    public Child() {}
    public void out() {
        System.out.println("부모의 protected num 필드 : " + num);
        System.out.println("자식 클래스 메소드");
    }

    @Override
    public void display() {
        System.out.println("상속 받아 재정한 메소드");
        }

    }


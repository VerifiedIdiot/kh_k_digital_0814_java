package 추상클래스기본;
// 추상클래스는 클래스앞에 abstract 키워드를 붙여서 만듬
// 추상클래스는 객체화 안됨
// 내부에 0개 이상의 추상 메소드가 포함되어있음
// 추상메소드는 상속 받는 클래스에서 오버라이딩 해줘야 함 (해당 메소드의 기능을 구체화 시킴)

public  abstract class AnimalClass {
    abstract void cry(); //추상 메소드 : 상속 받을 클래스에서 구체화를 해줘야 함.(오버라이딩)
    void sleep() { //일반 메소드, 추상클래스에는 추상메서드와 일반 메서드 포함.
        System.out.println("zzzzzzz");
    }

}

class Cat extends AnimalClass {
    @Override
    void cry() {
        System.out.println("냐옹냐옹!!!");
    }
    @Override
    void sleep() {
        System.out.println("zzzzzzzzzzzzzzzz");
    }
}

class Dog extends AnimalClass {
    @Override
    void cry() {
        System.out.println("멍멍...");
    }
}
package 추상클래스두번째;

public class Smartphone extends Phone {
    public Smartphone(String name) {
        super(name); // 부모의 생성자 호출
    }
    @Override
    void call() { // 추상메소드를 오버라이드 함 ,  선언만 된 빈껍데기의 내용을 재정의 하여야한다.
        System.out.println("부모 클래스의 Call() 메소드를 구체화 함 , 통화 기능 완성");

    }
    public void internet() {
        System.out.println("인터넷을 검색 합니다.");
    }
}

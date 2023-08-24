package 싱글톤;

public class Singleton {
    String name;
    int id;
    // 클래스 내에서 단 한번 객체를 생성함
    private static Singleton singleton = new Singleton();
    // 생성자를 외부에서 호출되지 않도록 접근 제한 함
    private Singleton() {
        name = "test";
        id = 100;

    }
    // 한번 만들어진 객체에 대한 주소를 반환 함
    static Singleton getSingleton() {
        return singleton;
    }
}

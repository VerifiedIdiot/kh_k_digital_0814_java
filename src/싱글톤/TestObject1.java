package 싱글톤;

public class TestObject1 {
    Singleton single = Singleton.getSingleton();
    void setInfo(String name, int id) {
        single.name = name;
        single.id = id;
    }

    void viewInfo() {
        System.out.println("이름 : " + single.name);
        System.out.println("아이디 : " + single.id);;
    }
}
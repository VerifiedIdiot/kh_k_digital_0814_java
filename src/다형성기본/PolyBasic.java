package 다형성기본;

public class PolyBasic {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();
        child.out();
        child.display();
        parent.display();

        Parent p = new Child(); // 부모 클래스의 참조 변수로 자식 객체를 접근
        p.display(); // display() 어느게 불러질까용 ? --> 오버라이딩이 일어나 자식 메서드가 호출됨


    }
}



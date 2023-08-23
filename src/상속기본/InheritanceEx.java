package 상속기본;
// 상속 : 자식 클래스가 부모 클래스의 기능을 물려받는것 (필드와 메소드)
// 키워드는 extends
public class InheritanceEx {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.setName("poppy");
//        dog.sleep();
//        System.out.println(dog.name);
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep(10);


    }
}

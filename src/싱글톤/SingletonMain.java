package 싱글톤;
// 객체가 한번만 생성되는 것
public class SingletonMain {
    public static void main(String[] args) {
        // Singlton test = new Singleton(); private 하고 static 하여 생성자로 객체 생성 불가
        TestObject1 member1 = new TestObject1();
        TestObject2 member2 = new TestObject2();
       for(int i = 0; i < 1000; i++) {
           member1.setInfo("동그라미" , 27);
           member2.setInfo("세모" , 35);

       }
    }
}

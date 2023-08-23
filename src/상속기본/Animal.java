package 상속기본;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
// Animal을 상속 받아 Dog 클래스를 만듬

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }
    void sleep(int hour) {
        System.out.println(this.name + " zzz");
    }

}
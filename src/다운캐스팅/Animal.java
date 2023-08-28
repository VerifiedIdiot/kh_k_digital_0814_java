package 다운캐스팅;

public class Animal {
    public void move() {
        System.out.println("동물이 움직이는군.");
    }
}

class Humanz extends Animal{
    @Override
    public void move() {
        System.out.println("사람들이 움직이는게 ~~");
    }
    public void interesting() {
        System.out.println("신기해 ~");
    }
}
class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이는 으르렁.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리는 하늘을 납니다.");
    }
    public void flying() {
        System.out.println("독수리가 날아갑니다.");
    }
}
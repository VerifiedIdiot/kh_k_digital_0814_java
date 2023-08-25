package 추상클래스두번째;
// Phone은 인스턴스화 될 수 없음
public abstract class Phone {
    public String name;
    public boolean ispower;
    public Phone(String name) {
        this.name = name;

    }
    public void setPower(boolean ispower) {
        this.ispower = ispower;
        if (ispower) System.out.println("Phone Power ON");
        else System.out.println("Phone Power OFF");
    }
    abstract void call(); // 추상메서드여서 선언만 되어있고 내용이 없는 상태
}
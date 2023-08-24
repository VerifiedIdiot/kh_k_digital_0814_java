package 접근제한자;

public class Restrictor {
    public void seoul() {
        System.out.println("서울에 대한 메소드 입니다.");
    }
    protected void busan() {
        System.out.println("부산에 대한 메소드 입니다.");
    }
    void daegu() {
        System.out.println("대구에 대한 메소드 입니다.");
    }
    private void incheon() {
        System.out.println("인천에 대한 메소드 입니다.");
    }
}

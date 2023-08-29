package Object클래스;

public class CloneObject implements Cloneable {
    public static void main(String[] args) {
        Member mem1 = new Member("bear" , "곰돌이사육사" , "123456" , 20,true);
        Member mem2 = mem1.getMember(); // 얕은 복사가 일어나는 조건
        mem1.viewInfo();
        mem2.name = "KH";
        mem2.password = "비밀번호 바뀜";
        mem2.viewInfo();
        mem1.viewInfo();


    }
}

package Vector클래스;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// ArrayList 구조와 메소드가 동일, 동기화가 지원되어서 멀티쓰레드 환경에 안전함. 하지만 ArrayList 대비 성능이 떨어짐
public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("우영우","mail.com","01088884444","자폐아"));
        list.add(new NameCard("영우영","mail.com2","01044448888","자폐아"));
        list.add(new NameCard("가나다","mail.com2","01044448888","자폐아"));

        for(NameCard e : list) {
            System.out.print(" " + e.name);
            System.out.print(" " + e.mail);
            System.out.print(" " + e.phone);
            System.out.print(" " + e.jobs);
        }

    }
}


class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}
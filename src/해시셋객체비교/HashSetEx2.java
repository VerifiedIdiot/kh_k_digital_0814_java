package 해시셋객체비교;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "유나");
        Member member2 = new Member(1002, "채원");
        Member member3 = new Member(1003, "지수");
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        hashSet.add(new Member(1003, "카리나")); // 주소값이 다르기 때문에 중복이 아니다 . 하지만
        // 각 대입마다 new 연산자를 사용하지 않고 대입을 하게 되면 HashCode 값이 같아서 중복이 발생한다.
        for (Member e : hashSet) e.showMember();

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        //s1.addAll(s2); // 합집합 : 양쪽 모두에 있는것 , 중복 제거
        //s1.retainAll(s2); // 교집합 : 양쪽 모두 존재하는 앙목
        //s1.removeAll(s2); // 차집함 : 앞에서 뒤를 빼는 것
        System.out.println(s1);
    }
}


class Member {
    int id;
    String name;
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) { // 다운캐스팅이 성립하는지 확인하기 위한 조건
            Member member = (Member) obj;
            if (this.id == member.id) return true; // id가 같으면 중복이라고 판별
            else return false ;
        }
        return false;
    }



    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}
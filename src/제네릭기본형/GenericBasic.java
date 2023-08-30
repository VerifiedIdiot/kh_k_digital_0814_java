package 제네릭기본형;

import java.util.List;
import java.util.ArrayList;

public class GenericBasic {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        String str = (String) list.get(0); // toString()으로 대체 가능
        // 캐스팅 , 문자열 str에 인덱스를 집어 넣은거지 해당 인덱스에 .. 다음줄
        // 요소의 타입을 명시 하지 않았기에 캐스팅을 하지않으면 에러가 발생
        System.out.println(str);
        // 제네릭 타입으로 변환
        List<String> list2 = new ArrayList<>();
        list2.add("java");
        String str2 = list2.get(0);
        System.out.println(str2);
    }
}

package List인터페이스;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// 리스트 인터페이스는 ArrayList, Linked List, Vector의 부모로 인터페이스로 구현되어 있음
// 리스트 구조는 배열과 유사하고 , 차이점은 동적으로 크기가 변한다
// ArrayList, Linked List, Vector 거의 동일한 메소드를 가지고 있어 코드 변환이 자유로움
// ArrayList : 리스트 타입의 대표적인 자료 구조 (특별한 경우가 아니면 이것만 씀)
// - 검색이 번번한 경우 효율적이며, 맨 뒤에 입력이 일어나는 경우에는 효과적임
public class ListEX1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("100"); // List에 값을 추가 add()
        list.add("200");
        list.add("300");
        System.out.println(list);
        System.out.println(list.get(2)); // 특정 위치에서 값을 가져 올 때 : get(idx)
        System.out.println(list.size()); // List의 크기를 가져 올 때 : size()
        System.out.println(list.contains("222")); // 특정 값이 있는지 boolean값 return : contains()
        System.out.println(list.remove("129")); // 특성 인덱스나 특정 요소를 지울 수 있다 true or false : remove()

//        list.sort(Comparator.naturalOrder());  내림차순 정렬
//        list.sort(Comparator.reverseOrder());  올림차순 정렬

    }
}

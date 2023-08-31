package 해시셋;
import java.util.Arrays;
import java.util.HashSet;
// 값의 중복 허용 하지 않음 , 순서 보장 하지 않음 , 수학의 집합과 유사한 개념

public class HashSetMain {
    public static void main(String[] args) {
        //String[] arr = {"H","e","l","l","o"};
//        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
//        System.out.println(set);
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java"); // 중복 value로 인한 오류
        for (String e : set) System.out.println(e + " ");

    }
}

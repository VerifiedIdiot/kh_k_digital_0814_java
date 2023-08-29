package Arrays클래스;
import java.util.Arrays;
import java.util.Comparator;
public class ArraysSort {
    // 길이순 정렬 , 길이가 같으면 사전 순 정렬
    public static void main(String[] args) {
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) { // 길이가 같으면 사전 순 정렬 조건
                if(o1.length() > o2.length()) return 1; // 첫번째가 두번째 보다 길이가 길면 정렬 조건
                else {
                    if(o1.length() == o2.length()) { 
                        // 비교 대상의 객체가 작으면 음스 반환 
                        // 비교 대상의 객체가 크면 양수 반환
                        // 비교 대상의 객체가 같으면 0 반환
                        return o1.compareTo(o2); // 두번째가 사전순서상 앞에 있으면 양수
                    }
                    return -1; // 현 상태 유지
                }
            }
        });
        System.out.println(Arrays.toString(fruit));
    }
}

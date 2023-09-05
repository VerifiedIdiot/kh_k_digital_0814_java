package 스트림예제1번;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 스트림이란 ? 함수형 프로그램을 이용해 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
// - 자료의 대상에 상관없이 동일한 연산 수행
// - 내부 반복자 사용(반복문 배제하기 위한 방법)
// - 원본 데이터를 변경하지 않음
// - 지연 연산과 병렬 처리 지원 (성능 향상을 위한 방법)
public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//         스트림을 생성(1회용), 중간연산, 최종연산
//        list.stream().filter(s->s >= 5).forEach(e->System.out.println(e + " "));
//        int sumVal = list.stream().mapToInt(e->e).sum(); // mapToInt (e, int 스트림으로 변환)
        int sumVal = list.stream().reduce(0, Integer::sum);
        int count = (int) list.stream().count();
        // int count = list.size();
        System.out.println("합계 : " +sumVal);
        System.out.println("횟수 : " +count);



    }
}

package 함수형프로그래밍;
// 함수형 프로그래밍은 자바 8에서 도입
// 자료 처리를 수학적 함수의 계산으로 취급하고 상태와 가변 데이터를 멀리하는 프로그래밍 패러다임
// 한마디로 메서드 떡칠로 최대한 짧게 코딩하라

// 객체 지향 코드로 만들기

interface Calcurator {
    int sum(int a, int b);
}

//class MyCalculator implements Calcurator {
////    @Override
////    public int sum(int a, int b) {
////        return a + b;
////    }
////}

// 람다식으로 변환하기
public class FuncTypeEx {
    public static void main(String[] args) {
//        MyCalculator mc = new MyCalculator();
//        int result = mc.sum(10,20);
        Calcurator mc = (int a, int b) -> a + b; // 인터페이스 상속을 받아 클래스 대신 람다식을 사용
        int result = mc.sum(10, 20);

        System.out.println(result);


    }
}




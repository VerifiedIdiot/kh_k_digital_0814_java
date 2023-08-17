package 형변환;
// 형변환 : 하나의 데이터 타입을 다른 타입으로 변환 하는 것

//암시적 형변환 (Implicit Casting)
//컴파일러가 자동으로 타입을 변환해주는 경우입니다.
//보통 크기가 작은 데이터 유형에서 크기가 큰 데이터 유형으로 변환할 때 발생합니다. 이 때 데이터의 손실은 발생하지 않습니다.
//예: int에서 double로의 변환

//명시적 형변환 (Explicit Casting)
//프로그래머가 직접 형변환을 지정해야 하는 경우입니다.
//크기가 큰 데이터 유형에서 크기가 작은 데이터 유형으로 변환할 때 필요하며, 데이터의 손실이 발생할 수 있습니다.
//예: double에서 int로의 변환

//업캐스팅 (Upcasting)
//서브 클래스의 객체를 슈퍼 클래스의 참조로 변환하는 것입니다. 항상 안전하며 암시적으로 발생합니다.

//다운캐스팅 (Downcasting)
//슈퍼 클래스의 참조를 서브 클래스의 참조로 변환하는 것입니다. 명시적으로 수행되어야 하며, 런타임에서 타입 체크가 이루어집니다.

public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 1 , num2 =4;
//        double result1 = num1 / num2; // int 에서 double 로 형변환 --> 유리한 업캐스팅
//        double result2 = (double) num1 / num2; // 명시적, 묵시적 형변환이 일어남
        String kor = "90";

        int mat = 88;
        int eng = 56;
        int total = Integer.parseInt(kor) + mat + eng; // 총점
        double avg = (double)total / 3;

        System.out.println(avg);


    }
}
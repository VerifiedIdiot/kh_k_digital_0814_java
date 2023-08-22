package 참조타입기초;
// 자바의 데이터 타입은 기본(Primitive)과 참조(Reference)으로 나누어져 있다.
// 기본타입은 정수, 실수 , 문자(char) , 논리값 등을 저장하는 타입 . 실제 값이 변수에 저장됨
// 참조타입은 객체의 주소값을 변수에 저장 , 실제값은 반영 되지않고 위치를 가르킨다 , (배열, 열거형 ,인터페이스, 클래스, 문자열 등)

//Static 영역:
//        이 영역은 클래스 정보, 정적 변수(static 변수) 등을 저장합니다.
//        Java 프로그램이 시작될 때 JVM(Java Virtual Machine)에 의해 할당되며, 프로그램 종료 시 해제됩니다.
//        예를 들어, static 키워드를 사용하여 선언된 변수는 이 영역에 할당되고, 모든 객체에서 공유됩니다.
//Heap 영역:
//        Java에서는 객체의 동적 메모리 할당이 Heap 영역에서 이루어집니다.
//        new 키워드를 사용하여 객체를 생성하면, 해당 객체는 Heap 영역에 할당되며, 변수는 그 객체의 주소(참조)를 가리킵니다.
//        Java에서는 개발자가 직접 메모리를 해제하지 않습니다. 대신, 사용되지 않는 객체는 가비지 컬렉터(Garbage Collector)에 의해 자동으로 회수됩니다.
//Stack 영역:
//        Stack 영역은 메서드 호출과 지역 변수를 위한 메모리 영역입니다.
//        메서드가 호출되면 해당 메서드의 지역 변수와 기타 정보(예: 반환 주소)가 Stack 영역에 저장됩니다.
//        메서드 실행이 종료되면 해당 메서드를 위해 할당된 Stack 영역의 메모리는 자동으로 해제됩니다.
//        Java의 원시 타입 (int, char, float 등)의 지역 변수나 참조 변수들이 이 영역에 위치합니다. 하지만 참조 변수의 경우, 실제 객체 데이터는 Heap에 있고, Stack에는 그 객체의 참조(주소)만 저장됩니다.

//요약:
//        Static 영역은 프로그램 수명 동안 유지되는 데이터 (예: 정적 변수)를 저장하는 영역입니다.
//        Heap 영역은 객체 데이터를 저장하는 동적 메모리 영역으로, 가비지 컬렉터에 의해 관리됩니다.
//        Stack 영역은 메서드 호출 및 지역 변수에 대한 메모리를 관리하는 영역입니다.



public class RefType {
    public static void main(String[] args) {
        int age = 25; // int 타입으로 만들어진 age 라는 변수에 25라는 값을 저장
        double price = 100.5; // double 타입으로 만들어진 price 라는 변수에 100.5 라는 실수값을 저장.
        //참조 타입 예제
        String name = "꽃설이"; // String형으로 만들어진 name에는 실제 "꽃설이" 라는 문자열이 없고 주소만 있다.
        
//        int unbox = 0; // int형의 기본 타입이므로 실제 값을 대입해야함
//        Integer boxedValue = null; // int형에 대한 참조 타입
//        int intValue = boxedValue;
//        System.out.println(intValue);

        String strVal1 = "나희도"; // 리터럴 상수로 고정됨
        String strval2 = "나희도";
        String strval3 = new String("나희도"); //heap 영역에서 동적으로 할당 --> JVM에 의해서 소멸될 예정

        // 참조 변수에서 ==,!= (주소가 같은지를 물어보게 됨)
        if(strVal1 == strval3) { // 주소가 같은지 물어봄
            System.out.println("strVal과 strVal3는 참조하는 주소가 같음");
        } else {
            System.out.println("strVal과 strVal3는 참조하는 주소가 다름");
        }
        if(strVal1.equals(strval3)) { // 포함된 내용, 즉 문자열이 같은지를 확인
            System.out.println("strVal과 strVal3는 참조하는 주소가 같음");
        }
    }
}

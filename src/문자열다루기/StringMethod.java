package 문자열다루기;
// 자바는 문자열을 나타내는 자료형은 String이며, 참조 타입 자료형 입니다.
// equals() : 두개의 문자열이 동일한지 비교하여 결과값을 리턴함 , ==는 주소값을 비교 equals는  저장된 내용(데이터)가 같은지 비교
// indexOf() : 문자열에서 특정 문자가 시작되는 인덱스를 반환
// contains() : 문자열에서 특정 문자열이 포함되어 있는지 확인 , true or false
// charAt() : 문자열에서 특정 위치의 문자를 반환
// replaceAll() : 문자열 중 특정 문자열(a)을 다른문자열(b)로 변경 , 정규식
// subString() : 문자열의 특정 부분을 잘라내는데 사용함
// toUpperCase() / toLowerCase() : 문자열을 대문자로 , 소문자로 변환
// trim() : 문자열 좌우 공백 제거
// split() : 문자열을 특정 구분자로 분리
// toCharArray() : 문자열을 '문자'배열로 변환



public class StringMethod {
    public static void main(String[] args) {
        String a = "hello java";
        String b = " java";
        String c = "Hello";
        String d = new String("hello");

        System.out.println(a.equals(b)); // false 출력
        System.out.println(a.equals(c)); // true 출력
        System.out.println(a.equalsIgnoreCase(c)); // 문자열 비교시 대소문자 무시
        System.out.println(a.indexOf("l")); // 해당 문자가 시작되는 인덱스 반환

        System.out.println(a.contains(" "));
        System.out.println(a.charAt(6));
        String e = "Hello Java";
        System.out.println(e.replaceAll("Java" , "Python..."));

        String str = "aaabbbccccabcddddabcdeeee";

        String result1 = str.replace("abc", "하");
        String result2 = str.replaceAll("[abc]", "하"); // 정규표현식 적용 ,  규칙이 적용되어 [] 안에 적용 되는 모둔 문자(char)가 변환됨

        System.out.println("replace result->"+ result1);
        System.out.println("replaceAll result->"+ result2);

        System.out.println(e.substring(4, 6));

        System.out.println(e.toUpperCase()); // 대문자로
        System.out.println(e.toLowerCase()); // 소문자로

        String str_trim = "    공    백    ";
        System.out.println(str_trim.trim()); // 좌우 공백 제거

        String time = "10:23:45";
        String[] modifiedTime = time.split(":");
        for (String eee : modifiedTime ) System.out.print(eee + " ");

        System.out.println();
        System.out.printf("I eat %d apples.\n" , 3); // 문자열 포맷팅을 출력을 위해서만 사용

        String str_formatted = String.format("I eat %d apples." , 3);// 상단의 포맷팅을 변수에 저장하여 사용
        System.out.println(str_formatted);
        //System.out.println(String.format("I eat %d apples." , 3));

        String str_name = "James";
        char[] arr_char = str_name.toCharArray();
        for(char ech : arr_char) System.out.print(ech + " ");




    }
}

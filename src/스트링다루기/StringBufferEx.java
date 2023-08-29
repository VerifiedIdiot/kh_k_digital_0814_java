package 스트링다루기;
// StringBuffer , StringBuilder(지원 하지 않음) 둘 다 문자열을 추가하거나 변경할 때 사용
// String 자료형과 어떤 차이가 있는지 이해해야한다.
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hola");
        sb.append(" ");
        sb.append("este");
        sb.append(" ");
        System.out.println(sb);

        String st = ""; // 화이트스페이스 값이 할당되어서 null이 아님
        st += "hello";
        st += " ";
        st += "java";
        System.out.println(st);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("jump to java");
        // insert : 해당 offset에 문자열을 추가
        sb2.insert(0,"hello");
        System.out.println(sb2);
        sb2.delete(7,10);
        System.out.println(sb2);
        System.out.println(sb2.substring(0,4));




    }
}

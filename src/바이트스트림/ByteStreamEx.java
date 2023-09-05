package 바이트스트림;
import java.io.*;

// OutputStream : 바이트 기반 출력 스트림의 최상위 슈퍼클래스
public class ByteStreamEx {
    public static void main(String[] args) throws IOException {
//        OutputStream os = new FileOutputStream("test.bin");
//        byte a = 10;
//        byte b = 20;
//        byte c = 30;
//        os.write(a);
//        os.write(b);
//        os.write(c);

//        OutputStream os = new FileOutputStream("test2.bin");
//        byte[] array = {10, 20, 30};
//        os.write(array);

//        OutputStream os = new FileOutputStream("test3.bin");
//        byte[] array = {10, 20, 30, 40, 50};
//
//        os.write(array,1,3); // 배열의 1번 인덱스 부터 3개 출력
//
//        os.flush(); // 버퍼 비우기
//        os.close(); // 자원 반납 후 스트림 닫기

        InputStream is = new FileInputStream("test.db");
//        while(true) {
//            int data = is.read(); // 1 바이트씩 읽기
//            if(data == -1) break; // 더 이상 읽을 내용이 없으면 -1 , 즉 파일의 끝
//            System.out.println(data);
//        }
        byte[] buffer = new byte[100];
        while(true) {
            int readNum = is.read(buffer); // 배열의 길이 만큼 읽기
            if (readNum == -1) break;  // 파일의 끝에 도달
            for (int i = 0; i < readNum; i++) {
                System.out.println(buffer[i]);
            }
        }
    }
}

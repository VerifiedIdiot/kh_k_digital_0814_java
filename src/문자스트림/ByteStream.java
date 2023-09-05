package 문자스트림;
import java.io.*;

// Writer : 문자열 기반 출력 스트림의 최상위 클래스로 추상 클래스이다.
public class ByteStream {
    public static void main(String[] args) throws IOException {
//        Writer writer = new FileWriter("test.txt");
//        char[] data = "곰돌이사육사".toCharArray();
//        for(int i=0; i<data.length; i++) {
//            writer.write(data[i]);
//        }
//        writer.write(data);
//        writer.flush();
//        writer.close();
        Reader reader = new FileReader("test.txt");
        int readData;
        while( true ) {
            readData = reader.read();
            if(readData == -1) break;
            System.out.print((char)readData);
        }
        reader.close();

    }
}

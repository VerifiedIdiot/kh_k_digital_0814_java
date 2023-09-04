package 예외처리;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ExceptionEx2 {
    public static void main(String[] args) throws IOException {


        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("파일이 없습니다. 다시 첨부해 주세요.");
        }
    }
}

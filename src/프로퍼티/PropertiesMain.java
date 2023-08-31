package 프로퍼티;

import 커피메뉴만들기HashMap.MenuInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

// Map의 하나의 형태 : 키와 값이 모두 String 타입으로 제한된 형태
public class PropertiesMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();


        String path = PropertiesMain.class.getResource("./database.properties").getPath();
        path = URLDecoder.decode(path,"utf-8"); // 디코딩을 통한 한글에 대한 처리
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);





    }
}

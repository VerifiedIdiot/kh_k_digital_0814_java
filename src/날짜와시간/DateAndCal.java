package 날짜와시간;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
// Date() : 운영체제로 부터 날짜와 시간 정보를 가져와 원하는 포맷형태로 출력, 객체를 생성해야 함.
// 자바의 java.util 패키지에 포함되어 있어 import를 해야 함
public class DateAndCal {
    public static void main(String[] args) {
        Date now = new Date();
        // yyyy : 년도를 4자리로 표시
        // yy : 년도를 2자리로 표시
        // MM : 월을 표시 (대문자임에 유의 , 월이 2자리로 표시됨)
        // HH : 24시간제
        // hh : 12시간제        
        // mm : 분을 출력
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
//        System.out.println(f1.format(now));
//        System.out.println(f2.format(now));
//        System.out.println(f3.format(now));
//        System.out.println(f4.format(now));
//        System.out.println(f5.format(now));
//        System.out.println(f6.format(now));
//        System.out.println(f7.format(now));
        Calendar cal = Calendar.getInstance(); // 운영체제로 부터 시간을 가져 옴
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1); // MONTH만 유일하게 배열이라 인덱스 값을 기준으로 출력해야함
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 한 주 에서 몇번째 날인지
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 한 달 에서 며칠인지
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(f5.format(now));
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd HH:mm:ss" + " 입니다.");
        System.out.println(format);
//        System.out.println(format.format(cal.getTime()));
        // 날짜 및 시간 출력 패턴 "yyyyMMddHHmmss를 겍체에 대입하며 해당 객체의 날짜 포매팅 메서드로 한번에 출력
    }
}

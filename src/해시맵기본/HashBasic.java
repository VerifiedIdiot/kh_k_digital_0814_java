package 해시맵기본;


import java.util.*;

public class HashBasic {
    public static void main(String[] args) {
        // Key , value
        Map<String, List<String>> map = new HashMap<>();
        // 객체 저장
        map.put("lastofyears21", Arrays.asList("정벼리" , "리바이스 청바지", "59000원" , "쿠폰사용" , "골드"));
        map.put("verified_idiot", Arrays.asList("이재원" ,"칩먼데이 청바지", "69000원" , "쿠폰사용" , "실버"));
        map.put("spooky_idiot", Arrays.asList("이재성", "아디다스X제레미스캇", "199000원" , "쿠폰사용" , "플레티넘"));
        // map 내부의 모든 값 호출
        // System.out.println("회원별 구매기록 : " + map.values() );
        // 맵에 있는 모든 키를 포함하는 Set 컬렉션을 반환 합니다.
        for (String key : map.keySet()) {
            System.out.println(key +"\t"+map.get(key));
        }
        // 객체 삭제 : 키값으로 해당 Entry를 삭제
        map.remove("정벼리");
        for (String key : map.keySet()) {
            System.out.println(key +"\t"+map.get(key));
        }


        // iterator(반복자)를 사용하는 방법 --> 걍 위에꺼 쓰자
//        Set<String> keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            List<String> value = map.get(key);
//            System.out.println(key + "\t" + value);
//        }

    }
}

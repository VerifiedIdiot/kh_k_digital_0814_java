package 중복없는로또번호;

// 1 ~ 45 사이의 임의의 수 6개를 생성해야함. (입력은 받지않음) , Math.random() => 0.1 ~ 0.999
// int val = (int)((Math.random() * 45) +1);
// 단 중복 제거
// 생성된 val값은 배열에 담을 때 배열내에 해당하는 값이 있는지 확인 필요
// 배열은 6개
// 반복횟수는 정할 수 없음 (while(true) ==> 탈출 조건이 있어야 함 (중복되지 않은 번호 6개가 지정되면 break)


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RandomLotto {
    public static void main(String[] args) {

//        int[] arr_val = new int[6];
//        int i = 0;
//        while (true) {
//            int val = (int) ((Math.random() * 45) + 1);
//
//            // 배열의 길이를 초과하지 않게 검사
//            if (i < arr_val.length) {
//                arr_val[i] = val;
//                i++;
//            }
//
//            if (Arrays.stream(arr_val).distinct().toArray().length == 6)
//                break;
//        }
//        System.out.println(Arrays.toString(arr_val));

        // 상단의 코드는 새로 생선된 랜덤 값 'val'이 이미 'arr_val' 배열에 존재하면 중복된 값이 배열에 추가됨
        // i의 값은 증가하지만 중복되지 않는 값의 개수는 6개가 되지 않아 무한 루프에 빠질 수 있음

        // 해당 문제를 해결한 코드
        int[] arr_val = new int[6];
        int i = 0;
        while (true) {
            int val = (int) ((Math.random() * 45) + 1);

            // 배열 내에 val 값이 이미 존재하는지 검사
            boolean isPresent = false;
            for (int j = 0; j < i; j++) {
                if (arr_val[j] == val) {
                    isPresent = true;
                    break;
                }
            }

            if (!isPresent && i < arr_val.length) {
                arr_val[i] = val;
                i++;
            }

            if (i == arr_val.length)
                break;
        }
        System.out.println(Arrays.toString(arr_val));

        // ArrayList
        List<Integer> list = new ArrayList<>();
        int tmp;
    while (true) {
        tmp = (int) ((Math.random() * 45) + 1);
        if(!list.contains(tmp)) {
            list.add(tmp);
        }
        if (list.size() == 6) break;
    }
    System.out.println(list);

    // set : 자바에서 사용 / 집합 개녕 / 집합의 특성(중복을 받지않음)
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            tmp = (int) ((Math.random() * 45) + 1);
            set.add(tmp);
            if(set.size() == 6) break;
        }
        System.out.println(set);
    }

}

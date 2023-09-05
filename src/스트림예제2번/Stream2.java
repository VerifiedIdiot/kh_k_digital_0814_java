package 스트림예제2번;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

// 반복자 스트림 : 내부 반복자, 스트림 요소에 대한 순차 접근을 제공하며, 최종 연산에 해당 합니다.
public class Stream2 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("고유림" , 89),
                new Student("나희도" , 78),
                new Student("백이진" , 66),
                new Student("언년이" , 54),
                new Student("대길이" , 99)
        );
        double average = list.stream() // 스트림 생성
                .mapToInt(Student::getScore) // 메소드 참조, 중간 연산
                .average() // 중간 연산
                .getAsDouble(); // 최종 연산

        System.out.println("평균 점수 : " + average);

        IntStream stream = IntStream.rangeClosed(1, 100);

        System.out.println("합계 : " + stream.sum());


        //        list.stream().forEach(s -> {
//            String name =  s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });
//        list.parallelStream().forEach(s-> { // 내부 반복자를 이용한 병렬처리
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//
//        });
//
//
//

        //        for (Student s : list) {
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        }




        //                ArrayList<String> list = new ArrayList<>(Arrays.asList("고유림", "나희도", "백이진"));
//        for(String e : list) System.out.println(e + " ");
//
//        list.forEach(e->System.out.print(e + " "));
//        list.forEach(e->System.out.print(e + " "));

//        for (String name : list) {
//            System.out.println(name + " ");
//        }
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String name = iterator.next();
//            System.out.println(name + " ");
//        }



    }
}

class Student {
    private String name;
    private int Score;


    public Student(String name, int score) {
        this.name = name;
        Score = score;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return Score;
    }


}
package 학생성적정렬;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// 미리 입력 받아 놓고 시작
// 5명의 학생에 대해 이름과 성적을 입력 성적이 높은 사람 순으로 정렬하고 , 성적이 같으면 , 이름순으로 정렬
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<StudentGrades> treeSet = new TreeSet<>(new GradesComparator());
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <5; i++ ) {
            treeSet.add(new StudentGrades(sc.next(), sc.nextInt()));
        }
        Iterator<StudentGrades> iterator = treeSet.iterator();
        for (StudentGrades e : treeSet) {
            System.out.println(e.name + " : " + e.grade);
        }
    }
}

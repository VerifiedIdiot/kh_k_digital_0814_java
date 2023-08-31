package 학생성적정렬;

import java.util.Comparator;

public class GradesComparator implements Comparator<StudentGrades> {
    @Override
    public int compare(StudentGrades o1, StudentGrades o2) {
        if (o1.grade < o2.grade) return 1;
        else if (o1.grade == o2.grade) return 0;
        return -1;
    }

//    @Override
//    public Comparator<StudentGrades> reversed() {
//        return Comparator.super.reversed();
//    }
}

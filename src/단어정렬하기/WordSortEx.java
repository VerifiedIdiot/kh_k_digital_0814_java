package 단어정렬하기;

import 학생성적정렬.GradesComparator;
import 학생성적정렬.StudentGrades;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
// n의 갯수를 먼저  입력 받음
// 1. 길이가 짧은 것부터
// 2. 길이가 같으면 사전 순으로
// 3. 중복 제거
public class WordSortEx {
    public static void main(String[] args) {
        int n;
        String word;
        TreeSet<WordClass> treeSet = new TreeSet<>(new WordComparator());
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            word = sc.next();
            treeSet.add(new WordClass(word ,word.length()));

        }
        for (WordClass wordClass : treeSet) {
            System.out.print(wordClass + " ");
        }
        System.out.println();

        for (WordClass e : treeSet) {
            System.out.println(e.word + " : " + e.length);

        }
    }
}



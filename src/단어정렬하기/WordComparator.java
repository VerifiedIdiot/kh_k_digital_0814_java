package 단어정렬하기;



import java.util.Comparator;

public class WordComparator implements Comparator<WordClass> {
    @Override
    public int compare(WordClass o1, WordClass o2) {
        if (o1.length > o2.length) return 1;
        else if (o1.length == o2.length) return 0;
        return -1;
    }
}
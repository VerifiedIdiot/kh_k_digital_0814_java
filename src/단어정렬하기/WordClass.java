package 단어정렬하기;

public class WordClass {
    String word;
    int length;

    public WordClass(String word, int length) {
        this.word = word;
        this.length = length;
    }
    @Override
    public String toString() {
        return this.word;
    }


}

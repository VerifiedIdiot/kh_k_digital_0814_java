package 컴페어레이터_중요;

import java.util.TreeSet;

// 두개의 메소드를 비교하는 방법
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> set = new TreeSet<>(new DescendingComparator().reversed());
        set.add(new Fruit("포도" , 3000));
        set.add(new Fruit("자두" , 5000));
        set.add(new Fruit("딸기" , 7000));

        for (Fruit e : set) {
            System.out.println("과일 이름 :" + e.name + "\n" + "가격 : " + e.price);
        }
    }
}

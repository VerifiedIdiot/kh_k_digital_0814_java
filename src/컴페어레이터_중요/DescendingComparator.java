package 컴페어레이터_중요;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if (o1.price < o2.price) return 1;
    else if (o1.price == o2.price) return 0;
    else return -1;
    }

    @Override
    public Comparator<Fruit> reversed() {
       return Comparator.super.reversed();
   }
}

package 중첩for문;

public class DoubleForEx1 {
    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++){
//            for(int j = 0; j < 10; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//            for (int i = 2; i < 10; i++) {
//                for (int j = 1; j < 10; j++) {
//                    System.out.printf("%d x %d = %d\n" , i, j, (i*j));
//
//                }
//
//                System.out.println();
//
//            }
            int cnt = 0;
            for(int i = 7; i <= 1000; i += 7) {
                cnt++;
                System.out.printf("%5d" , i);
            if(cnt == 10) {
                System.out.println();
                cnt = 0;


            }
        }



    }

}

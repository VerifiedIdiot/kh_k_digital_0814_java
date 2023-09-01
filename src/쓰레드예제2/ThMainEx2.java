package 쓰레드예제2;

import java.awt.*;
import static java.lang.Thread.sleep;

public class ThMainEx2 {
    public static void main(String[] args) throws InterruptedException {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(100000); // sumThread가 작업을 완료할 때 까지 기다림
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("합 : " + sumThread.getSum());



        //        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        for (int i = 0; i < 10; i++) {
//            toolkit.beep();
//           try {
//               sleep(3000);
//           } catch (InterruptedException ignored) {
//
//           }
//        }

    }
}

class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 2100000000; i++){
            sum+=1;
        }
    }
}

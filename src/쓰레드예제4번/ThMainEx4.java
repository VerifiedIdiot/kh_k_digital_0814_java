package 쓰레드예제4번;

import static java.lang.Thread.sleep;

// 쓰레드를 중지하는 방법
public class ThMainEx4 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();

//        sleep(1000);
//        runThread.setStop(true);
    try {
        sleep(3000);
    } catch (InterruptedException e) {

    }
        runThread.interrupt();

    }
}

class RunThread extends Thread {
    private boolean stop; // stop 플래그
    public void setStop(boolean stop) {
        this.stop = stop;
    }
    @Override
    public void run() {
        try {

            while (true) {
                System.out.println("쓰레드를 실행중 .....");
                sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("인따럽트 발생");
        }
        System.out.println("자원 정리.....");
        System.out.println("실행 종료.....");
    }
}
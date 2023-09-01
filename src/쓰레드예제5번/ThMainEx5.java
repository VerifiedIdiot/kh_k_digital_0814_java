package 쓰레드예제5번;

import static java.lang.Thread.sleep;

// 데몬 쓰레드 : 다른 쓰레드의 작업을 돕는 보조 쓰레드 , 데몬 쓰레드 이외의 쓰레드가 모두 종료되면 데몬 쓰레드 또한 자동으로 종료된다
// start() 메소드 호출 전에 setDeamon(true)를 호출 해야한다.
public class ThMainEx5 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveTh autoSaveTh = new AutoSaveTh();
        autoSaveTh.setDaemon(true); // 데몬 쓰레드를 만드는 방법
        autoSaveTh.start();
        sleep(30000);
    }
}


class AutoSaveTh extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장 합니다.");
    }
    @Override
    public void run() {
        while (true) {
            try {
                sleep(300);
            } catch (InterruptedException e) {}
                save();

        }

    }
}
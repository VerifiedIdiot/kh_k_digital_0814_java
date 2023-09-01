package 쓰레드예제1번;
// 하나의 프로그램 내에서 여러가지 일을 동시에 수행 하는것
public abstract class ThreadMainEx1 {
    public static void main(String[] args) {
        // Thread 클래스를 상속 받아서 Thread 생성
        Thread testTh = new CustomThread();
        testTh.start();
        System.out.println("Main에서 찍어 봅니다.");

        Runnable runTask = new InterThread(); // 실제 작업 내용을 가지고 있지만 실제 쓰레드는 아님
        Thread runTh1 = new Thread(runTask);
        Thread runTh2 = new Thread(runTask);
        runTh1.start();
        runTh2.start();

        // 익명 객체로 쓰레드를 만드는 방법
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    sum += i;
                    System.out.println("인터페이스 : " + sum);
                }
                System.out.println(Thread.currentThread() + "합 : " + sum);

            }
        };
        Thread anonyTh1 = new Thread(task);
        anonyTh1.start();

        // 람다식으로 구현하기
        Runnable task2 = () -> {
            int sum = 0;
            for (int i = 0; i <= 10; i++){
                sum += i;
                System.out.println("인터페이스 :" + sum);
            }
            System.out.println(Thread.currentThread() + "합 : " + sum);
        };
        Thread anonyTh2 = new Thread(task2);
        anonyTh2.start();
    }
}
// 상속 받아서 쓰레드를 만드는 방법
class CustomThread extends Thread {
   @Override
   public void run() {
       int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("상속받은 쓰레드 : " +sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
   }
}

class InterThread implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("인터페이스 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}

package 쓰레드예제3;
// 쓰레드간의 협업 : wait() , notify(), notifyAll()
// notify() : 일시 정지 상태에 있는 쓰레드를 실행 대기 상태로 변경
// wait() : 자신을 일시 정지 상태로 만듬
public class ThMainEx3 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); // 객체 생성
        Thread threadA = new ThreadA(sharedObject);
        Thread threadB = new ThreadB(sharedObject);
        threadA.start();
        threadB.start();
    }
}


class WorkObject {
    // synchronized : 멀티 쓰레드 환경에서  임계영역(동시 접근 방지)에 접근을 방지 하는 역할
    public synchronized void methodA() {
        System.out.println("Thread의 methodA() 작업 실행");
        notify(); // 일시 정지 상태에 있는 쓰레드를 실행 대기 상태로 전환
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }
    public synchronized void methodB() {
        System.out.println("Thread의 methodB() 작업 실행");
        notify(); // 일시 정지 상태에 있는 쓰레드를 실행 대기 상태로 전환
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }
}

class ThreadA extends Thread {
    private WorkObject workObject; //
    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;

    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            workObject.methodA();
        }
    }
}

class ThreadB extends Thread {
    private final WorkObject workObject; //
    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;

    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            workObject.methodB();
        }
    }
}
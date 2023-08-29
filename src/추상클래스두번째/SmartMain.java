package 추상클래스두번째;

public class SmartMain {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("IPhone Pro 14");
        smartphone.setPower(true);
        smartphone.internet();
        smartphone.call();

        Phone phone = new Phone("목업") {
            void test () {
                System.out.println("목업폰이라 테스트도 안되요...");
            }
        @Override
            void call() {
                System.out.println("목업폰이라 통화가 안돼요.");
            }
        };
        phone.call();

    }
}

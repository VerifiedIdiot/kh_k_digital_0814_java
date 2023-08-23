package 아이패드만들기;

public class IPadMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPadPro IPadPro = new IPadPro("IPad Pro");
            if(!IPadPro.continueOrder()) break;
            IPadPro.setScreen();
            IPadPro.setColor();
            IPadPro.setMemory();
            IPadPro.setNetwork();
            IPadPro.setName();
            IPadPro.setSerialNum();
            IPadPro.progressPad();
            IPadPro.productPad();
        }
    }



}

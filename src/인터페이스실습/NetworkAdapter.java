package 인터페이스실습;

import java.util.Scanner;

interface NetworkAdapter {
    public abstract void connect();
}

class LAN implements NetworkAdapter {
    String company;
    LAN(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " LAN에 연결 되었습니다.");
    }
}

class WiFi implements NetworkAdapter {
    String company;
    WiFi(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결 되었습니다.");
    }
}

class LTE implements NetworkAdapter {
    String company;
    LTE(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " LTE에 연결 되었습니다.");
    }
}




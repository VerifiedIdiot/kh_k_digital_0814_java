package 매개변수의다형성1;

public class Product {
    int price;
    int bonusPoint;
}


class TV extends Product {
    TV() {
        this.price = 100;
        this.bonusPoint = 10;
    }
}

class Computer extends Product {
    Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}
class Audio extends Product {
        Audio() {
            this.price = 120;
            this.bonusPoint = 12;
        }
}

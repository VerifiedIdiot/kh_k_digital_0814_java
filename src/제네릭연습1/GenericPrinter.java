package 제네릭연습1;

public class GenericPrinter<T> {
    private T material; // T 자료형으로 변수 선언

    public void setMaterial(T material) {
        this.material = material;
    }


    public T getMaterial() {
        return material;
    }

    public String toString() {
        return material.toString();
    }
}

class Power {
        public void doPringting() {
            System.out.println("Power 재료로 출력 합니다.");
        }
        public String toString() {
            return "재료는 Power 입니다.";
        }

    }

class Plastic {
        public void doPrinting() {
            System.out.println("Plastic 재료를 출력합니다.");
        }
    public String toString() {
        return "재료는 Plastic 입니다.";
    }

    }




package 제네릭연습1;

public class GenericEx2 {
    public static void main(String[] args) {
        GenericPrinter<Power> powerPrinter = new GenericPrinter<>();
        powerPrinter.setMaterial(new Power());
        Power power = powerPrinter.getMaterial();
        System.out.println(powerPrinter);
        System.out.println(power);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
        System.out.println(plastic);
    }
}

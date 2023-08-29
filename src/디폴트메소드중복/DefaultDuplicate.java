package 디폴트메소드중복;

public class DefaultDuplicate {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
    }
}

import com.facade.OrderFacade;

public class main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        boolean success = orderFacade.placeOrder(1, 10, 3.99, 1, "Mangilik el avenue, 62/3", "someone777@gmail.com");
        if (success) {
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Order failed.");
        }
    }
}

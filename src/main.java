import com.facade.OrderFacade;

public class main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder(1, 9, 100, 1, "Mangilik el avenue, 62/3", "someone777@gmail.com");
    }
}

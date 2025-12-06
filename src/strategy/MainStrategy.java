package strategy;

public class MainStrategy {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pagar con paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pagar con tarjeta de credito
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}

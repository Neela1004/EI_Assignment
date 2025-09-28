package behavioral.strategy;

public class StrategyDemo {
    public static void run() {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CardPayment());
        context.executePayment(500.00);

        context.setStrategy(new UpiPayment());
        context.executePayment(300.00);

        context.setStrategy(new WalletPayment());
        context.executePayment(200.00);
    }
}

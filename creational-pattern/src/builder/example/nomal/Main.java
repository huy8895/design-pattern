package builder.example.nomal;

import builder.example.nomal.type.BreadType;
import builder.example.nomal.type.OrderType;
import builder.example.nomal.type.SauceType;

public class Main {
    public static void main(String[] args) {
        Order order = new OrderBuilderImp()
                .orderType(OrderType.TAKE_AWAY)
                .orderSauce(SauceType.FISH_SAUCE)
                .orderBread(BreadType.BEEF)
                .build();

        System.out.println("order = " + order);

    }
}

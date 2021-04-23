package builder.example.nomal;

import builder.example.nomal.type.BreadType;
import builder.example.nomal.type.OrderType;
import builder.example.nomal.type.SauceType;
import builder.example.nomal.type.VegetableType;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}

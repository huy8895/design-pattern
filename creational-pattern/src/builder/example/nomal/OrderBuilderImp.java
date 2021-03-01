package builder.example.nomal;

import builder.example.nomal.type.BreadType;
import builder.example.nomal.type.OrderType;
import builder.example.nomal.type.SauceType;
import builder.example.nomal.type.VegetableType;

public class OrderBuilderImp implements OrderBuilder{
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.orderVegetable(vegetableType);
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType,breadType,sauceType,vegetableType);
    }
}

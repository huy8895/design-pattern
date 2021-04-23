package bridge.concept;

/**
 * (AbstractionImpl) : hiện thực (implement) các phương thức đã được định ra trong Abstraction
 * bằng cách sử dụng một tham chiếu đến một đối tượng của Implementer.
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void doSomething() {
        implementor.doOperation();
    }
}

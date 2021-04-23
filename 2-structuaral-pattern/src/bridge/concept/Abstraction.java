package bridge.concept;

/**
 * Abstraction : định ra một abstract interface quản lý việc tham chiếu đến đối tượng hiện thực cụ thể (Implementor).
 */
public abstract class Abstraction {
    protected Implementor implementor;

    abstract void doSomething();

}

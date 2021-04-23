package decorator.concept;

/**
 * Decorator : là một abstract class dùng để duy trì một tham chiếu của đối tượng Component
 * và đồng thời cài đặt các phương thức của Component  interface.
 */
public abstract class Decorator implements Component{
    Component component;

    abstract void doAdditionalOperation();
}

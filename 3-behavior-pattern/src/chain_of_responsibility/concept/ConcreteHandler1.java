package chain_of_responsibility.concept;

/**
 * ConcreteHandler : xử lý yêu cầu. Có thể truy cập đối tượng successor (thuộc class Handler).
 * Nếu đối tượng ConcreateHandler không thể xử lý được yêu cầu, nó sẽ gởi lời yêu cầu cho successor của nó.
 */
public class ConcreteHandler1 implements Handler{
    private Handler nextHandler;
    @Override
    public void handleRequest() {

    }
}

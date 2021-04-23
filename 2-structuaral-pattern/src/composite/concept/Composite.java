package composite.concept;

/**
 * Composite :  lưu trữ tập hợp các Leaf và cài đặt các phương thức của Base Component
 * Composite cài đặt các phương thức được định nghĩa trong interface Component bằng cách ủy nhiệm cho các
 * thành phần con xử lý.
 */
public class Composite implements Component {
    Component[] components;

    @Override
    public void execute() {

    }
}

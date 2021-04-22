package flyweight.example;

/**
 * Context : đóng vai trò là Extrinsic State.
 * (trạng thái bên ngoài) : Trạng thái bên ngoài thể hiện tính chất phụ thuộc ngữ cảnh của
 * đối tượng flyweight. Trạng thái này chứa các thuộc tính và dữ liệu được áp dụng hoặc được tính toán trong thời gian
 * thực thi (runtime). Do đó, những dữ liệu đó không được lưu trữ trong bộ nhớ. Vì trạng thái bên ngoài là phụ thuộc ngữ cảnh
 * và có thể thay đổi nên các đối tượng đó không thể được chia sẻ. Do đó, client chịu trách nhiệm truyền dữ liệu liên quan
 * đến trạng thái bên ngoài cho đối tượng flyweight khi cần thiết, có thể thông qua các tham số (argument).
 * Tùy vào ngữ cảnh khác nhau sẽ có giá trị khác nhau.
 */
public class Context {
    String id;
    int star;

    public Context(String id, int star) {
        this.id = id;
        this.star = star;
    }

    public String getId() {
        return this.id;
    }

    public int getStar() {
        return this.star;
    }
}

package flyweight.concept;

/**
 * FlyweightFactory (Cache): lớp này có thể là một Factory Pattern được sử dụng để
 * giữ tham chiếu đến đối tượng Flyweight đã được tạo ra. Nó cung cấp một phương thức
 * để truy cập đối tượng Flyweight được chia sẽ. FlyweightFactory bao gồm một Pool
 * (có thể là HashMap, không cho phép bên ngoài truy cập vào) để lưu trữ đối tượng
 * Flyweight trong bộ nhớ. Nó sẽ trả về đối tượng Flyweight đã tồn tại khi được yêu
 * cầu từ Client hoặc tạo mới nếu không tồn tại.
 */
public class FlyweightFactory {
}

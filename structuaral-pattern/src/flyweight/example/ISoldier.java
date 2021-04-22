package flyweight.example;

/**
 * ISoldier : đóng vai trò là một Flyweight.
 * Định nghĩa phương thức promote với tham số là context,
 * giá trị tham số này được quyết định bởi Client.
 */
public interface ISoldier {
    void promote(Context context);
}

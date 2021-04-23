package chain_of_responsibility.concept;

/**
 * Handler : định nghĩa 1 interface để xử lý các yêu cầu.
 * Gán giá trị cho đối tượng successor (không bắt buộc)
 */
public interface Handler {
    void handleRequest();
}

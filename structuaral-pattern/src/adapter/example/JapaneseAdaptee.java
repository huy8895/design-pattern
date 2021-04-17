package adapter.example;

/**
 * Adaptee: định nghĩa interface không tương thích, cần được tích hợp vào.
 */
public class JapaneseAdaptee {
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(words);
    }
}

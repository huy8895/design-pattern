package adapter.example;

/**
 * Client: lớp sử dụng các đối tượng có interface Target.
 */
public class VietnameseClient {

    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chào");
    }
}

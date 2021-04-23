package builder.example.immutable;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = BankAccount.builder()
                .wantMobileBanking(true)
                .withName("huy")
                .withEmail("@gmail")
                .withAddress("hanoi")
                .build();

        BankAccount hanoi = BankAccount.builder().withAddress("hanoi").build();
        System.out.println(hanoi);
    }
}

package builder.example.immutable;

public class BankAccount {
    private final String name;
    private final String accountNumber;
    private final String address;
    private final String email;
    private final boolean newsletter;
    private final boolean mobileBanking;

    private BankAccount(String name,
                       String accountNumber,
                       String address,
                       String email,
                       boolean newsletter,
                       boolean mobileBanking) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.email = email;
        this.newsletter = newsletter;
        this.mobileBanking = mobileBanking;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public boolean isMobileBanking() {
        return mobileBanking;
    }

    // tao 1 static nested class co cac thuoc tinh nhu class outer dung de builder
    public static class BankAccountBuilder {
        private String name; // required
        private String accountNumber; // required
        private String address;
        private String email;
        private boolean newsletter;
        private boolean mobileBanking;

        //tao constructor 2 tham so bat buoc la name, account number

        public BankAccountBuilder withName(String name){
            this.name = name;
            return this;
        }

        public BankAccountBuilder withAccountNumber(String accountNumber){
            this.accountNumber = accountNumber;
            return this;
        }

        public BankAccountBuilder withAddress(String address){
            this.address = address;
            return this;
        }

        public BankAccountBuilder withEmail(String email){
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsletter(boolean newsletter){
            this.newsletter = newsletter;
            return this;
        }

        public BankAccountBuilder wantMobileBanking(boolean mobileBanking){
            this.mobileBanking = mobileBanking;
            return this;
        }

        public BankAccount build(){
            validateUserObject();
            return new BankAccount(this.name, this.accountNumber, this.address,
                    this.email, this.newsletter, this.mobileBanking);
        }

        private void validateUserObject() {
            if (this.newsletter && email == null){
                throw new IllegalArgumentException("Email can't be null to receive the new letter");
            }
        }
    }

    public static BankAccountBuilder builder(){
        return new BankAccount.BankAccountBuilder();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", newsletter=" + newsletter +
                ", mobileBanking=" + mobileBanking +
                '}';
    }
}

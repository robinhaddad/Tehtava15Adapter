public class Adapter implements Adaptee {
    private BankAccount bankAccount;

    public Adapter(Balance bankAccount){
        this.bankAccount = new BankAccount();
    }
    @Override
    public float getBalance() {
        return toUSD(bankAccount.getBalance());
    }

    private float toUSD(float balance) {
        return balance * 1.1321637f;
    }
}

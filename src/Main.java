import java.io.PrintStream;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Balance bankAccount = new BankAccount();

        System.out.println(bankAccount.getBalance());

        Adaptee adaptee = new Adapter(bankAccount);

        System.out.println(df.format(adaptee.getBalance()));
    }
}

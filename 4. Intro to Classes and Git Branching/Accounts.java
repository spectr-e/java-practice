
public class Accounts {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alicia", 1000.43
        );
        System.out.println(acc1);

        acc1.deposit(249.34);
        System.out.println(acc1.getBalance());
        acc1.withdraw(24.46);
        System.out.println(acc1.getBalance());


    }
}

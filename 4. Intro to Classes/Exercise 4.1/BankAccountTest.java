
public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Jane", 70000);

        System.out.println(acc1);

        acc1.deposit(100000);
        System.out.println(acc1.getBalance());
        
        acc1.withdraw(60000.5);
        System.out.println(acc1.getBalance());

        System.out.println(" ");

        BankAccount acc2 = new BankAccount("Josiah", 100000);
        System.out.println(acc2);

        acc2.deposit(100000);
        System.out.println("Add 100,000: " + acc2.getBalance());

        acc2.withdraw(54999.5);
        System.out.println("Withdraw 54,235.3: " + acc2.getBalance());

        acc1.transfer(acc2, 10000);

    }
}

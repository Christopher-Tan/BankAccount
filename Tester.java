public class Tester {
    public static void print(boolean deposit_or_withdrawal) {
        if (deposit_or_withdrawal) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }
    }
    public static void main(String[] args) {
        BankAccount test = new BankAccount(10,"Password");
        //get
        System.out.println(test.getBalance());
        System.out.println(test.getAccountID());
        //setpassword
        test.setPassword("Hello");
        //deposit
        print(test.deposit(1000.0));
        System.out.println(test.getBalance());
        print(test.deposit(-1000.0));
        System.out.println(test.getBalance());
        //withdraw
        print(test.withdraw(-1000.0));
        System.out.println(test.getBalance());
        print(test.withdraw(10000.0));
        System.out.println(test.getBalance());
        print(test.withdraw(500.0));
        System.out.println(test.getBalance());
    }
}
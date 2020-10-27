public class Tester {
    public static void main(String[] args) {
        BankAccount test = new BankAccount(10,"Password");
        System.out.println(test.getBalance());
        System.out.println(test.getAccountID());
        test.setPassword("Hello");
    }
}
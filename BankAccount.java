public class BankAccount {
    private final double balance;
    private final int accountID;
    private final String password;
    public BankAccount(int account, String pass) {
        accountID = account;
        password = pass;
        balance = 0;
    }
}
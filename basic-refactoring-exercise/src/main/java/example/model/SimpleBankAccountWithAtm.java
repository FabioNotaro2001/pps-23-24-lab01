package example.model;

public class SimpleBankAccountWithAtm extends SimpleBankAccount{
    private final static double FEE = 1;    // Specified in order to follow AOC principle.

    public SimpleBankAccountWithAtm(AccountHolder holder, double balance) {
        super(holder, balance);
    }

    @Override
    public void deposit(final int userID, final double amount) {
        super.deposit(userID, amount);
        this.applyFee();
    }

    @Override
    public void withdraw(final int userID, final double amount) {
        super.withdraw(userID, amount);
        this.applyFee();
    }

    private void applyFee(){
        super.withdraw(super.getHolder().getId(), FEE);
    }   
}

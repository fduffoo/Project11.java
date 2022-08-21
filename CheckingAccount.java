public class CheckingAccount extends Account
{
    public CheckingAccount(int id, double balance)
    {
        super(id, balance);
    }
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= this.getBalance())
        super.withdraw(amount);
    }
    public String toString()
    {
        return "Checking " + super.toString();
    }
}
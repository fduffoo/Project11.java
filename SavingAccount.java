public class SavingAccount extends Account
{
    private double interestRate;
    
    public SavingAccount(int id, double balance)
    {
        super(id, balance);
    }
    public double getInterestRate()
    {
        return interestRate;
    }
    public void setInterestRate(double rate) 
    {
        interestRate = rate;
    }
    public void withdraw(double amount) 
    {
        if (amount > 0 && (getBalance() - amount >= 500))
        super.withdraw(amount);
    }
    public void addInterest() 
    {
        setBalance(getBalance() * (1 + interestRate / 100.0));
    }
    public String toString()
    {
        return "Savings " + super.toString();
    }
}
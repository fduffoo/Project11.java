public class Account
{
    private int id;
    private double balance;
    
    public Account()
    {
        id = 0;
        balance = 0.0;
    }
    public Account(int id, double balance)
    {
        this.id =id;
        this.balance = balance;
    }
    public int getId()
    {
        return id;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    public String toString()
    {
        return "Account ID: " + id + "\nBalance: " + balance;
    }
}
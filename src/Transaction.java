import java.util.ArrayList;
import java.util.Date;

public class Transaction {
    private Date date;
    private double amount;
    private String description;
    private char type;
    private double balance;
    public Transaction(double amount, String description, char type, double balance) {
        this.amount = amount;
        this.description = description;
        this.type = type;
        this.balance = balance;
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public char getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                '}';
    }
}
class Accounts{
    private String name;
    private double balance;
    private int id;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    public Accounts(){
        dateCreated = new Date();
    }
    public Accounts(String name, double balance, int id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
        dateCreated = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Accounts.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public void withdraw(double amount) {
       balance -= amount;
       transactions.add(new Transaction(amount , "" , 'w' , balance));
    }
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(amount , "" , 'd' , balance));
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", id=" + id +
                ", transactions=" + transactions +
                '}';
    }
}
class TestAccount{
    public static void main(String[] args) {
        Accounts account1 = new Accounts("omar" , 25000 , 222348);
        account1.withdraw(0);
        account1.deposit(5000);
        Accounts.setAnnualInterestRate(15);
        System.out.println(account1.getMonthlyInterest());
        System.out.println(account1);

        Accounts account2 = new Accounts("hasan" , 20000 , 202020);
        account2.withdraw(2500);
        account2.deposit(3900);
        Accounts.setAnnualInterestRate(10);
        System.out.println(account2.getMonthlyInterest());
        System.out.println(account2);
    }
}
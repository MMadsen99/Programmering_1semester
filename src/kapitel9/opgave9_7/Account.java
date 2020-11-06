package kapitel9.opgave9_7;

import java.util.Date;

public class Account {
    private int id; // id for the account
    private double balance; // how much money the account have
    private double annualInterestRate = 0; // all accounts have the same intrest rate
    private Date dateCreated; // stores the date the account was created

    public static void main(String[] args) {

        Account account1 = new Account();
        Account account2 = new Account(1,10000);

        System.out.println(account1.id);
        System.out.println(account2.id);
        System.out.println(account1.balance);
        System.out.println(account2.balance);

    }
    // no-arg constructor ( No-argument constructor)
    Account(){

    }

    Account(int id,double balance){
        setId(1);
        setBalance(1);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}

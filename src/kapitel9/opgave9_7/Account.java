package kapitel9.opgave9_7;

import java.util.Date;

public class Account {
    private int id; // id for the account
    private double balance; // how much money the account have
    private double annualInterestRate; // all accounts have the same intrest rate
    private Date dateCreated; // stores the date the account was created

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.setId(10);
        account1.setBalance(10000);
        account1.setAnnualInterestRate(2.0);
        account1.printAccountDetails();

        Account account2 = new Account(2,15000, 2);
        account2.printAccountDetails();

        Account account3 = new Account();
        account3.printAccountDetails();
    }
    // no-arg constructor ( No-argument constructor)
    Account(){

    }

    Account(int id,double balance, double annualInterestRate){
        setId(id);
        setBalance(balance);
        setAnnualInterestRate(annualInterestRate);
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


    public void printAccountDetails(){
        System.out.println("id: " + getId() + "\n" + "balance: " + getBalance() + "\n" + "the annual interest rate is: " + getAnnualInterestRate());
    }

}

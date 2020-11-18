package kapitel9.opgave9_7;

import java.text.DecimalFormat;
import java.util.Date;

public class Account {
    private int id; // id for the account
    private static double balance; // how much money the account have
    private static double annualInterestRate; // all accounts have the same intrest rate
    private Date dateCreated; // stores the date the account was created
    static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {

        Account account1 = new Account();
        account1.setId(1);
        account1.setBalance(15000);
        account1.setAnnualInterestRate(2.0);
        account1.printAccountDetails();
        System.out.println("After one month the balance is: " + df.format(account1.getMonthlyInterest()));
        System.out.println("The monthly interest rate is: " + df.format(Account.getMonthlyInterestRate()) + " for all accounts");
        account1.withdraw(7500);
        account1.deposit(555);



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

    public static double getBalance() {
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

    public static double getMonthlyInterestRate(){

        double monthlyInterestRate = annualInterestRate /12;
         df.format(monthlyInterestRate); //TODO  fix decimals

        return monthlyInterestRate;
    }

    public static double getMonthlyInterest(){

        double monthlyinterestNumber = ((getMonthlyInterestRate() * balance) + balance );

        System.out.println(monthlyinterestNumber);

        balance = monthlyinterestNumber;

        return monthlyinterestNumber;
    }
    public static double withdraw(double x){


        if (x > balance){
            System.out.println("Error, not enough balance");
        }
        double newBalance = balance - x;

        balance = newBalance;

        System.out.println("withdrew "+ x + " new balance is: " + balance);
        return balance;
    }
    public static double deposit(double x){

        double newBalance = balance + x;

        balance = newBalance;

        System.out.println("deposited " + x + " new balance is: " + balance);
        return balance;
    }

    public void printAccountDetails(){
        System.out.println("id: " + getId() + "\n" + "balance: " + getBalance() + "\n" + "the annual interest rate is: " + getAnnualInterestRate());
    }

}

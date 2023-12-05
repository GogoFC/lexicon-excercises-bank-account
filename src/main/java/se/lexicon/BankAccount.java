package se.lexicon;

import org.iban4j.CountryCode;
import org.iban4j.Iban;

public class BankAccount {

    private Iban accountNumber = Iban.random(CountryCode.SE);
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;





    public BankAccount ( String customerName, String customerPhone, String customerEmail, double accountBalance ){
        setCustomerName(customerName);
        setCustomerPhone(customerPhone);
        setCustomerEmail(customerEmail);
        //setAccountNumber(accountNumber);
        setAccountBalance(accountBalance);
    }

    public String customerInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Customer Name: " + getCustomerName());
        stringBuilder.append(" IBAN: " + getAccountNumber());
        stringBuilder.append(" Balance: ").append(accountBalance);

        return stringBuilder.toString();
    }


    public void withdrawMoney(double amount){
        if (accountBalance < amount) throw new IllegalArgumentException("Need more money. Can't withdraw!");
        accountBalance -= amount;
    }

    public void depositMoney(double amount){
        accountBalance += amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Iban getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Iban accountNumber) {
        this.accountNumber = accountNumber;
    }

}

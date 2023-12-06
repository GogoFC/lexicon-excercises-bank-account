package se.lexicon;

import org.iban4j.CountryCode;
import org.iban4j.Iban;

public class BankAccount {

    private Iban accountNumber = Iban.random(CountryCode.SE); // = Iban.random(CountryCode.SE);
    private double accountBalance;
    //private String customerName = null;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    private String notNull = null;

    public String getNotNull() {
        if (notNull == null) throw new IllegalArgumentException("get. not null");
        return notNull;
    }


    public void setNotNull(String notNull) {
        this.notNull = null;
        if (notNull == null) throw new IllegalArgumentException("not null");
        this.notNull = notNull;
    }


    public BankAccount (String customerName, String customerPhone, String customerEmail, double accountBalance, String notNull){
        setCustomerName(customerName);
        //this.customerName = customerName;
        setCustomerPhone(customerPhone);
        setCustomerEmail(customerEmail);
        //setAccountNumber(accountNumber);
        setAccountBalance(accountBalance);
        //this.accountNumber = Iban.random(CountryCode.SE);
        //setNotNull(notNull);
        this.notNull = notNull;
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
        if (customerName.equalsIgnoreCase("name")) throw new IllegalArgumentException("Use a valid name");
        //if (customerName.isEmpty() || customerName.isBlank()) throw new IllegalArgumentException("Name null");
        //if (customerName.isEmpty()) throw new IllegalArgumentException("Length 0");
        // if (customerName.length() == 0) throw new IllegalArgumentException("Length 0");
        //if (customerName.isBlank()) throw new IllegalArgumentException("Name == isBlank");
        //if (customerName.isEmpty()) throw new IllegalArgumentException("Name == isEmpty");
        if (customerName.isBlank()) throw new IllegalArgumentException("Use a valid name");
        // Having a " " space doesn't make a string empty.
        // Having a " " space makes the string Blank.
        //if (this.customerName == null) throw  new IllegalArgumentException("GM: Condition 'customerName == null' is always 'false' ");
        if (customerName == null) throw  new IllegalArgumentException("GM: Condition 'customerName == null' is always 'false' ");
        //if (customerName.equals("\u0000")) throw new IllegalArgumentException("doesn't work");
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

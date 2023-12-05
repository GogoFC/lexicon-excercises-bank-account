package se.lexicon;

public class Main {
    public static void main(String[] args) {
        BankAccount goran = new BankAccount("Goran", "2703200023", "goran@aol.com",1000);
        System.out.println("Balance: " + goran.getAccountBalance());
        System.out.println("IBAN: " + goran.getAccountNumber());
        goran.withdrawMoney(500);
        System.out.println("Balance: " + goran.getAccountBalance());
        goran.depositMoney(10000);
        System.out.println("Balance: " + goran.getAccountBalance());
        goran.withdrawMoney(10500);
        System.out.println("Balance: " + goran.getAccountBalance());
        //goran.withdrawMoney(1);
        System.out.println(goran.customerInfo());


    }
}
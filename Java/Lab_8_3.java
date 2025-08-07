import java.util.*;

public class Lab_8_3 {
    public static void main(String[] args) {
        Account ac1 = new Account(10000);
        try {
            ac1.deposit(500);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;

        System.out.println("Deposit Amount:" + amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (balance < amount) {
            throw new InsufficientFundException("Insufficient funds. Cannot withdraw $" + amount);
        }

        balance -= amount;

        System.out.println("Withdraw Amount:" + amount);
        System.out.println("Current Balance: " + balance);
    }

}

class InsufficientFundException extends Exception {
    public InsufficientFundException(String Message) {
        super(Message);`
    }
}
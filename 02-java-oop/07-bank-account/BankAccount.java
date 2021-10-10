import java.util.Random;

public class BankAccount {
    private double checking;
    private double saving;
    
    protected static int numberOfAccounts = 0;
    protected static int totalAmount = 0;

    public BankAccount(){
        numberOfAccounts++;

    }


    public double checkingDeposit(double amount){
        this.checking += amount;
        return BankAccount.totalAmount += amount;
    }
    public double savingDeposit(double amount){
        this.saving += amount;
        return BankAccount.totalAmount += amount;
    }

    public double checkingWithdrawal(double amount){
        if(this.checking < amount){
            System.out.printf("Insufficient funds");
        }
        this.checking -= amount;
        return BankAccount.totalAmount -= amount;
    }
    public double savingWithdrawal(double amount){
        if(this.saving < amount){
            System.out.printf("Insufficient funds");
        }
        this.saving -= amount;
        return BankAccount.totalAmount -= amount;
    }

    public void displayBalances(){
        System.out.printf("Checking Balance: %2f", this.checking);
        System.out.printf("Saving Balance: %2f", this.saving);
    }

    public double getChecking(){
        return this.checking;
    }
    public double getSaving(){
        return this.saving;
    }
}
public class BankAccountTester {
    public static void main(String[] args) {
        System.out.println(BankAccount.numberOfAccounts);
        System.out.println(BankAccount.totalAmount);
        BankAccount b= new BankAccount();

        b.checkingDeposit(5000);
        b.savingDeposit(5000);

        System.out.println(b.getChecking());
        b.savingDeposit(5000);

        System.out.println(b.getSaving());
        b.checkingWithdrawal(4000);

        System.out.println(b.getChecking());
        b.checkingWithdrawal(1000);

        System.out.println(b.getChecking());
        b.savingWithdrawal(100);

        b.displayBalances();
    }
}
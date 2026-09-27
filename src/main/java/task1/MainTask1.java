package task1;

public class MainTask1 {
    public static void main(String[] args) {
        DigitalWallet wallet = new DigitalWallet("Ali Khan", 1000.0, "4321");
        System.out.println("Holder: " + wallet.getAccountHolder());
        System.out.println("Balance: " + wallet.getBalance());

        boolean result1 = wallet.withdraw(300, "0000");
        System.out.println("Withdraw with wrong PIN succeeded? " + result1);

        boolean result2 = wallet.withdraw(300, "4321");
        System.out.println("Withdraw with correct PIN succeeded? " + result2);
        System.out.println("New Balance: " + wallet.getBalance());

        boolean result3 = wallet.withdraw(5000, "4321");
        System.out.println("Withdraw more than balance succeeded? " + result3);
    }
}
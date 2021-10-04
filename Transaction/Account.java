import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {
    private double balance;

    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * deposit.
     */
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * withdraw.
     */
    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
        }
    }

    /**
     * add transaction to arraylist.
     */
    public void addTransaction(double amount, String operation) {
        if (!operation.equals(Transaction.DEPOSIT) && !operation.equals(Transaction.WITHDRAW)) {
            System.out.println("Yeu cau khong hop le!");
        } else {
            if (operation.equals(Transaction.DEPOSIT)) {
               deposit(amount);
            } else {
                withdraw(amount);
            }
            transitionList.add(new Transaction(operation, amount, balance));
        }
    }

    DecimalFormat f2 = new DecimalFormat("##.00"); // in ra 2 só thập phân sau dấu phẩy

    /**
     * print.
     */
    public void printTransaction() {
        int i = 1;
        for (Transaction t : transitionList) {
            if (t.getOperation().equals(Transaction.DEPOSIT)) {
                double d = t.getAmount();
                System.out.print("Giao dich " + i + ": Nap tien $" + f2.format(d) + ". ");
            } else {
                double d = t.getAmount();
                System.out.print("Giao dich " + i + ": Rut tien $" + f2.format(d) + ". ");
            }
            System.out.println("So du luc nay: $" + f2.format(t.getBalance()) + ".");
            i++;
        }
    }
}

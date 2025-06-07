package Expense-Tracker;
import java.util.ArrayList;

public class ExpenseTracker {
    private ArrayList<Transaction> transactions;

    public ExpenseTracker() {
        try {
            File expenses = new File("expense_record.csv");
            if (expenses.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}

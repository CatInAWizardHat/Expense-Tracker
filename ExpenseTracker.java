package Expense-Tracker;
import java.util.ArrayList;
import java.util.IOException;
import java.util.Scanner;

public class ExpenseTracker {
    private ArrayList<Transaction> transactions;
    private File transactionFile;

    public void addTransaction() {

    }

    private void read(File file) throws IOException {
        Scanner sc = new Scanner(file);

        while(scanner.hasNext()) {
            String[] tokens = scanner.nextLine.split(',');
            int id = tokens[0];
            string name = tokens[1];
            double price = tokens[2];
            string date = tokens[3];
        }
    }

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

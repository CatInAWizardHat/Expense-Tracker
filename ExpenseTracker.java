import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {

    private ArrayList<Transaction> transactions;
    private File transactionFile;

    public ExpenseTracker() {
        try {
            transactionFile = new File("expense_record.csv");
            if (transactionFile.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
            this.read(transactionFile);
        } catch (IOException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    private void read(File file) throws IOException {
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String[] tokens = sc.nextLine().split(",");
            int id = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            double price = Double.parseDouble(tokens[2]);
            String date = tokens[3];
            this.addTransaction(id, name, price, date);
        }

        sc.close();
    }

    public void addTransaction(int id, String name, double price, String date) {
        transactions.add(new Transaction(id, name, price, date));
    }
}

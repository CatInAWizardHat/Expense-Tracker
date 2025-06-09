import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {

    private static final String FILE_NAME = "transaction_record.csv";
    private ArrayList<Transaction> transactions;
    private File transactionFile;

    public ExpenseTracker() {
        try {
            transactionFile = new File(FILE_NAME);
            if (transactionFile.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
            this.read(transactionFile);
        } catch (IOException err) {
            System.out.println(err.toString());
            err.printStackTrace();
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

    private void write(File file) throws IOException {
        FileWriter writer = new FileWriter(FILE_NAME);
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            writer.write(
                "" +
                transaction.getID() +
                "," +
                transaction.getName() +
                "," +
                transaction.getPrice() +
                "," +
                transaction.getDate() +
                "\n"
            );
        }
        writer.close();
    }

    public void addTransaction(int id, String name, double price, String date) {
        transactions.add(new Transaction(id, name, price, date));
    }

    public void save() {
        try {
            this.write(transactionFile);
            System.out.println("Saved successfully");
        } catch (IOException err) {
            System.out.println(err.toString());
            err.printStackTrace();
        }
    }

    public void print() {
        System.out.format(
            "%10s|%24s|%10s|%10s|\n",
            "ID",
            "NAME",
            "PRICE",
            "DATE"
        );
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i).toString());
        }
    }
}

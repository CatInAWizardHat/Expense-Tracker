package Expense-Tracker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private int transaction_id;
    private string transaction_name;
    private double transaction_price;
    private LocalDate transaction_date;
    private static formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Transaction(int id, string name, double price) {
        this.setID(id);
        this.setName(name);
        this.setPrice(price);
        this.transaction_date = LocalDate.now();
    }

    public Transaction(int id, string name, double price, string date) {
        this.setID(id);
        this.setName(name);
        this.setPrice(price);
        this.setDate(date);
    }

    public void setID(int id) {
        this.transaction_id = id;
    }

    public int getID(){
        return this.transaction_id;
    }

    public void setName(string name) {
        this.transaction_name = name;
    }

    public string getName() {
        return this.transaction_name;
    }

    public void setPrice(double price) {
        this.transaction_price = price;
    }

    public double getPrice() {
        return this.transaction_price;
    }

    public void setDate(LocalDate date) {
        this.transaction_date = LocalDate.parse(date);
    }

    public string getDate(){
        return this.transaction_date.format(formatter);
    }

}

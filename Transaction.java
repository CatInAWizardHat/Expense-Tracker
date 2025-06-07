package Expense-Tracker;
import java.time.LocalDate;

public class Transaction {
    private int transaction_id;
    private string transaction_name;
    private double transaction_price;
    private LocalDate transaction_date;

    public Transaction() {
        this.transaction_id = -1;
        this.transaction_name = "";
        this.transaction_price = -1;
        this.transaction_date = LocalDate.now();
    }

    public Transaction(int id, string name, double price, LocalDate date) {
        this.transaction_id = id;
        this.transaction_name = name;
        this.transaction_price = price;
        this.transaction_date = date;
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
        this.transaction_date = date;
    }

    public LocalDate getDate(){
        return this.transaction_date;
    }

}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private int transaction_id;
    private String transaction_name;
    private double transaction_price;
    private LocalDate transaction_date;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
        "yyyy-MM-dd"
    );

    public Transaction(int id, String name, double price) {
        this(id, name, price, LocalDate.now().format(formatter));
    }

    public Transaction(int id, String name, double price, String date) {
        this.setID(id);
        this.setName(name);
        this.setPrice(price);
        this.setDate(date);
    }

    public void setID(int id) {
        this.transaction_id = id;
    }

    public int getID() {
        return this.transaction_id;
    }

    public void setName(String name) {
        this.transaction_name = name;
    }

    public String getName() {
        return this.transaction_name;
    }

    public void setPrice(double price) {
        this.transaction_price = price;
    }

    public double getPrice() {
        return this.transaction_price;
    }

    public void setDate(String date) {
        this.transaction_date = LocalDate.parse(date);
    }

    public String getDate() {
        return this.transaction_date.format(formatter);
    }

    @Override
    public String toString() {
        return String.format(
            "%10d|%24s|%10.2f|%10s|\n",
            this.getID(),
            this.getName(),
            this.getPrice(),
            this.getDate()
        );
    }
}

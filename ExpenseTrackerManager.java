package Expense-Tracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class ExpenseTrackerManager {
    final static string VALID_CHOICES="cup"
    final static string CREATE_RECORD="c";
    final static string UPDATE_RECORD="u";
    final static string PRINT_RECORDS="p";

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            File expenses = new File("expense_record.txt");
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

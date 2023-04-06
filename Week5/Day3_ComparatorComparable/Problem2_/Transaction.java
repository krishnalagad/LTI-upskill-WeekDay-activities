package Problem2_;

import java.text.*;
import java.util.*;

class Transaction {
    private int id;
    private double amount;
    private String location;
    private String status;
    private Date transaction_date;
    private Long receiver_account_id;
    private Long sender_account_id;

    public Transaction() {
        // Default constructor
    }

    public Transaction(
            int id, double amount, String location, String status, Date transaction_date,
            Long receiver_account_id, Long sender_account_id) {
        super();
        this.id = id;
        this.amount = amount;
        this.location = location;
        this.status = status;
        this.transaction_date = transaction_date;
        this.receiver_account_id = receiver_account_id;
        this.sender_account_id = sender_account_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Long getReceiver_account_id() {
        return receiver_account_id;
    }

    public void setReceiver_account_id(Long receiver_account_id) {
        this.receiver_account_id = receiver_account_id;
    }

    public Long getSender_account_id() {
        return sender_account_id;
    }

    public void setSender_account_id(Long sender_account_id) {
        this.sender_account_id = sender_account_id;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("%-20d %-20.1f %-20s %-20s %-20s %-20d %-20d", id, amount, location, status,
                df.format(transaction_date), receiver_account_id, sender_account_id);
    }
}
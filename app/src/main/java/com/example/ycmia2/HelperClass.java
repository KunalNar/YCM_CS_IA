package com.example.ycmia2;

public class HelperClass {

    String item, message, time, amount;

    public HelperClass() {

    }

    public HelperClass(String item, String message, String time, String amount) {
        this.item = item;
        this.message = message;
        this.time = time;
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}

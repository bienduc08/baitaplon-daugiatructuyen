package com.uet.auction.model;

public class User {
    private int id;
    private String username;
    private String password;
    private double balance; // Số dư tài khoản để tham gia đấu giá

    public User(int id, String username, String password, double balance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    // Getter và Setter (IntelliJ có thể tự tạo bằng Alt + Insert)
    public String getUsername() {return username; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}

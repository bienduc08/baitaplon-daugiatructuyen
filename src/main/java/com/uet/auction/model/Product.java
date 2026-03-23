package com.uet.auction.model;
import java.time.LocalDateTime;
public class Product {
    private int id;
    private String name;
    private double startPrice;
    private double currentPrice;
    private User highestBidder; // Người đang trả giá cao nhất
    private LocalDateTime endTime; // Thời gian kết thúc phiên (Mục 3.1.4)

    public Product(int id, String name, double startPrice, LocalDateTime endTime) {
        this.id = id;
        this.name = name;
        this.startPrice = startPrice;
        this.currentPrice = startPrice;
        this.endTime = endTime;
    }

    // Getter và Setter
    public double getCurrentPrice() { return currentPrice; }
    public void setCurrentPrice(double currentPrice) { this.currentPrice = currentPrice; }
    public User getHighestBidder() { return highestBidder; }
    public void setHighestBidder(User user) { this.highestBidder = user; }
    public LocalDateTime getEndTime() { return endTime; }
}

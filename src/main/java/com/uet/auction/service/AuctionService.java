package com.uet.auction.service;

import com.uet.auction.model.Product;
import com.uet.auction.model.User;
import java.time.LocalDateTime;

public class AuctionService {

    // Hàm đặt giá (Mục 3.1.3)
    // Dùng 'synchronized' để xử lý Đấu giá đồng thời (Mục 3.2.2)
    public synchronized String placeBid(User user, Product product, double bidAmount) {
        // 1. Kiểm tra thời gian (Mục 3.1.4)
        if (LocalDateTime.now().isAfter(product.getEndTime())) {
            return "Lỗi: Phiên đấu giá đã kết thúc!";
        }

        // 2. Kiểm tra giá đặt phải cao hơn giá hiện tại (Mục 3.1.5)
        if (bidAmount <= product.getCurrentPrice()) {
            return "Lỗi: Giá đặt phải cao hơn giá hiện tại!";
        }

        // 3. Kiểm tra số dư người dùng
        if (user.getBalance() < bidAmount) {
            return "Lỗi: Số dư tài khoản không đủ!";
        }

        // 4. Cập nhật giá mới và người giữ giá
        product.setCurrentPrice(bidAmount);
        product.setHighestBidder(user);

        return "Chúc mừng " + user.getUsername() + " đã đặt giá thành công: " + bidAmount;
    }
}
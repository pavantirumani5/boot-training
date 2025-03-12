package com.cloud.ms.training.controller.model.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class OrderDto {
    private UUID orderId;
    private String orderItem;
    private LocalDateTime orderPlacedDate;

    public LocalDateTime getOrderPlacedDate() {
        return orderPlacedDate;
    }

    public void setOrderPlacedDate(LocalDateTime orderPlacedDate) {
        this.orderPlacedDate = orderPlacedDate;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }
}

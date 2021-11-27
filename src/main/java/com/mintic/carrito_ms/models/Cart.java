package com.mintic.carrito_ms.models;
import org.springframework.data.annotation.Id;

public class Cart {
    @Id
    private String userId;
    private String name;
    private Integer amount;
    private Float total;
    private Integer product_id;

    public Cart(String userId,String name, Integer amount, Float total, Integer product_id){
        this.userId = userId;
        this.name = name;
        this.amount = amount;
        this.total = total;
        this.product_id = product_id;
    }

    public String getuserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Integer getAmount() {
        return amount;
    }

    public Float getTotal() {
        return total;
    }

    public Integer getProduct_id() {
        return product_id;
    }
    public void setuserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
}

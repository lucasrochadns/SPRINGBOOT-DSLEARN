package com.devsuperior.capitulo23.domain.entities;

import com.devsuperior.capitulo23.domain.entities.ok.OrderItemPk;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="tb_order_item")
public class OrderItem implements Serializable {

      private static final long serialVersionUID = 1L;

      @EmbeddedId
      private OrderItemPk orderItemPk;
      private Integer quantity;
      private Double price;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
        this.orderItemPk.setOrder(order);
        this.orderItemPk.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Order getOrder(){
        return this.orderItemPk.getOrder();
    }
    public void setOrder(Order order){
        this.orderItemPk.setOrder(order);
    }

    public Product getProduct(){
        return this.orderItemPk.getProduct();
    }

    public void setProcut(Product product){
        this.orderItemPk.setProduct(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(orderItemPk, orderItem.orderItemPk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderItemPk);
    }
}

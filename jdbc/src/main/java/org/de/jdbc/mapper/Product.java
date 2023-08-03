package org.de.jdbc.mapper;

import java.time.LocalDateTime;

public class Product {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    LocalDateTime updatedAt;
    String contents;
    int price;

    public Product(int id, String name, LocalDateTime updatedAt, String contents, int price) {
        this.id = id;
        this.name = name;
        this.updatedAt = updatedAt;
        this.contents = contents;
        this.price = price;
    }

    @Override
    public String toString() {
        // 모든 object는 toString을 메소드를 가지고 있어서 상속이 가능하다.
        return "Product{" +
                "id= " + id +
                ", name= " + name +
                ", updatedAt= "+ updatedAt +
                ", contents= " + contents +
                ", price= " + price +
                "}";
    }
}

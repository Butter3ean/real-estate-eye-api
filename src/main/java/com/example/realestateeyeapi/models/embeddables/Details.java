package com.example.realestateeyeapi.models.embeddables;

import jakarta.persistence.Embeddable;

import java.text.DecimalFormat;
import java.util.Objects;

@Embeddable
public class Details {
    private Double price;
    private Integer beds;
    private Double baths;
    private Integer sqFt;

    public Details() {}

    public Details(Double price, Integer beds, Double baths, Integer sqFt) {
        this.price = price;
        this.beds = beds;
        this.baths = baths;
        this.sqFt = sqFt;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Double getBaths() {
        return baths;
    }

    public void setBaths(Double baths) {
        this.baths = baths;
    }

    public Integer getSqFt() {
        return sqFt;
    }

    public void setSqFt(Integer sqFt) {
        this.sqFt = sqFt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details details = (Details) o;
        return price.equals(details.price) && beds.equals(details.beds) && baths.equals(details.baths) && sqFt.equals(details.sqFt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, beds, baths, sqFt);
    }

    @Override
    public String toString() {
        return "Details{" +
                "price=" + DecimalFormat.getCurrencyInstance().format(price) +
                ", beds=" + beds +
                ", baths=" + baths +
                ", sqFt=" + sqFt +
                '}';
    }
}

package com.example.realestateeyeapi.models;

import com.example.realestateeyeapi.models.embeddables.Address;
import com.example.realestateeyeapi.models.embeddables.Coordinates;
import com.example.realestateeyeapi.models.embeddables.Details;
import com.example.realestateeyeapi.models.embeddables.URLs;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class RealEstateListing {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private Integer mlsNum;
    @Embedded
    private Details details;
    @Embedded
    private Coordinates coordinates;
    @Embedded
    private Address address;
    @Embedded
    private URLs urls;

    public RealEstateListing() {}

    public RealEstateListing(Integer mlsNum, Details details, Coordinates coordinates, Address address, URLs urls) {
        this.mlsNum = mlsNum;
        this.details = details;
        this.coordinates = coordinates;
        this.address = address;
        this.urls = urls;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMlsNum() {
        return mlsNum;
    }

    public void setMlsNum(Integer mlsNum) {
        this.mlsNum = mlsNum;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public URLs getUrls() {
        return urls;
    }

    public void setUrls(URLs urls) {
        this.urls = urls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealEstateListing that = (RealEstateListing) o;
        return id.equals(that.id) && mlsNum.equals(that.mlsNum) && details.equals(that.details) && coordinates.equals(that.coordinates) && address.equals(that.address) && urls.equals(that.urls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mlsNum, details, coordinates, address, urls);
    }

    @Override
    public String toString() {
        return "RealEstateListing{" +
                "id=" + id +
                ", mlsNum=" + mlsNum +
                ", details=" + details +
                ", coordinates=" + coordinates +
                ", address=" + address +
                ", urls=" + urls +
                '}';
    }
}

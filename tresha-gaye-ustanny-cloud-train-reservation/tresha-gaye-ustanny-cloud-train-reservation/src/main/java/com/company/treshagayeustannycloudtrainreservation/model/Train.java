package com.company.treshagayeustannycloudtrainreservation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name ="train")
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "train_id")
    private Integer trainId;

    private String name;

    private String model;

    private String manufacturer;

    private String year;

    @Column(name = "total_seats")
    private int totalSeats;

    @Column(name = "seat_layout")
    private int seatLayout;

    @Column(name = "power_type")
    private int powerType;

    public Train(Integer trainId, String name, String model, String manufacturer, String year, int totalSeats, int seatLayout, int powerType) {
        this.trainId = trainId;
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.totalSeats = totalSeats;
        this.seatLayout = seatLayout;
        this.powerType = powerType;
    }

    public Train(String name, String model, String manufacturer, String year, int totalSeats, int seatLayout, int powerType) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.totalSeats = totalSeats;
        this.seatLayout = seatLayout;
        this.powerType = powerType;
    }

    public Train() {

    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getSeatLayout() {
        return seatLayout;
    }

    public void setSeatLayout(int seatLayout) {
        this.seatLayout = seatLayout;
    }

    public int getPowerType() {
        return powerType;
    }

    public void setPowerType(int powerType) {
        this.powerType = powerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return totalSeats == train.totalSeats && seatLayout == train.seatLayout && powerType == train.powerType && Objects.equals(trainId, train.trainId) && Objects.equals(name, train.name) && Objects.equals(model, train.model) && Objects.equals(manufacturer, train.manufacturer) && Objects.equals(year, train.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainId, name, model, manufacturer, year, totalSeats, seatLayout, powerType);
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId=" + trainId +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year='" + year + '\'' +
                ", totalSeats=" + totalSeats +
                ", seatLayout=" + seatLayout +
                ", powerType=" + powerType +
                '}';
    }
}

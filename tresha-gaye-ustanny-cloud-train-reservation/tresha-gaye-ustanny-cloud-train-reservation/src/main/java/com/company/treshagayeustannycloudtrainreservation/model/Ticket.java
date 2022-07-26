package com.company.treshagayeustannycloudtrainreservation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name ="ticket")
public class Ticket {

    @Id
    @Column(name = "route_id")
    private Integer routeId;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "source_station_id")
    private int sourceStationId;

    @Column(name = "destination_station_id")
    private int destinationStationId;

    private BigDecimal price;

    @Column(name = "ticket_date")
    private LocalDate ticketDate;

    @Column(name = "seat_no")
    private String seatNo;

    public Ticket(Integer routeId, int customerId, String firstName, int sourceStationId, int destinationStationId, BigDecimal price, LocalDate ticketDate, String seatNo) {
        this.routeId = routeId;
        this.customerId = customerId;
        this.firstName = firstName;
        this.sourceStationId = sourceStationId;
        this.destinationStationId = destinationStationId;
        this.price = price;
        this.ticketDate = ticketDate;
        this.seatNo = seatNo;
    }

    public Ticket() {
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getSourceStationId() {
        return sourceStationId;
    }

    public void setSourceStationId(int sourceStationId) {
        this.sourceStationId = sourceStationId;
    }

    public int getDestinationStationId() {
        return destinationStationId;
    }

    public void setDestinationStationId(int destinationStationId) {
        this.destinationStationId = destinationStationId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(LocalDate ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return customerId == ticket.customerId && sourceStationId == ticket.sourceStationId && destinationStationId == ticket.destinationStationId && Objects.equals(routeId, ticket.routeId) && Objects.equals(firstName, ticket.firstName) && Objects.equals(price, ticket.price) && Objects.equals(ticketDate, ticket.ticketDate) && Objects.equals(seatNo, ticket.seatNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeId, customerId, firstName, sourceStationId, destinationStationId, price, ticketDate, seatNo);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "routeId=" + routeId +
                ", customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", sourceStationId=" + sourceStationId +
                ", destinationStationId=" + destinationStationId +
                ", price=" + price +
                ", ticketDate=" + ticketDate +
                ", seatNo='" + seatNo + '\'' +
                '}';
    }
}

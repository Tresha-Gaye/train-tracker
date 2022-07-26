package com.company.treshagayeustannycloudtrainreservation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"jsonLazyInitializer", "handler"})
@Table(name="route_station")
public class RouteStation {

    @Id
    @Column(name="route_id")
    private Integer routeId;
    @Column(name="station_id")
    private Integer stationId;

    @Column(name="scheduled_arrival")
    private String scheduledArrival;

    @Column(name="scheduled_departure")
    private String scheduledDeparture;

    public RouteStation(Integer routeId, Integer stationId, String scheduledArrival, String scheduledDeparture) {
        this.routeId = routeId;
        this.stationId = stationId;
        this.scheduledArrival = scheduledArrival;
        this.scheduledDeparture = scheduledDeparture;
    }

    public RouteStation(){

    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(String scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public String getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(String scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RouteStation that = (RouteStation) o;
        return Objects.equals(routeId, that.routeId) && Objects.equals(stationId, that.stationId) && Objects.equals(scheduledArrival, that.scheduledArrival) && Objects.equals(scheduledDeparture, that.scheduledDeparture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeId, stationId, scheduledArrival, scheduledDeparture);
    }

    @Override
    public String toString() {
        return "RouteStation{" +
                "routeId=" + routeId +
                ", stationId=" + stationId +
                ", scheduledArrival='" + scheduledArrival + '\'' +
                ", scheduledDeparture='" + scheduledDeparture + '\'' +
                '}';
    }
}
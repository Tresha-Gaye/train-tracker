package com.company.treshagayeustannycloudtrainreservation.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"jsonLazyInitializer", "handler"})
@Table(name="route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "route_id")
    private Integer routeId;
    @Column(name= "route_name")
    private String route_name;
    @Column(name= "train_id")
    private int trainId;
    @Column(name= "source_station_id")
    private int sourceStationId;
    @Column(name= "destination_station_id")
    private int destinationStationId;


    public Route(String route_name, int trainId, int sourceStationId, int destinationStationId) {
        this.route_name = route_name;
        this.trainId = trainId;
        this.sourceStationId = sourceStationId;
        this.destinationStationId = destinationStationId;
    }

    public Route(Integer routeId, String route_name, int trainId, int sourceStationId, int destinationStationId) {
        this.routeId = routeId;
        this.route_name = route_name;
        this.trainId = trainId;
        this.sourceStationId = sourceStationId;
        this.destinationStationId = destinationStationId;
    }
    public Route(){

    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getRoute_name() {
        return route_name;
    }

    public void setRoute_name(String route_name) {
        this.route_name = route_name;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return routeId == route.routeId && trainId == route.trainId && sourceStationId == route.sourceStationId && destinationStationId == route.destinationStationId && Objects.equals(route_name, route.route_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeId, route_name, trainId, sourceStationId, destinationStationId);
    }


    @Override
    public String toString() {
        return "Route{" +
                "routeId=" + routeId +
                ", route_name='" + route_name + '\'' +
                ", trainId=" + trainId +
                ", sourceStationId=" + sourceStationId +
                ", destinationStationId=" + destinationStationId +
                '}';
    }

}

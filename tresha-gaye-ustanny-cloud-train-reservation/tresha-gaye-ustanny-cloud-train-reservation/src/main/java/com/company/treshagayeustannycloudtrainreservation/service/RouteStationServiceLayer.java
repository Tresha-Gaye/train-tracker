package com.company.treshagayeustannycloudtrainreservation.service;

import com.company.treshagayeustannycloudtrainreservation.model.RouteStation;
import com.company.treshagayeustannycloudtrainreservation.repository.RouteStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class RouteStationServiceLayer {

    @Autowired
    RouteStationRepository routeStationRepository;

    @Autowired
    public RouteStationServiceLayer(RouteStationRepository routeStationRepository) {
        this.routeStationRepository = routeStationRepository;
    }

    public RouteStation createRouteStation(RouteStation routeStation) {
        return routeStationRepository.save(routeStation);
    }

    public RouteStation getRouteByRouteId(Integer routeId) {
        Optional<RouteStation> routeStation = routeStationRepository.findById(routeId);
        return routeStation.isPresent() ? routeStation.get() : null;
    }

    public List<RouteStation> findAllRouteStations() {
        return routeStationRepository.findAll();
    }
    public void deleteRouteStation(Integer routeId) {  routeStationRepository.deleteById(routeId);  }


    public void updateRouteStation(RouteStation routeStation) {
        routeStationRepository.save(routeStation);
    }
}
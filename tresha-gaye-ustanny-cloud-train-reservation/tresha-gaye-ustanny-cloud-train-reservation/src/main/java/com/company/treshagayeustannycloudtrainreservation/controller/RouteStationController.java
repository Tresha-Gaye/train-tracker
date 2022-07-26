package com.company.treshagayeustannycloudtrainreservation.controller;

import com.company.treshagayeustannycloudtrainreservation.model.RouteStation;
import com.company.treshagayeustannycloudtrainreservation.service.RouteStationServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class RouteStationController {

    @Autowired
    RouteStationServiceLayer routeStationServiceLayer;

    @PostMapping("/routeStation")
    public RouteStation addRouteStation (@RequestBody RouteStation routeStation) {
        return routeStationServiceLayer.createRouteStation(routeStation);
    }

    @GetMapping("/routeStation")
    public List<RouteStation> getAllRouteStations () {

        return routeStationServiceLayer.findAllRouteStations();
    }

    @GetMapping ("/routeStation/{routeId}")
    public RouteStation getRouteStationByRouteId (@PathVariable Integer routeId){
        return routeStationServiceLayer.getRouteByRouteId(routeId);
    }

    @PutMapping ("/routeStation")
    public void updateRouteStation(@RequestBody RouteStation routeStation) {
        routeStationServiceLayer.updateRouteStation(routeStation);
    }

    @DeleteMapping ("/routeStation/{routeId}")
    public void deleteRouteStation(@PathVariable Integer routeId) {
        routeStationServiceLayer.deleteRouteStation(routeId);
    }


}

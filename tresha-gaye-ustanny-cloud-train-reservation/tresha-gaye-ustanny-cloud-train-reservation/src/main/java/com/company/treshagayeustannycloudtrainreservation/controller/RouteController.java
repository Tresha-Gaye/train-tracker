package com.company.treshagayeustannycloudtrainreservation.controller;

import com.company.treshagayeustannycloudtrainreservation.model.Route;
import com.company.treshagayeustannycloudtrainreservation.service.RouteServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class RouteController {

    @Autowired
    RouteServiceLayer routeServiceLayer;

    @PostMapping("/route")
    public Route addRoute (@RequestBody Route route) {
        return routeServiceLayer.createRoute(route);
    }

    @GetMapping("/route")
    public List<Route> getAllRoutes () {

        return routeServiceLayer.findAllRoutes();
    }

    @GetMapping ("/route/{routeId}")
    public Route getRouteById (@PathVariable Integer routeId){
        return routeServiceLayer.getRouteById(routeId);
    }

    @PutMapping ("/route")
    public void updateRoute(@RequestBody Route route) {
        routeServiceLayer.updateRoute(route);
    }

    @DeleteMapping ("/route/{routeId}")
    public void deleteRoute(@PathVariable Integer routeId) {
        routeServiceLayer.deleteRoute(routeId);
    }
    
}

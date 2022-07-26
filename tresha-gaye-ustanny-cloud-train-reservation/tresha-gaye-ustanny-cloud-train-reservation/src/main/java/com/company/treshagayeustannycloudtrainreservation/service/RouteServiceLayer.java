package com.company.treshagayeustannycloudtrainreservation.service;


import com.company.treshagayeustannycloudtrainreservation.model.Route;
import com.company.treshagayeustannycloudtrainreservation.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteServiceLayer {

    @Autowired
    RouteRepository routeRepository;

    @Autowired
    public RouteServiceLayer(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public Route createRoute(Route route) {
        return routeRepository.save(route);
    }

    public Route getRouteById(Integer routeId) {
        Optional<Route> route = routeRepository.findById(routeId);
        return route.isPresent() ? route.get() : null;
    }

    public List<Route> findAllRoutes() {
        return routeRepository.findAll();
    }

    public void deleteRoute(Integer routeId) {
        routeRepository.deleteById(routeId);

    }

    public void updateRoute(Route route) {
        routeRepository.save(route);
    }


}

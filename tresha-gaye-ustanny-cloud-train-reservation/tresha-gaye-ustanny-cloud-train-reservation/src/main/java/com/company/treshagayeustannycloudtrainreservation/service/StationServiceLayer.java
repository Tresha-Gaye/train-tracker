package com.company.treshagayeustannycloudtrainreservation.service;

import com.company.treshagayeustannycloudtrainreservation.model.Station;
import com.company.treshagayeustannycloudtrainreservation.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StationServiceLayer {

    @Autowired
    StationRepository stationRepository;

    @Autowired

    public StationServiceLayer(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public Station createStation(Station station) {
        return stationRepository.save(station);
    }

    public Station getStationById(Integer routeId) {
        Optional<Station> station = stationRepository.findById(routeId);
        return station.isPresent() ? station.get() : null;
    }

    public List<Station> findAllStations() {
        return stationRepository.findAll();
    }

    //when we update a train we will pass the request body with the id of the customer we want to update.
    public void updateStation(Station station) {
        stationRepository.save(station);
    }

    public void deleteStation(Integer routeId) {
        stationRepository.deleteById(routeId);
    }
}

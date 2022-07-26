package com.company.treshagayeustannycloudtrainreservation.repository;

import com.company.treshagayeustannycloudtrainreservation.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {
}

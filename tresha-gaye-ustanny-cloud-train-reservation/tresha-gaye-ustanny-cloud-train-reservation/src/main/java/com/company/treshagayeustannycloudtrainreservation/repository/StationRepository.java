package com.company.treshagayeustannycloudtrainreservation.repository;

import com.company.treshagayeustannycloudtrainreservation.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {
}

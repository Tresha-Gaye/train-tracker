package com.company.treshagayeustannycloudtrainreservation.repository;

import com.company.treshagayeustannycloudtrainreservation.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {

}

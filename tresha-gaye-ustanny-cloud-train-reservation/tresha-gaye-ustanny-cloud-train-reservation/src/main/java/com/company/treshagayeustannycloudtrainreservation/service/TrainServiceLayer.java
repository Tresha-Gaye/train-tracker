package com.company.treshagayeustannycloudtrainreservation.service;

import com.company.treshagayeustannycloudtrainreservation.model.Train;
import com.company.treshagayeustannycloudtrainreservation.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TrainServiceLayer {

    @Autowired
    private TrainRepository trainRepository;

    @Autowired
    public TrainServiceLayer(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public Train createTrain(Train train) {
        return trainRepository.save(train);
    }

    public Train getTrainById(Integer trainId) {
        Optional<Train> train = trainRepository.findById(trainId);
        return train.isPresent() ? train.get() : null;
    }

    public List<Train> findAllTrains() {
        return trainRepository.findAll();
    }

    public void deleteTrain(Integer trainId) {
        // Remove album
      trainRepository.deleteById(trainId);

    }

    public void updateTrain(Train train) {

        trainRepository.save(train);
    }




}

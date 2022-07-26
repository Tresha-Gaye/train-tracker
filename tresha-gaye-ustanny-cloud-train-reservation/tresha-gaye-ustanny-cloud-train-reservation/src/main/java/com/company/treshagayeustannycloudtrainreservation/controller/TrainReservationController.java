package com.company.treshagayeustannycloudtrainreservation.controller;

import com.company.treshagayeustannycloudtrainreservation.model.Train;
import com.company.treshagayeustannycloudtrainreservation.service.TrainServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TrainReservationController {

    @Autowired
    TrainServiceLayer trainServiceLayer;

    @PostMapping ("/train")
    public Train addTrain (@RequestBody Train train) {
        return trainServiceLayer.createTrain(train);
    }

}

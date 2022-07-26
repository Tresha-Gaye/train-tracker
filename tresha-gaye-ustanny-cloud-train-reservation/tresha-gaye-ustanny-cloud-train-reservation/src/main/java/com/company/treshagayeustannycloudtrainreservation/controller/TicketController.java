package com.company.treshagayeustannycloudtrainreservation.controller;

import com.company.treshagayeustannycloudtrainreservation.model.Ticket;
import com.company.treshagayeustannycloudtrainreservation.service.TicketServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class TicketController {

    @Autowired
    TicketServiceLayer ticketServiceLayer;

    @PostMapping("/ticket")
    public Ticket addTicket (@RequestBody Ticket ticket) {
        return ticketServiceLayer.createTicket(ticket);
    }

    @GetMapping("/ticket")
    public List<Ticket> getAllTickets () {

        return ticketServiceLayer.findAllTickets();
    }

    @GetMapping ("/ticket/{routeId}")
    public Ticket getTicketById (@PathVariable Integer routeId){
        return ticketServiceLayer.getTicketById(routeId);
    }

    @PutMapping ("/ticket")
    public void updateTicket(@RequestBody Ticket ticket) {
        ticketServiceLayer.updateTicket(ticket);
    }

    @DeleteMapping ("/ticket/{ticketId}")
    public void deleteTicket(@PathVariable Integer routeId) {
        ticketServiceLayer.deleteTicket(routeId);
    }
}
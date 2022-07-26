package com.company.treshagayeustannycloudtrainreservation.service;

import com.company.treshagayeustannycloudtrainreservation.model.Ticket;
import com.company.treshagayeustannycloudtrainreservation.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceLayer {


    private TicketRepository ticketRepository;

    @Autowired
    public TicketServiceLayer(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket getTicketById(Integer routeId) {
        Optional<Ticket> ticket = ticketRepository.findById(routeId);
        return ticket.isPresent() ? ticket.get() : null;
    }

    public List<Ticket> findAllTickets() {
        return ticketRepository.findAll();
    }

    //when we update a customer we will pass the request body with the id of the customer we want to update.
    public void updateTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void deleteTicket(Integer routeId) {
        ticketRepository.deleteById(routeId);
    }

}
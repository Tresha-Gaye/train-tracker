package com.company.treshagayeustannycloudtrainreservation.repository;

import com.company.treshagayeustannycloudtrainreservation.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {



}

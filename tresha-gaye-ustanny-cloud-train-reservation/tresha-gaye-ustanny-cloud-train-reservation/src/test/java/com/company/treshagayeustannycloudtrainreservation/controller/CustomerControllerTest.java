package com.company.treshagayeustannycloudtrainreservation.controller;

import com.company.treshagayeustannycloudtrainreservation.model.Customer;
import com.company.treshagayeustannycloudtrainreservation.service.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    CustomerServiceLayer customerService;
//    TrainServiceLayer trainService;
//    StationServiceLayer stationService;
//    RouteServiceLayer routeService;
//    RouteStationServiceLayer routeStationService;
//    TicketServiceLayer ticketService;

    private Customer inputCustomer;
    private String inputCustomerJsonString;
    private Customer outputCustomer;
    private String outputCustomerJsonString;
    private List<Customer> customerList;
    private String outputCustomerListJsonString;

    private static final Integer CUSTOMER_ID = 42;

    ObjectMapper objectMapper = new ObjectMapper();

    @Before
    public void setUp() throws Exception {
        inputCustomer = new Customer();
        inputCustomer.setFirstName("Jack");
        inputCustomer.setLastName("Flash");
        inputCustomer.setEmail("jflash@coolmail.net");
        inputCustomer.setMobile("9998887765");
        inputCustomer.setPassword("secretpass");

        outputCustomer = new Customer();
        outputCustomer.setCustomerId(CUSTOMER_ID);
        outputCustomer.setFirstName("Jack");
        outputCustomer.setLastName("Flash");
        outputCustomer.setEmail("jflash@coolmail.net");
        outputCustomer.setMobile("9998887765");
        outputCustomer.setPassword("secretpass");

        customerList = Arrays.asList(outputCustomer);

        inputCustomerJsonString = objectMapper.writeValueAsString(inputCustomer);
        outputCustomerJsonString = objectMapper.writeValueAsString(outputCustomer);
        outputCustomerListJsonString = objectMapper.writeValueAsString(customerList);

        when(customerService.findAllCustomers()).thenReturn(customerList);
        when(customerService.createCustomer(inputCustomer)).thenReturn(outputCustomer);
        when(customerService.getCustomerById(CUSTOMER_ID)).thenReturn(outputCustomer);
    }

    @Test
    public void shouldGetAllCustomers() throws Exception {
        mockMvc.perform(get("/customer"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]").isNotEmpty())
                .andExpect(content().json(outputCustomerListJsonString));
    }
}
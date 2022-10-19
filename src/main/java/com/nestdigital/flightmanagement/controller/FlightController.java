package com.nestdigital.flightmanagement.controller;

import com.nestdigital.flightmanagement.dao.FlightDao;
import com.nestdigital.flightmanagement.model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {
    @Autowired
    private FlightDao dao;




    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addFlight",consumes = "application/json",produces = "application/json")
    public String flight(@RequestBody FlightModel flight){
        System.out.println(flight.toString());
        dao.save(flight);


        return "(status:'success')";
    }
    @CrossOrigin(origins ="*")
    @GetMapping("/viewFlight")
    public List<FlightModel> viewFlight(){
        return (List<FlightModel>)dao.findAll();
    }
}

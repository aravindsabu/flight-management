package com.nestdigital.flightmanagement.dao;

import com.nestdigital.flightmanagement.model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
}

package com.profdev.barista.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.profdev.barista.models.OrderProcessing;

@Repository
public interface ServicesRepository extends CrudRepository<OrderProcessing,Long>{

	
}

package com.space.repository;

import com.space.model.Ship;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ShipRepo extends PagingAndSortingRepository<Ship, Long>, JpaSpecificationExecutor<Ship> {

}

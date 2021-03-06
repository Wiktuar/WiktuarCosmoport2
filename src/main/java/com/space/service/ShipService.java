package com.space.service;

import com.space.exception.ShipNotFoundException;
import com.space.model.Ship;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface ShipService {
    Page<Ship> getAllShips(Specification<Ship> specification, Pageable sortedByName);
    List<Ship> getAllShips(Specification<Ship> specification);
    Ship createShip(Ship requestShip);
    Ship getShip(Long id);
    Ship editShip(Long id, Ship ship) throws ShipNotFoundException;
    void deleteById(Long id) throws ShipNotFoundException;
    boolean existsById(long id) ;
}

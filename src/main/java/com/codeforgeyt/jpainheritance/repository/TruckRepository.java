package com.codeforgeyt.jpainheritance.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface TruckRepository extends VehicleRepository {
}

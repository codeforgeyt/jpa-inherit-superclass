package com.codeforgeyt.jpainheritance.repository;

import com.codeforgeyt.jpainheritance.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}

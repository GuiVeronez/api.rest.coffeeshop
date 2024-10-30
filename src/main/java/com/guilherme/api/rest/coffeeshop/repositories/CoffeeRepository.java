package com.guilherme.api.rest.coffeeshop.repositories;

import com.guilherme.api.rest.coffeeshop.models.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {}

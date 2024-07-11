package com.movie.movie.repository;

import com.movie.movie.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("select u from Customer u where u.username=:username")
    Optional<Customer> findByUsername(String username);
}

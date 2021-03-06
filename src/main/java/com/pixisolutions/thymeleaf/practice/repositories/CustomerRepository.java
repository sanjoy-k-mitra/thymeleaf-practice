package com.pixisolutions.thymeleaf.practice.repositories;

import com.pixisolutions.thymeleaf.practice.domains.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sanjoy on 9/30/15.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

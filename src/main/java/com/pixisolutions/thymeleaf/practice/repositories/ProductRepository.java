package com.pixisolutions.thymeleaf.practice.repositories;

import com.pixisolutions.thymeleaf.practice.domains.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sanjoy on 9/30/15.
 */
public interface ProductRepository extends CrudRepository<Product, Long>{
}

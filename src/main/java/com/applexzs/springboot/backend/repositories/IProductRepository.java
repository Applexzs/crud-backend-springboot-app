package com.applexzs.springboot.backend.repositories;

import com.applexzs.springboot.backend.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "products")
public interface IProductRepository extends CrudRepository<Product, Long> {
}

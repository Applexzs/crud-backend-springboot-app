package com.applexzs.springboot.backend.repositories;

import com.applexzs.springboot.backend.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(originPatterns = "http://localhost:5173/")
@RepositoryRestResource(path = "products")
public interface IProductRepository extends CrudRepository<Product, Long> {
}

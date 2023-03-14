package com.up.shoping.project.repositories;

import com.up.shoping.project.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}

package com.practise.rest.ProductRepo;


import com.practise.rest.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepos extends JpaRepository<Product,Long> {
}

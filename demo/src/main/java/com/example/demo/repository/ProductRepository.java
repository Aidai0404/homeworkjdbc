package com.example.demo.repository;

import com.example.demo.entity.Product;
import com.example.demo.entity.enums.Brand;
import com.example.demo.entity.enums.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT COUNT(u) FROM Product u WHERE u.brand=:brand and u.color=:color and u.ram=:ram and u.quantityOfSim=:sim and u.price=:price")
    Long Quantity(@Param("brand") Brand brand, @Param("color") Color color, @Param("ram") String ram, @Param("sim") Long sim, @Param("price") int price);

    @Query("SELECT currPrice FROM Product currPrice WHERE currPrice.price=:price-currPrice.price*(currPrice.discount.percent*100)")
    Integer discountedPrice(@Param("price") int price);
}
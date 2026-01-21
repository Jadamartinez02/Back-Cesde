package com.pangea.pangea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pangea.pangea.models.Product;

public interface IProduct extends JpaRepository<Product, Integer> {

}

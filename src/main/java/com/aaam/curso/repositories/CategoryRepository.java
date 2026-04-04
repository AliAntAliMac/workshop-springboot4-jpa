package com.aaam.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aaam.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}

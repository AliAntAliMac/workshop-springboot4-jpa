package com.aaam.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aaam.curso.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}

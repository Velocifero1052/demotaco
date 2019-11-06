package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long>{
}

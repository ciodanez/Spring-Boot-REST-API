package com.example.api_rest.repositories;

import com.example.api_rest.models.Servicio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends CrudRepository<Servicio, Integer>{}

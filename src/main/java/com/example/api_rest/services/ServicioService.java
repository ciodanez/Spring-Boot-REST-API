package com.example.api_rest.services;

import com.example.api_rest.models.Servicio;
import com.example.api_rest.repositories.ServicioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioService {

    @Autowired
    ServicioRepository servicioRepo;

    public ArrayList<Servicio> obtenerServicios() {
        return (ArrayList<Servicio>) servicioRepo.findAll();
    }
    
    public Optional<Servicio> obtenerServicio(int id) {
        return servicioRepo.findById(id);
    }

    public Servicio guardarServicio(Servicio servicio) {
        return servicioRepo.save(servicio);
    }
    
    public void eliminarServicio(int id) {
        servicioRepo.deleteById(id);
    }
    
    public Servicio modificarServicio(Servicio servicio) {
        return servicioRepo.save(servicio);
    }
}

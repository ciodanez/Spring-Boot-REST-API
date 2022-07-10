package com.example.api_rest.controllers;


import com.example.api_rest.models.Servicio;
import com.example.api_rest.services.ServicioService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/servicio")
public class ServicioController {

    @Autowired
    ServicioService muertoServ;

    @GetMapping("/")
    public ArrayList<Servicio> obtener() {
        return muertoServ.obtenerServicios();
    }

    @PostMapping("/")
    public Servicio guardar(@RequestBody Servicio servicio) {
        return muertoServ.guardarServicio(servicio);
    }
}

package com.barbershop.barbermanager.controller;

import com.barbershop.barbermanager.barber.Barber;
import com.barbershop.barbermanager.barber.BarberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("barber")
public class BarberController {

    private final BarberRepository barberRepository;

    /**
     * Creates the controller with required dependencies.
     * @param barberRepository Repository used to read barbers from database.
     */
    public BarberController(BarberRepository barberRepository) {
        this.barberRepository = barberRepository;
    }

    /**
     * Returns all registered barbers.
     */
    @GetMapping
    public List<Barber> getAllBarbers() {
        return barberRepository.findAll();
    }


    /**
     * Returns a barber by id.
     * @param id Barber identifier.
     */
    @GetMapping("/{id}")
    public Barber getBarberById(@PathVariable Long id) {
        return barberRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Barber not found"));
    }
}

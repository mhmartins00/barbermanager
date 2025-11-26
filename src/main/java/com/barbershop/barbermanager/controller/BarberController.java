package com.barbershop.barbermanager.controller;

import com.barbershop.barbermanager.barber.Barber;
import com.barbershop.barbermanager.barber.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("barber")
public class BarberController {

    @Autowired
    private BarberRepository barberRepository;
    @GetMapping
    public List<Barber> getAllBarbers() {
        List<Barber> barbers = barberRepository.findAll();
        return barbers;
    }
}

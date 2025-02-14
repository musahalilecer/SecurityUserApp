package com.musahalilecer.securityuserapp.controller;

import com.musahalilecer.securityuserapp.model.Personal;
import com.musahalilecer.securityuserapp.repository.PersonalRepository;
import com.musahalilecer.securityuserapp.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personals")
public class PersonalController {

    @Autowired
    private PersonalRepository personalRepository;

    @GetMapping
    public List<Personal> getAllPersonals() {
        return personalRepository.findAll();
    }

    @PostMapping
    public Personal createPersonal(@RequestBody Personal personal) {
        return personalRepository.save(personal);
    }

    @GetMapping("/{id}")
    public Personal getPersonalById(@PathVariable int id) {
        return personalRepository.findById(id).orElse(null);
    }
/*
    @PutMapping("/{id}")
    public Personal updatePersonal(@PathVariable int id, @RequestBody Personal personal) {
        Personal existingPersonal = personalRepository.findById(id).orElse(null);
        if (existingPersonal != null) {
            existingPersonal.setUsername(personal.getUsername());
            existingPersonal.setPassword(personal.getPassword());
            return personalRepository.save(existingPersonal);
        }
        return null;
    }

 */

    @DeleteMapping("/{id}")
    public void deletePersonal(@PathVariable int id) {
        personalRepository.deleteById(id);
    }
}

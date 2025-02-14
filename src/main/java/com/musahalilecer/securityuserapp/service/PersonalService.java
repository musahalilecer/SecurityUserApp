package com.musahalilecer.securityuserapp.service;

import com.musahalilecer.securityuserapp.model.Personal;
import com.musahalilecer.securityuserapp.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalService {
    @Autowired
    private PersonalRepository personalRepository;
    public List<Personal> getAllPersonal() {
        return personalRepository.findAll();
    }
    public Personal getPersonalById(int id) {
        return personalRepository.findById(id).get();
    }
    public Personal addPersonal(Personal personal) {
        return personalRepository.save(personal);
    }
 /*   public Personal updatePersonal(Personal personal) {
        Personal newPersonal = personalRepository.findById(personal.getId()).get();
        return personalRepository.save(newPersonal);
    }

  */
    public void deletePersonal(int id) {
        personalRepository.deleteById(id);
    }
}

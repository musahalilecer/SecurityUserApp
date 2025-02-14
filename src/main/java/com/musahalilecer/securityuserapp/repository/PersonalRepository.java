package com.musahalilecer.securityuserapp.repository;

import com.musahalilecer.securityuserapp.model.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Integer> {

}

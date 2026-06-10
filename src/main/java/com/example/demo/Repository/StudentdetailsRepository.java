package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Studentdetails;

@Repository
public interface StudentdetailsRepository extends JpaRepository<Studentdetails, Long> {

}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Hackathon;

public interface HackRepository extends JpaRepository<Hackathon,Integer> {

}

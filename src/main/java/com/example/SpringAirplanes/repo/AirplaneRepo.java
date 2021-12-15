package com.example.SpringAirplanes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringAirplanes.domain.Airplane;

public interface AirplaneRepo extends JpaRepository<Airplane, Long>{

}

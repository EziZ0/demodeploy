package com.springboot.Sprinboot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PixelPerfects extends JpaRepository<com.springboot.Sprinboot.Model.PixelPerfects, Long> {
}

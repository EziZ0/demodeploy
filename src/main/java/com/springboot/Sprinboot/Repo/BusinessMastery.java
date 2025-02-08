package com.springboot.Sprinboot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessMastery extends JpaRepository<com.springboot.Sprinboot.Model.BusinessMastery, Long> {
}

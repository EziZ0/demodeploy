package com.springboot.Sprinboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Model {

    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String name;

}

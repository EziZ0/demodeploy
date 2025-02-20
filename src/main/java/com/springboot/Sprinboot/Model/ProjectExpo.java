package com.springboot.Sprinboot.Model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectExpo {

    @Id
    private Long id;


    @Column(name = "participant_name", nullable = false)
    private String participantName;

    @Column(name = "year", nullable = false)
    private String year;

    @Column(name = "college", nullable = false)
    private String college;

    @Column(name = "email" ,nullable = false)
    private String email;

    @Column(name = "participants_count", nullable = false)
    private int participantsCount;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
}


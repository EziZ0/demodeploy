package com.springboot.Sprinboot;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_name", nullable = false)
    private String eventName;

    @Column(name = "participant_name", nullable = false)
    private String participantName;

    @Column(name = "year", nullable = false)
    private String year;

    @Column(name = "college", nullable = false)
    private String college;

    @Column(name = "participants_count", nullable = false)
    private int participantsCount;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
}

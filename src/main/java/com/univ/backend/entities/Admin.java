package com.univ.backend.entities;

import jakarta.persistence.*;

@Entity
public class Admin {

    @Id
    @SequenceGenerator(name = "admin_id_sequence",
            sequenceName = "admin_id_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "admin_id_sequence")
    public Long id;

    public String name;
}

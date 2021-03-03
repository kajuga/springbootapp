package com.fedorov.springbootapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema ="public", name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
}

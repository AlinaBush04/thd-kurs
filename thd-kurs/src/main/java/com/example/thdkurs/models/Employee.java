package com.example.thdkurs.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.LinkedHashSet;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Full_name")
    private String full_name;

    @ManyToOne
    private Post post;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.REMOVE)
    private Collection<Client> client = new LinkedHashSet<>();
    @OneToMany(mappedBy = "employee", cascade = CascadeType.REMOVE)
    private Collection<Client> commit = new LinkedHashSet<>();
    @OneToMany(mappedBy = "employee", cascade = CascadeType.REMOVE)
    private Collection<Client> pays = new LinkedHashSet<>();

    public Employee(String fullName, Post post) {
        this.full_name = fullName;
        this.post = post;
    }
}


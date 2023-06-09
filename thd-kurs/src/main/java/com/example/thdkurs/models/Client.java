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
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Full_name")
    private String full_name;
    @ManyToOne
    private Employee employee;
    @OneToMany(mappedBy = "client", cascade = CascadeType.REMOVE)
    private Collection<Client> commit = new LinkedHashSet<>();

    public Client (String fullName, Employee employee) {
        this.full_name = fullName;
        this.employee = employee;
    }
}

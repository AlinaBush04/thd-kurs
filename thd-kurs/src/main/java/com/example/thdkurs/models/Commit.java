package com.example.thdkurs.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Commit")
public class Commit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Bonus")
    private Integer bonus;
    @ManyToOne
    private Deal deal;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Client client;
}

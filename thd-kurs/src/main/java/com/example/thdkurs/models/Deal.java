package com.example.thdkurs.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Deal")
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Data")
    private Date data;
    @Column(name = "Profit")
    private Integer profit;
    @OneToMany(mappedBy = "deal", cascade = CascadeType.REMOVE)
    private Collection<Client> commit = new LinkedHashSet<>();
}

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
@Table(name = "Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Bet")
    private Integer bet;
    @OneToMany(mappedBy = "post", cascade = CascadeType.REMOVE)
    private Collection<Client> employee = new LinkedHashSet<>();
    public Post (String name, Integer bet) {
        this.name = name;
        this.bet = bet;
    }
}

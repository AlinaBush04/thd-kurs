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
    @Column(name = "Deal_id")
    private Integer deal_id;
    @Column(name = "Emloyee_id")
    private Integer emloyee_id;
    @Column(name = "Client_id")
    private Integer client_id;
}

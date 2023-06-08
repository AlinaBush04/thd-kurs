package com.example.thdkurs.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Pays")
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Data")
    private Date data;
    @Column(name = "Tax_id")
    private Integer tax_id;
    @Column(name = "Employee_id")
    private Integer employee_id;
}

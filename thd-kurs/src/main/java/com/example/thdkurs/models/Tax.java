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
@Table(name = "Tax")
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Tax_deduction")
    private Integer tax_deduction;
    @OneToMany(mappedBy = "tax", cascade = CascadeType.REMOVE)
    private Collection<Client> pays = new LinkedHashSet<>();
    public Tax (Integer tax_deduction) {
        this.tax_deduction = tax_deduction;
    }
}

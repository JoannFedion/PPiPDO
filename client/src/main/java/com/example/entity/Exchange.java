package com.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "exchange")
@Entity
public class Exchange {

    @Id
    @Column(name = "id_")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "exchange_from")
    private String exchangeFrom;

    @Column(name = "exchange_to")
    private String exchangeTo;

    @Column(name = "exchange_rate")
    private int exchangeRate;
}

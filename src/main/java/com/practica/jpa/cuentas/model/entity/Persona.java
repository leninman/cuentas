package com.practica.jpa.cuentas.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Personas")
public class Persona implements Serializable {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @EmbeddedId
    private PersonaId personaId;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DIRECCION")
    private String direccion;


   @ManyToOne(fetch = FetchType.LAZY)
    private Cuenta cuenta;

}

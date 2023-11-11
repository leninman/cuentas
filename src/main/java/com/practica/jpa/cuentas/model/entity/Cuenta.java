package com.practica.jpa.cuentas.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Cuentas")
public class Cuenta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NUMERO_CUENTA")
    private String numeroCuenta;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cuenta",cascade = CascadeType.ALL)
    private List<Persona> personasId;

    

}

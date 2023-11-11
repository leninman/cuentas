package com.practica.jpa.cuentas.model.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PersonaId implements Serializable{
    private String tipoDocumento;

    private String numerDocumento;

}

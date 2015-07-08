package com.quadrum.nominas2.entidades;
// Generated 26/06/2015 12:29:26 PM by Hibernate Tools 3.6.0

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Banco generated by hbm2java
 */
@Entity
@Table(name = "banco", catalog = "nomifast")
@AllArgsConstructor
@NoArgsConstructor
public @Data  class Banco implements java.io.Serializable {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    
    
    @Column(name = "nombre", nullable = false, length = 37)
    private String nombre;
    
    @Column(name = "razon_social", nullable = false, length = 118)
    private String razonSocial;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "banco")
    private List<InformacionOpcional> informacionOpcionals;

    public Banco(int id, String nombre, String razonSocial) {
        this.id = id;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
    }
}

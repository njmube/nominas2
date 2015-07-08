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
 * RegimenContratacion generated by hbm2java
 */
@Entity
@Table(name = "regimen_contratacion", catalog = "nomifast")
@AllArgsConstructor
@NoArgsConstructor
public @Data  class RegimenContratacion implements java.io.Serializable {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "regimenContratacion")
    private List<Recibo> recibos;

    public RegimenContratacion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

}

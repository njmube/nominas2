package com.quadrum.nominas2.entidades;
// Generated 7/07/2015 11:49:50 AM by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;import lombok.NoArgsConstructor;import lombok.Setter;

/**
 * RolUsuarioId generated by hbm2java
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class RolUsuarioId implements java.io.Serializable {

    @Column(name="rol", nullable=false)
    @Getter @Setter private String rol;
    
    @Column(name = "usuario", nullable = false, length = 50)
    @Getter @Setter private String usuario;

    
}

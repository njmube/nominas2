package com.quadrum.nominas2.entidades;
// Generated 26/06/2015 12:29:26 PM by Hibernate Tools 3.6.0

import static com.quadrum.nominas2.entidades.ExpRegulares.NOMBRES;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;import lombok.Getter;import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Empleado generated by hbm2java
 */
@Entity
@Table(name = "empleado", catalog = "nomifast")
@AllArgsConstructor
@NoArgsConstructor
public class Empleado implements java.io.Serializable {

    @Id
    @Column(name = "curp", unique = true, nullable = false, length = 45)
    @Pattern(message = "Verifique la estructura del CURP",
            regexp = "[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}"
            + "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])"
            + "[HM]{1}"
            + "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)"
            + "[B-DF-HJ-NP-TV-Z]{3}"
            + "[0-9A-Z]{1}[0-9]{1}$")
    @Getter @Setter private String curp;
    
    @Column(name = "rfc", nullable = false, length = 45)
    @Pattern(message = "Verifique la estructura del RFC",
            regexp = "^[A-Z,Ã‘,&]{3,4}[0-9]{2}[0-1][0-9][0-3][0-9][A-Z,0-9]{3}$")
    @Getter @Setter private String rfc;
    
    @Column(name = "nombre", nullable = false, length = 145)
    @Pattern(message = "Los nombres deben ser solo letras",
            regexp = NOMBRES + "145}")
    @Getter @Setter private String nombre;

    @Valid
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario")
    @Getter @Setter private Usuario usuario;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empleado")
    @Getter @Setter private List<Recibo> recibos;

}

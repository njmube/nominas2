package com.quadrum.nominas2.entidades;
// Generated 26/06/2015 12:29:26 PM by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;import lombok.NoArgsConstructor;import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
/**
 * Domicilio generated by hbm2java
 */
@Entity
@Table(name = "domicilio", catalog = "nomifast")
@AllArgsConstructor
@NoArgsConstructor
public  class Domicilio implements java.io.Serializable {

    @Id @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "sucursal"))
    @GeneratedValue(generator = "generator")
    @Column(name = "id", unique = true, nullable = false)
    @Getter @Setter private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    @Getter @Setter private Sucursal sucursal;

    @NotBlank
    @Column(name = "calle", nullable = false, length = 250)
    @Getter @Setter private String calle;

    @NotBlank
    @Column(name = "estado", nullable = false, length = 250)
    @Getter @Setter private String estado;

    @NotBlank
    @Column(name = "municipio", nullable = false, length = 250)
    @Getter @Setter private String municipio;

    @NotBlank
    @Column(name = "pais", nullable = false, length = 250)
    @Getter @Setter private String pais;

    @Pattern(regexp = "[0-9]{5}", message = "Ingrese un CP valido")
    @Column(name = "codigo_postal", nullable = false, length = 5)
    @Getter @Setter private String codigoPostal;

    @Column(name = "num_interior", length = 250)
    @Getter @Setter private String numInterior;

    @Column(name = "num_exterior", length = 250)
    @Getter @Setter private String numExterior;

    @Column(name = "colonia", length = 250)
    @Getter @Setter private String colonia;

    @Column(name = "localidad", length = 250)
    @Getter @Setter private String localidad;

    @Column(name = "referencia", length = 250)
    @Getter @Setter private String referencia;

    public Domicilio(Sucursal sucursal, String calle, String estado, String municipio, String pais, String codigoPostal) {
        this.sucursal = sucursal;
        this.calle = calle;
        this.estado = estado;
        this.municipio = municipio;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
    }

}

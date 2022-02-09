
package com.demo.api2.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity @Table(catalog = "carvajal", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contacto.findAll", query = "SELECT c FROM Contacto c"),
    @NamedQuery(name = "Contacto.findByCodigo", query = "SELECT c FROM Contacto c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Contacto.findByNombre", query = "SELECT c FROM Contacto c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Contacto.findByApellido", query = "SELECT c FROM Contacto c WHERE c.apellido = :apellido")})
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigo;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String apellido;

    public Contacto() {
    }

    public Contacto(Integer codigo) {
        this.codigo = codigo;
    }

    public Contacto(Integer codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Contacto{" +
            "codigo=" + codigo +
            ", nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(codigo, contacto.codigo) && Objects.equals(nombre, contacto.nombre) && Objects.equals(apellido, contacto.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, apellido);
    }
}

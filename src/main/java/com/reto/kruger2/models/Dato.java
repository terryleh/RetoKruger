package com.reto.kruger2.models;

//import jakarta.persistence.*;
import javax.persistence.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "datos", schema = "public")
@PrimaryKeyJoinColumn(name = "idUsuario", foreignKey = @ForeignKey(name = "fk_dato_usuario"))
public class Dato extends Usuario implements Serializable {
    private static final long serialVersionUID = 1l;

    private boolean estado;
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    private String direccion;
    private Integer telefono;
    @Column(name = "tipo_vacuna")
    private String tipoVacuna;
    @Column(name = "fecha_vacunacion")
    private Date fechaVacunacion;
    private Integer dosis;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public Date getFechaVacunacion() {
        return fechaVacunacion;
    }

    public void setFechaVacunacion(Date fechaVacunacion) {
        this.fechaVacunacion = fechaVacunacion;
    }

    public Integer getDosis() {
        return dosis;
    }

    public void setDosis(Integer dosis) {
        this.dosis = dosis;
    }

}

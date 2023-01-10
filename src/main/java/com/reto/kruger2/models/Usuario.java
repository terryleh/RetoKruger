package com.reto.kruger2.models;


//import jakarta.persistence.*;

import com.sun.istack.NotNull;
import jakarta.validation.constraints.Pattern;
import org.aspectj.bridge.Message;



import javax.persistence.*;


@Entity
@Table(name = "usuarios", schema = "public")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @NotNull()
    @Column( nullable = false)
    private String password;
    @Column( nullable = false)
    private String rol;
    @NotNull()
    @Pattern(regexp = "[0-9]{10}+$", message = "Es obligatorio que la cedula contenga 10 digitos")
    @Column(length = 10, nullable = false,unique = true)
    private Integer cedula;

    @NotNull
    @Pattern(regexp = "[A-Za-z ]+$", message = "Es nombre del usuario solo debe contener letras")
    @Column( nullable = false)
    private String nombre;

    @NotNull
    @Pattern(regexp = "[A-Za-z ]+$", message = "El apellido del usuario solo puede contener letras")
    @Column( nullable = false)
    private String apellido;

    @Pattern(regexp = "(([^<>()\\[\\]\\\\.,;:\\s@”]+(\\.[^<>()\\[\\]\\\\.,;:\\s@”]+)*)|(“.+”))@((\\[[0–9]{1,3}\\.[0–9]{1,3}\\.[0–9]{1,3}\\.[0–9]{1,3}])|(([a-zA-Z\\-0–9]+\\.)+[a-zA-Z]{2,}))$", message = "Se debe cumplir con el formato estandar de correo electronico")
    @Column( nullable = false)
    private String correo;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.List;
import jakarta.persistence.*;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

/**
 * 
 * @author Gael
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "usuario", nullable = false, length = 100)
    private String usuario;
    
    @Column(name = "email", nullable = false, length = 100, unique= true)
    private String email;
    
    @Column(name = "contraseña", nullable = false, length = 100)
    private String contraseña;
    
    @Column(name = "celular", nullable = false, length = 15)
    private String celular;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", nullable = false)
    private Sexo sexo;
    
    @Column(name = "edad", nullable = false, length = 20)
    private int edad;
    
    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private GregorianCalendar fechaNacimiento;
    
    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "usuario")
    private List<Publicacion> publicaciones;
    
    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "usuario")
    private List<Comentario> comentarios;
    
    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "usuario")
    private List<Mensaje> mensajesRecibidos;
    
    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "usuario")
    private List<Mensaje> mensajesEnviados;
    
    public Usuario() {
    }

    public Usuario(Long id, String usuario, String email, String contraseña, String celular, Sexo sexo, int edad, GregorianCalendar fechaNacimiento) {
        this.id = id;
        this.usuario = usuario;
        this.email = email;
        this.contraseña = contraseña;
        this.celular = celular;
        this.sexo = sexo;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario(String email, String contraseña) {
        this.email = email;
        this.contraseña = contraseña;
    }
    
    public Usuario(String usuario, String email, String contraseña, String celular, Sexo sexo, int edad, GregorianCalendar fechaNacimiento) {
        this.usuario = usuario;
        this.email = email;
        this.contraseña = contraseña;
        this.celular = celular;
        this.sexo = sexo;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario(Long id, String usuario, String email, String contraseña, String celular, Sexo sexo, int edad, GregorianCalendar fechaNacimiento, List<Publicacion> publicaciones, List<Comentario> comentarios, List<Mensaje> mensajesRecibidos, List<Mensaje> mensajesEnviados) {
        this.id = id;
        this.usuario = usuario;
        this.email = email;
        this.contraseña = contraseña;
        this.celular = celular;
        this.sexo = sexo;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.publicaciones = publicaciones;
        this.comentarios = comentarios;
        this.mensajesRecibidos = mensajesRecibidos;
        this.mensajesEnviados = mensajesEnviados;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Mensaje> getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public void setMensajesRecibidos(List<Mensaje> mensajesRecibidos) {
        this.mensajesRecibidos = mensajesRecibidos;
    }

    public List<Mensaje> getMensajesEnviados() {
        return mensajesEnviados;
    }

    public void setMensajesEnviados(List<Mensaje> mensajesEnviados) {
        this.mensajesEnviados = mensajesEnviados;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + ", " + usuario + ", " + email + ", " + contraseña + ", c" + celular + ", " + sexo + ", " + edad + ", " + fechaNacimiento;
    }
    
}

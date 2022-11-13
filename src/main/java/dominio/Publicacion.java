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
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

/**
 *
 * @author Gael
 */
@Entity
@Table(name = "publicaciones")
public class Publicacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private GregorianCalendar fechaCreacion;
    
    @ManyToOne
    @JoinColumn(name="id_usuario", nullable=false)
    private Usuario usuario;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_contenido", nullable=false)
    private Contenido contenido;
    
    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "publicacion")
    private List<Comentario> comentarios;

    public Publicacion() {
    }

    public Publicacion(GregorianCalendar fechaCreacion, Usuario usuario, Contenido contenido) {
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
        this.contenido = contenido;
    }

    public Publicacion(Long id, GregorianCalendar fechaCreacion, Usuario usuario, Contenido contenido) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
        this.contenido = contenido;
    }

    public Publicacion(Long id, GregorianCalendar fechaCreacion, Usuario usuario, Contenido contenido, List<Comentario> comentarios) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
        this.contenido = contenido;
        this.comentarios = comentarios;
    }
    
    public GregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(GregorianCalendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
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
        if (!(object instanceof Publicacion)) {
            return false;
        }
        Publicacion other = (Publicacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Publicacion[ id=" + id + " ]";
    }
    
}

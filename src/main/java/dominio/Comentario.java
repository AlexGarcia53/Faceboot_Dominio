/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gael
 */
@Entity
@Table(name = "comentarios")
public class Comentario implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "fecha_creacion", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private GregorianCalendar fechaCreacion;
    
    @ManyToOne
    @JoinColumn(name="id_publicacion", nullable=true)
    private Publicacion publicacion;
    
    @ManyToOne
    @JoinColumn(name="id_usuario", nullable=true)
    private Usuario usuario;
    
    @OneToOne
    @JoinColumn(name="id_contenido", nullable=true)
    private Contenido contenido;

    public Comentario() {
    }
    
    public Comentario(GregorianCalendar fechaCreacion, Publicacion publicacion, Usuario usuario, Contenido contenido) {
        this.fechaCreacion = fechaCreacion;
        this.publicacion = publicacion;
        this.usuario = usuario;
        this.contenido = contenido;
    }

    public Comentario(Long id, GregorianCalendar fechaCreacion, Publicacion publicacion, Usuario usuario, Contenido contenido) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.publicacion = publicacion;
        this.usuario = usuario;
        this.contenido = contenido;
    }

    public GregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(GregorianCalendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
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
        if (!(object instanceof Comentario)) {
            return false;
        }
        Comentario other = (Comentario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Comentario[ id=" + id + " ]";
    }
    
}

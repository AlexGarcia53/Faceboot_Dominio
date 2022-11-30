/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.GregorianCalendar;
import jakarta.persistence.*;

/**
 * Clase que representa a la entidad de comentario.
 *
 * @author Sotelo Juan, García Alex, Tellez Jarol
 */
@Entity
@Table(name = "comentarios")
public class Comentario implements Serializable {

    /**
     * Identificador único para el comentario.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * Fecha de creación del comentario.
     */
    @Column(name = "fecha_creacion", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private GregorianCalendar fechaCreacion;
    /**
     * Publicación con la que se relaciona el comentario.
     */
    @ManyToOne
    @JoinColumn(name = "id_publicacion", nullable = true)
    private Publicacion publicacion;
    /**
     * Usuario con el que se relaciona el comentario.
     */
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = true)
    private Usuario usuario;
    /**
     * Contenido con el que se relaciona el comentario.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contenido", nullable = false)
    private Contenido contenido;

    /**
     * Constructor vacío.
     */
    public Comentario() {
    }

    /**
     * Constructor que inicializa los atributos de fecha, publicacion, usuario y
     * comentario.
     *
     * @param fechaCreacion Fecha de creación del comentario.
     * @param publicacion Publicación con la que se relaciona el comentario.
     * @param usuario Usuario con el que se relaciona el comentario.
     * @param contenido Contenido con el que se relaciona el comentario.
     */
    public Comentario(GregorianCalendar fechaCreacion, Publicacion publicacion, Usuario usuario, Contenido contenido) {
        this.fechaCreacion = fechaCreacion;
        this.publicacion = publicacion;
        this.usuario = usuario;
        this.contenido = contenido;
    }

    /**
     * Constructor que inicializa los atributos de id, fecha, publicación,
     * usuario y contenido.
     *
     * @param id Identificador único para el comentario.
     * @param fechaCreacion Fecha de creación del comentario.
     * @param publicacion Publicación con la que se relaciona el comentario.
     * @param usuario Usuario con el que se relaciona el comentario.
     * @param contenido Contenido con el que se relaciona el comentario.
     */
    public Comentario(Long id, GregorianCalendar fechaCreacion, Publicacion publicacion, Usuario usuario, Contenido contenido) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.publicacion = publicacion;
        this.usuario = usuario;
        this.contenido = contenido;
    }

    /**
     * Método para obtener la fecha de creación.
     *
     * @return Fecha de creación del comentario.
     */
    public GregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Método para establecer la fecha de creación.
     *
     * @param fechaCreacion Fecha de creación del comentario.
     */
    public void setFechaCreacion(GregorianCalendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Método para obtener la publicación.
     *
     * @return Publicación con la que se relaciona el comentario.
     */
    public Publicacion getPublicacion() {
        return publicacion;
    }

    /**
     * Método para establecer la publicación.
     *
     * @param publicacion Publicación con la que se relaciona el comentario.
     */
    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    /**
     * Método para obtener el usuario.
     *
     * @return Usuario con el que se relaciona el comentario.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Método para establecer el usuario.
     *
     * @param usuario Usuario con el que se relaciona el comentario.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Método para obtener el contenido.
     *
     * @return Contenido con el que se relaciona el comentario.
     */
    public Contenido getContenido() {
        return contenido;
    }

    /**
     * Método para establecer el contenido.
     *
     * @param contenido Contenido con el que se relaciona el comentario.
     */
    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    /**
     * Método para obtener el id.
     *
     * @return Identificador único para el comentario.
     */
    public Long getId() {
        return id;
    }

    /**
     * Método para establecer el id.
     *
     * @param id Identificador único para el comentario.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método que regresa el código hash.
     *
     * @return hashCode.
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Método equals para encontrar Identificadores coincidentes.
     *
     * @param object Objeto a comparar.
     * @return verdadero si los id son iguales, falso en caso contrario.
     */
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

    /**
     * Método para obtener los atributos.
     *
     * @return Cadena de texto con los atributos de la entidad.
     */
    @Override
    public String toString() {
        return "dominio.Comentario[ id=" + id + " ]";
    }

}

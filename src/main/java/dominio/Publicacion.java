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
import java.util.List;
import jakarta.persistence.*;

/**
 * Clase que representa a la entidad de publicación.
 *
 * @author Sotelo Juan, García Alex, Tellez Jarol
 */
@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "publicaciones")
public class Publicacion implements Serializable {

    /**
     * Identidicador único para la publicación.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    /**
     * Fecha de creación de la publicación.
     */
    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private GregorianCalendar fechaCreacion;
    /**
     * Usuario con el que se relaciona la publicación.
     */
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;
    /**
     * Contenido con el que se relaciona la publicación.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contenido", nullable = false)
    private Contenido contenido;
    /**
     * Lista de comentarios que tiene la publicación.
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "publicacion", fetch = FetchType.EAGER)
    private List<Comentario> comentarios;

    /**
     * Constructor vacío.
     */
    public Publicacion() {
    }

    /**
     * Constructor que inicializa el atributo de contenido.
     *
     * @param contenido Contenido con el que se relaciona la publicación.
     */
    public Publicacion(Contenido contenido) {
        this.contenido = contenido;
    }

    /**
     * Constructor que inicializa los atributos de fecha, usuario y contenido.
     *
     * @param fechaCreacion Fecha de creación de la publicación.
     * @param usuario Usuario con el que se relaciona la publicación.
     * @param contenido Contenido con el que se relaciona la publicación.
     */
    public Publicacion(GregorianCalendar fechaCreacion, Usuario usuario, Contenido contenido) {
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
        this.contenido = contenido;
    }

    /**
     * Constructor que inicializa los atributos de id, fecha, usuario y
     * contenido.
     *
     * @param id Identidicador único para la publicación.
     * @param fechaCreacion Fecha de creación de la publicación.
     * @param usuario Usuario con el que se relaciona la publicación.
     * @param contenido Contenido con el que se relaciona la publicación.
     */
    public Publicacion(Long id, GregorianCalendar fechaCreacion, Usuario usuario, Contenido contenido) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
        this.contenido = contenido;
    }

    /**
     * Constructor que inicializa los atributos de id, fecha, usuario, contenido
     * y comentarios.
     *
     * @param id Identidicador único para la publicación.
     * @param fechaCreacion Fecha de creación de la publicación.
     * @param usuario Usuario con el que se relaciona la publicación.
     * @param contenido Contenido con el que se relaciona la publicación.
     * @param comentarios Lista de comentarios que tiene la publicación.
     */
    public Publicacion(Long id, GregorianCalendar fechaCreacion, Usuario usuario, Contenido contenido, List<Comentario> comentarios) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
        this.contenido = contenido;
        this.comentarios = comentarios;
    }

    /**
     * Método para obtener la fecha de creación.
     *
     * @return Fecha de creación de la publicación.
     */
    public GregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Método para establecer la fecha de creación.
     *
     * @param fechaCreacion Fecha de creación de la publicación.
     */
    public void setFechaCreacion(GregorianCalendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Método para obtener al usuario.
     *
     * @return Usuario con el que se relaciona la publicación.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Método para establecer al usuario.
     *
     * @param usuario Usuario con el que se relaciona la publicación.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Método para obtener el contenido.
     *
     * @return Contenido con el que se relaciona la publicación.
     */
    public Contenido getContenido() {
        return contenido;
    }

    /**
     * Método para establecer el contenido.
     *
     * @param contenido Contenido con el que se relaciona la publicación.
     */
    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    /**
     * Método para obtener los comentarios.
     *
     * @return Lista de comentarios que tiene la publicación.
     */
    public List<Comentario> getComentarios() {
        return comentarios;
    }

    /**
     * Método para establecer los comentarios.
     *
     * @param comentarios Lista de comentarios que tiene la publicación.
     */
    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    public void agregarComentario(Comentario comentario){
        this.comentarios.add(comentario);
    }
    
    public void eliminarComentario(Comentario comentario){
        this.comentarios.remove(comentario);
    }

    /**
     * Método para obtener el id.
     *
     * @return Identidicador único para la publicación.
     */
    public Long getId() {
        return id;
    }

    /**
     * Método para establecer el id.
     *
     * @param id Identidicador único para la publicación.
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
        if (!(object instanceof Publicacion)) {
            return false;
        }
        Publicacion other = (Publicacion) object;
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
        return "dominio.Publicacion[ id=" + id + " ]";
    }

}

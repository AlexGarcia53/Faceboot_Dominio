/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * Clase que representa a la entidad de hashtag.
 *
 * @author Sotelo Juan, García Alex, Tellez Jarol
 */
@Entity
@Table(name = "hashtags")
public class Hashtag implements Serializable {

    /**
     * Identificador único para el hashtag.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * Nombre del hashtag.
     */
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    /**
     * Contenido con el que se relaciona el hashtag.
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contenido")
    private Contenido contenido;

    /**
     * Constructor vacío.
     */
    public Hashtag() {
    }

    public Hashtag(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa los atributos de nombre y contenido.
     *
     * @param nombre Nombre del hashtag.
     * @param contenido Contenido con el que se relaciona el hashtag.
     */
    public Hashtag(String nombre, Contenido contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    /**
     * Constructor que inicializa los atributos de id, nombre y contenido.
     *
     * @param id Identificador único para el hashtag.
     * @param nombre Nombre del hashtag.
     * @param contenido Contenido con el que se relaciona el hashtag.
     */
    public Hashtag(Long id, String nombre, Contenido contenido) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
    }

    /**
     * Método para obtener el nombre.
     *
     * @return Nombre del hashtag.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre.
     *
     * @param nombre Nombre del hashtag.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el contenido.
     *
     * @return Contenido con el que se relaciona el hashtag.
     */
    public Contenido getContenido() {
        return contenido;
    }

    /**
     * Método para establecer el contenido.
     *
     * @param contenido Contenido con el que se relaciona el hashtag.
     */
    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    /**
     * Método para obtener el id.
     *
     * @return Identificador único para el hashtag.
     */
    public Long getId() {
        return id;
    }

    /**
     * Método para establecer el id.
     *
     * @param id Identificador único para el hashtag.
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
        if (!(object instanceof Hashtag)) {
            return false;
        }
        Hashtag other = (Hashtag) object;
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
        return "dominio.Hashtag[ id=" + id + " ]";
    }

}

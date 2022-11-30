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
import java.util.List;
import jakarta.persistence.*;

/**
 * Clase que representa a la entidad de contenido.
 *
 * @author Sotelo Juan, García Alex, Tellez Jarol
 */
@Entity
@Table(name = "contenidos")
public class Contenido implements Serializable {

    /**
     * Identificador único para el contenido.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * Texto plano que tiene el contenido.
     */
    @Column(name = "texto_plano", nullable = false, length = 500)
    private String textoPlano;
    /**
     * Imagen que tiene el contenido.
     */
//    @Lob
    @Column(name = "imagen", nullable = true)
    private String imagen;
    /**
     * Lista de hashtags del contenido.
     */
    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "contenido", fetch = FetchType.EAGER)
    private List<Hashtag> hashtags;

    /**
     * Constructor vacío.
     */
    public Contenido() {
    }

    /**
     * Constructor que inicializa el atributo de texto plano.
     *
     * @param textoPlano Texto plano que tiene el contenido.
     */
    public Contenido(String textoPlano) {
        this.textoPlano = textoPlano;
    }

    /**
     * Constructor que inicializa los atributos de texto e imagen.
     *
     * @param textoPlano Texto plano que tiene el contenido.
     * @param imagen Imagen que tiene el contenido.
     */
    public Contenido(String textoPlano, String imagen) {
        this.textoPlano = textoPlano;
        this.imagen = imagen;
    }

    /**
     * Constructor que inicializa los atributos de texto, imagen y hashtags.
     *
     * @param textoPlano Texto plano que tiene el contenido.
     * @param imagen Imagen que tiene el contenido.
     * @param hashtags Lista de hashtags del contenido.
     */
    public Contenido(String textoPlano, String imagen, List<Hashtag> hashtags) {
        this.textoPlano = textoPlano;
        this.imagen = imagen;
        this.hashtags = hashtags;
    }

    /**
     * Constructor que inicializa los atributos de id, texto, imange y hashtag.
     *
     * @param id Identificador único para el contenido.
     * @param textoPlano Texto plano que tiene el contenido.
     * @param imagen Imagen que tiene el contenido.
     * @param hashtags Lista de hashtags del contenido.
     */
    public Contenido(Long id, String textoPlano, String imagen, List<Hashtag> hashtags) {
        this.id = id;
        this.textoPlano = textoPlano;
        this.imagen = imagen;
        this.hashtags = hashtags;
    }

    /**
     * Método para obtener el texto.
     *
     * @return Texto plano que tiene el contenido.
     */
    public String getTextoPlano() {
        return textoPlano;
    }

    /**
     * Método para establecer el texto.
     *
     * @param textoPlano Texto plano que tiene el contenido.
     */
    public void setTextoPlano(String textoPlano) {
        this.textoPlano = textoPlano;
    }

    /**
     * Método para obtener la imagen.
     *
     * @return Imagen que tiene el contenido.
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Método para establecer la imagen.
     *
     * @param imagen Imagen que tiene el contenido.
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Método para obtener los hashtags.
     *
     * @return Lista de hashtags del contenido.
     */
    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    /**
     * Método para establecer los hashtags.
     *
     * @param hashtags Lista de hashtags del contenido.
     */
    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    /**
     * Método para obtener el identificador único.
     *
     * @return Identificador único para el contenido.
     */
    public Long getId() {
        return id;
    }

    /**
     * Método para establecer el identificador único.
     *
     * @param id Identificador único para el contenido.
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
        if (!(object instanceof Contenido)) {
            return false;
        }
        Contenido other = (Contenido) object;
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
        return "dominio.Contenido[ id=" + id + " ]";
    }

}

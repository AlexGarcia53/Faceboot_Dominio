/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * Clase que representa a la entidad de mensaje.
 *
 * @author Sotelo Juan, García Alex, Tellez Jarol
 */
@Entity
@Table(name = "mensajes")
public class Mensaje implements Serializable {

    /**
     * Identidicador único para el comentario.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * Texto plano que tiene el mensaje.
     */
    @Column(name = "texto_plano", nullable = false, length = 500)
    private String textoPlano;
    /**
     * Usuario con el que se relaciona el mensaje.
     */
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;
    /**
     * Usuario al que se le envia el mensaje.
     */
    @ManyToOne
    @JoinColumn(name = "id_receptor", nullable = false)
    private Usuario receptor;

    /**
     * Constructor vacío.
     */
    public Mensaje() {
    }

    /**
     * Constructor que inicializa los atributos de texto, usuario y receptor.
     *
     * @param textoPlano Texto plano que tiene el mensaje.
     * @param usuario Usuario con el que se relaciona el mensaje.
     * @param receptor Usuario al que se le envia el mensaje.
     */
    public Mensaje(String textoPlano, Usuario usuario, Usuario receptor) {
        this.textoPlano = textoPlano;
        this.usuario = usuario;
        this.receptor = receptor;
    }

    /**
     * Constructor que inicializa los atributos de id, texto, usuario y
     * receptor.
     *
     * @param id Identidicador único para el comentario.
     * @param textoPlano Texto plano que tiene el mensaje.
     * @param usuario Usuario con el que se relaciona el mensaje.
     * @param receptor Usuario al que se le envia el mensaje.
     */
    public Mensaje(Long id, String textoPlano, Usuario usuario, Usuario receptor) {
        this.id = id;
        this.textoPlano = textoPlano;
        this.usuario = usuario;
        this.receptor = receptor;
    }

    /**
     * Método para obtener el texto.
     *
     * @return Texto plano que tiene el mensaje.
     */
    public String getTextoPlano() {
        return textoPlano;
    }

    /**
     * Método para establecer el texto.
     *
     * @param textoPlano Texto plano que tiene el mensaje.
     */
    public void setTextoPlano(String textoPlano) {
        this.textoPlano = textoPlano;
    }

    /**
     * Método para obtener el usuario.
     *
     * @return Usuario con el que se relaciona el mensaje.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Método para establecer el usuario.
     *
     * @param usuario Usuario con el que se relaciona el mensaje.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Método para obtener el receptor.
     *
     * @return Usuario al que se le envia el mensaje.
     */
    public Usuario getReceptor() {
        return receptor;
    }

    /**
     * Método para establecer el receptor.
     *
     * @param receptor Usuario al que se le envia el mensaje.
     */
    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    /**
     * Método para obtener el id.
     *
     * @return Identidicador único para el comentario.
     */
    public Long getId() {
        return id;
    }

    /**
     * Método para establecer el id.
     *
     * @param id Identidicador único para el comentario.
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
        if (!(object instanceof Mensaje)) {
            return false;
        }
        Mensaje other = (Mensaje) object;
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
        return "dominio.Mensaje[ id=" + id + " ]";
    }

}

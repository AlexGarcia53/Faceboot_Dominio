/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Lob;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;

/**
 *
 * @author Gael
 */
@Entity
@Table(name = "contenidos")
public class Contenido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "texto_plano", nullable = false, length = 500)
    private String textoPlano;
    
    @Lob
    @Column(name = "imagen", nullable = true)
    private byte[] imagen;
    
    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "contenido")
    private List<Hashtag> hashtags;

    public Contenido() {
    }

    public Contenido(String textoPlano) {
        this.textoPlano = textoPlano;
    }
    
    public Contenido(String textoPlano, byte[] imagen, List<Hashtag> hashtags) {
        this.textoPlano = textoPlano;
        this.imagen = imagen;
        this.hashtags = hashtags;
    }

    public Contenido(Long id, String textoPlano, byte[] imagen, List<Hashtag> hashtags) {
        this.id = id;
        this.textoPlano = textoPlano;
        this.imagen = imagen;
        this.hashtags = hashtags;
    }

    public String getTextoPlano() {
        return textoPlano;
    }

    public void setTextoPlano(String textoPlano) {
        this.textoPlano = textoPlano;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
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
        if (!(object instanceof Contenido)) {
            return false;
        }
        Contenido other = (Contenido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Contenido[ id=" + id + " ]";
    }
    
}

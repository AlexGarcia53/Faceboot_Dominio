/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import jakarta.persistence.*;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;

/**
 *
 * @author Gael
 */
@Entity
@Table(name = "mensajes")
public class Mensaje implements Serializable {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "texto_plano", nullable = false, length = 500)
    private String textoPlano;
    
    @ManyToOne
    @JoinColumn(name="id_usuario", nullable=false)
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name="id_receptor", nullable=false)
    private Usuario receptor;

    public Mensaje() {
    }

    public Mensaje(String textoPlano, Usuario usuario, Usuario receptor) {
        this.textoPlano = textoPlano;
        this.usuario = usuario;
        this.receptor = receptor;
    }

    public Mensaje(Long id, String textoPlano, Usuario usuario, Usuario receptor) {
        this.id = id;
        this.textoPlano = textoPlano;
        this.usuario = usuario;
        this.receptor = receptor;
    }

    public String getTextoPlano() {
        return textoPlano;
    }

    public void setTextoPlano(String textoPlano) {
        this.textoPlano = textoPlano;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
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
        if (!(object instanceof Mensaje)) {
            return false;
        }
        Mensaje other = (Mensaje) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Mensaje[ id=" + id + " ]";
    }
    
}

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

/**
 * Clase que representa a la entidad de usuario.
 *
 * @author Equipo broker
 */
@Entity
@Table(name = "usuarios")
public class Usuario {

    /**
     * Identidicador único para el usuario.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * Nombre que tiene el usuario.
     */
    @Column(name = "usuario", nullable = false, length = 100)
    private String usuario;
    /**
     * Correo que tiene el usuario.
     */
    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;
    /**
     * Contraseña que tiene el usuario.
     */
    @Column(name = "contrasenia", length = 100)
    private String contrasenia;
    /**
     * Celular que tiene el usuario.
     */
    @Column(name = "celular", length = 15)
    private String celular;
    /**
     * Sexo que tiene el usuario.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    private Sexo sexo;
    /**
     * Identificador externo para el usuario.
     */
    @Column(name = "token", length = 255, unique = true)
    private String token;
    /**
     * Fecha de nacimiento del usuario.
     */
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private GregorianCalendar fechaNacimiento;

    /**
     * Constructor vacío.
     */
    public Usuario() {
    }

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Construtor que inicializa los atributos de id, usuario, email,
     * contraseña, celular, sexo y fecha de nacimiento.
     *
     * @param id Identificador externo para el usuario.
     * @param usuario Nombre que tiene el usuario.
     * @param email Correo que tiene el usuario.
     * @param contrasenia Contraseña que tiene el usuario.
     * @param celular Celular que tiene el usuario.
     * @param sexo Sexo que tiene el usuario.
     * @param fechaNacimiento Fecha de nacimiento del usuario.
     */
    public Usuario(Long id, String usuario, String email, String contrasenia, String celular, Sexo sexo, GregorianCalendar fechaNacimiento) {
        this.id = id;
        this.usuario = usuario;
        this.email = email;
        this.contrasenia = contrasenia;
        this.celular = celular;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Constructor que inicializa los atributos de email y contraseña.
     *
     * @param email Correo que tiene el usuario.
     * @param contrasenia Contraseña que tiene el usuario.
     */
    public Usuario(String email, String contrasenia) {
        this.email = email;
        this.contrasenia = contrasenia;
    }

    /**
     * Constructor que inicializa los atributos de usuario, email, fecha, sexo y
     * token.
     *
     * @param usuario Nombre que tiene el usuario.
     * @param email Correo que tiene el usuario.
     * @param fechaNacimiento Fecha de nacimiento del usuario.
     * @param sexo Sexo que tiene el usuario.
     * @param token Identificador externo para el usuario.
     */
    public Usuario(String usuario, String email, GregorianCalendar fechaNacimiento, Sexo sexo, String token) {
        this.usuario = usuario;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.token = token;
    }

    /**
     * Constructor que inicializa los atributos de usuario, email y token.
     *
     * @param usuario Nombre que tiene el usuario.
     * @param email Correo que tiene el usuario.
     * @param token Identificador externo para el usuario.
     */
    public Usuario(String usuario, String email, String token) {
        this.usuario = usuario;
        this.email = email;
        this.token = token;
    }

    /**
     * Constructor que inicializa los atributos de usuario, email, contraseña,
     * celular, sexo y fecha.
     *
     * @param usuario Nombre que tiene el usuario.
     * @param email Correo que tiene el usuario.
     * @param contrasenia Contraseña que tiene el usuario.
     * @param celular Celular que tiene el usuario.
     * @param sexo Sexo que tiene el usuario.
     * @param fechaNacimiento Fecha de nacimiento del usuario.
     */
    public Usuario(String usuario, String email, String contrasenia, String celular, Sexo sexo, GregorianCalendar fechaNacimiento) {
        this.usuario = usuario;
        this.email = email;
        this.contrasenia = contrasenia;
        this.celular = celular;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Constructor que inicializa los atributos de id, usuario, email,
     * contraseña, celular, sexo, fecha, publicaciones, comentarios, mensajes
     * recibidos y mensajes enviados.
     *
     * @param id Identificador externo para el usuario.
     * @param usuario Nombre que tiene el usuario.
     * @param email Correo que tiene el usuario.
     * @param contrasenia Contraseña que tiene el usuario.
     * @param celular Celular que tiene el usuario.
     * @param sexo Sexo que tiene el usuario.
     * @param token token del usuario.
     * @param fechaNacimiento Fecha de nacimiento del usuario.
     */
    public Usuario(Long id, String usuario, String email, String contrasenia, String celular, Sexo sexo, String token, GregorianCalendar fechaNacimiento) {
        this.id = id;
        this.usuario = usuario;
        this.email = email;
        this.contrasenia = contrasenia;
        this.celular = celular;
        this.sexo = sexo;
        this.token = token;
        this.fechaNacimiento = fechaNacimiento;

    }


    /**
     * Método para obtener el nombre.
     *
     * @return Nombre que tiene el usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Método para establecer el nombre.
     *
     * @param usuario Nombre que tiene el usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Método para obtener el correo.
     *
     * @return Correo que tiene el usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método para establecer el correo.
     *
     * @param email Correo que tiene el usuario.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método para obtner el celular.
     *
     * @return Celular que tiene el usuario.
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Método para establecer el celular.
     *
     * @param celular Celular que tiene el usuario.
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Método para obtener el sexo.
     *
     * @return Sexo que tiene el usuario.
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Método para establecer el sexo.
     *
     * @param sexo Sexo que tiene el usuario.
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * Método para obtener la contraseña.
     *
     * @return Contraseña que tiene el usuario.
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Método para establecer la contraseña.
     *
     * @param contrasenia Contraseña que tiene el usuario.
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Método para obtener el token.
     *
     * @return Identificador externo para el usuario.
     */
    public String getAtoken() {
        return token;
    }

    /**
     * Método para establecer el token.
     *
     * @param token Identificador externo para el usuario.
     */
    public void setAtoken(String token) {
        this.token = token;
    }

    /**
     * Método para obtener la fecha de nacimiento.
     *
     * @return Fecha de nacimiento del usuario.
     */
    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Método para establecer la fecha de nacimiento.
     *
     * @param fechaNacimiento Fecha de nacimiento del usuario.
     */
    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Método para obtener el id.
     *
     * @return Identidicador único para el usuario.
     */
    public Long getId() {
        return id;
    }

    /**
     * Método para establecer el id.
     *
     * @param id Identidicador único para el usuario.
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
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
        return id + ", " + usuario + ", " + email + ", " + contrasenia + ", c" + celular + ", " + sexo + ", " + fechaNacimiento;
    }

}

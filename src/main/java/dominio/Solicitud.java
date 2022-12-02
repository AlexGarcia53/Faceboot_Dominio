/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 * Clase que representa una solicitud, donde se almacena la operación a
 * realizar, los datos y la respuesta.
 *
 * @author Equipo broker
 */
public class Solicitud {

    /**
     * Operación a realizar.
     */
    private Operacion operacion;
    /**
     * Datos de la solicitud.
     */
    private String solicitud;
    /**
     * Respuesta de la solicitud.
     */
    private String respuesta;

    /**
     * Constructor vacío.
     */
    public Solicitud() {
    }

    /**
     * Constructor que inicializa el atributo de operación.
     *
     * @param operacion Operación a realizar.
     */
    public Solicitud(Operacion operacion) {
        this.operacion = operacion;
    }

    /**
     * Constructor que inicializa los atributos de operación y solicitud.
     *
     * @param operacion Operación a realizar.
     * @param solicitud Datos de la solicitud.
     */
    public Solicitud(Operacion operacion, String solicitud) {
        this.operacion = operacion;
        this.solicitud = solicitud;
    }

    /**
     * Constructor que inicializa los atributos de operación, solicitud y
     * respuesta.
     *
     * @param operacion Operación a realizar.
     * @param solicitud Datos de la solicitud.
     * @param respuesta Respuesta de la solicitud.
     */
    public Solicitud(Operacion operacion, String solicitud, String respuesta) {
        this.operacion = operacion;
        this.solicitud = solicitud;
        this.respuesta = respuesta;
    }

    /**
     * Constructor que inicializa el atributo de respuesta.
     *
     * @param respuesta Respuesta de la solicitud.
     */
    public Solicitud(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * Método para obtener la operación.
     *
     * @return Operación a realizar.
     */
    public Operacion getOperacion() {
        return operacion;
    }

    /**
     * Método para establecer la operación.
     *
     * @param operacion Operación a realizar.
     */
    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    /**
     * Método para obtener la solicitud.
     *
     * @return Datos de la solicitud.
     */
    public String getSolicitud() {
        return solicitud;
    }

    /**
     * Método para establecer la solicitud.
     *
     * @param solicitud Datos de la solicitud.
     */
    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }

    /**
     * Método para obtener la respuesta.
     *
     * @return Respuesta de la solicitud.
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Método para establecer la respuesta.
     *
     * @param respuesta Respuesta de la solicitud.
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * Método para obtener los atributos.
     *
     * @return Cadena de texto con los atributos de la entidad.
     */
    @Override
    public String toString() {
        return operacion + "," + solicitud + "," + respuesta;
    }
}

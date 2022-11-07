/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Admin
 */
public class Solicitud {
    private Operacion operacion;
    private String solicitud;
    private String respuesta;

    public Solicitud() {
    }
    
    public Solicitud(Operacion operacion, String solicitud){
        this.operacion= operacion;
        this.solicitud= solicitud;
    }
    
    public Solicitud(Operacion operacion, String solicitud, String respuesta){
        this.operacion= operacion;
        this.solicitud= solicitud;
        this.respuesta= respuesta;
    }
    
    public Solicitud(String respuesta){
        this.respuesta= respuesta;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return operacion + "," + solicitud + "," + respuesta;
    }
}

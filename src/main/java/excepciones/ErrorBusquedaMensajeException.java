/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Clase utilizada para lanzar excepciones de tipo error busqueda mensaje, que
 * extiende de RuntimeException.
 *
 * @author Equipo broker
 */
public class ErrorBusquedaMensajeException extends RuntimeException {
    /**
     * Método utilizado para arrojar excepciones sin mensajes.
     */
    public ErrorBusquedaMensajeException() {
        super();
    }
    /**
     * Método utilizado para arrojar excepciones un mensaje definido.
     *
     * @param string Mensaje a mostrar.
     */
    public ErrorBusquedaMensajeException(String message) {
        super(message);
    }
    
}

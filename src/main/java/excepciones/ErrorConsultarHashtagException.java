/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Clase utilizada para lanzar excepciones de tipo consultar hashtag, que extiende
 * de RuntimeException.
 *
 * @author Equipo broker
 */
public class ErrorConsultarHashtagException extends RuntimeException{
    /**
     * Método utilizado para arrojar excepciones sin mensajes.
     */
    public ErrorConsultarHashtagException() {
        super();
    }
    /**
     * Método utilizado para arrojar excepciones un mensaje definido.
     *
     * @param string Mensaje a mostrar.
     */
    public ErrorConsultarHashtagException(String message) {
        super(message);
    }
    
}

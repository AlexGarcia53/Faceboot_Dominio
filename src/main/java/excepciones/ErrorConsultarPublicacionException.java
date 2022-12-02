/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Clase utilizada para lanzar excepciones de tipo consultar publicación, que extiende
 * de RuntimeException.
 *
 * @author Equipo broker
 */
public class ErrorConsultarPublicacionException extends RuntimeException{
    /**
     * Método utilizado para arrojar excepciones sin mensajes.
     */
    public ErrorConsultarPublicacionException() {
        super();
    }
    /**
     * Método utilizado para arrojar excepciones un mensaje definido.
     *
     * @param string Mensaje a mostrar.
     */
    public ErrorConsultarPublicacionException(String message) {
        super(message);
    }
    
}

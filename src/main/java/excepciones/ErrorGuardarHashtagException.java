/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Clase utilizada para lanzar excepciones de tipo error guardar hashtag, que
 * extiende de RuntimeException.
 *
 * @author Equipo broker
 */
public class ErrorGuardarHashtagException extends RuntimeException{
    /**
     * Método utilizado para arrojar excepciones sin mensajes.
     */
    public ErrorGuardarHashtagException() {
    }
    /**
     * Método utilizado para arrojar excepciones un mensaje definido.
     *
     * @param string Mensaje a mostrar.
     */
    public ErrorGuardarHashtagException(String message) {
        super(message);
    }
    
}

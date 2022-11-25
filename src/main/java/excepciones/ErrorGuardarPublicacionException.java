/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Clase utilizada para lanzar excepciones de tipo error guardar publicación,
 * que extiende de RuntimeException.
 *
 * @author Sotelo Juan, García Alex, Tellez Jarol
 */
public class ErrorGuardarPublicacionException extends RuntimeException {

    /**
     * Método utilizado para arrojar excepciones sin mensajes.
     */
    public ErrorGuardarPublicacionException() {
        super();
    }

    /**
     * Método utilizado para arrojar excepciones un mensaje definido.
     *
     * @param string Mensaje a mostrar.
     */
    public ErrorGuardarPublicacionException(String string) {
        super(string);
    }
}

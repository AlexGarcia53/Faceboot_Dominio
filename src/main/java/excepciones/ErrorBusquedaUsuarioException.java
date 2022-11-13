/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Admin
 */
public class ErrorBusquedaUsuarioException extends RuntimeException{

    public ErrorBusquedaUsuarioException() {
        super();
    }
    
    public ErrorBusquedaUsuarioException(String string){
        super(string);
    }
}

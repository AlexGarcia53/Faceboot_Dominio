/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Admin
 */
public class ErrorGuardarUsuarioException extends RuntimeException {
    public ErrorGuardarUsuarioException(){
        super();
    }
    
    public ErrorGuardarUsuarioException(String string){
        super(string);
    }
}

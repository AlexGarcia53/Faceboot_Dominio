/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Gael
 */
public class ErrorGuardarPublicacionException extends RuntimeException{
    public ErrorGuardarPublicacionException(){
        super();
    }
    
    public ErrorGuardarPublicacionException(String string){
        super(string);
    }
}

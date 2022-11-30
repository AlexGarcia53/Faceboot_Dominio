/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package dominio;

/**
 * Clase enum que contiene las operaciones que pueden ser solicitadas.
 *
 * @author Sotelo Juan, García Alex, Tellez Jarol
 */
public enum Operacion {
    registrar_usuario, iniciar_sesion, iniciar_sesion_facebook, registrar_publicacion, registrar_detector_notificaciones, suscribrir_observador_registrarPublicacion,
    desuscribrir_observador_registrarPublicacion, consultar_publicaciones, suscribir_observador_editarPublicacion, desuscribir_observador_editarPublicacion, editar_publicacion,
    eliminar_publicacion, suscribir_observador_eliminarPublicacion, desuscribir_observador_eliminarPublicacion, registrar_comentario, editar_comentario,
    suscribir_observador_registrarComentario, desuscribir_observador_registrarComentario, suscribir_observador_editarComentario, desuscribir_observador_editarComentario, 
    eliminar_comentario, suscribir_observador_eliminarComentario, desuscribir_observador_eliminarComentario, editar_perfil;
}

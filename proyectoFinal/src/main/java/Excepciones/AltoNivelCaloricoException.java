package Excepciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Ríos Díaz
 */
public class AltoNivelCaloricoException extends Exception {
    
    public AltoNivelCaloricoException() {
        super();
    }
    
    public AltoNivelCaloricoException(String error) {
        super(error);
    }
}

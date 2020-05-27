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
public class BajoNivelCaloricoException extends Exception {
    
    public BajoNivelCaloricoException() {
        super();
    }
    
    public BajoNivelCaloricoException(String error) {
        super(error);
    }
}

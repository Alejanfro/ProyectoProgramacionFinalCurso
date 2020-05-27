/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GruposAlimentos;

import Excepciones.AlimentoException;
import Excepciones.AltoNivelCaloricoException;
import Principal.AltoNivelCalorico;

/**
 *
 * @author 34650
 */
public class Grupo1Alto_LecheDerivados extends AltoNivelCalorico{
    
    public Grupo1Alto_LecheDerivados(String nombre, int energia, int grasas, int proteinas, int carbohidratos, int sal, int azucar) throws AltoNivelCaloricoException, AlimentoException {
            super(nombre, energia, grasas, proteinas, carbohidratos, sal, azucar);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GruposAlimentos;

import Excepciones.AlimentoException;
import Excepciones.BajoNivelCaloricoException;
import Principal.BajoNivelCalorico;

/**
 *
 * @author Alejandro Ríos Díaz
 */
public class Grupo1Bajo_LecheDerivados extends BajoNivelCalorico {
    private int grasaSaturadas;
    
    public Grupo1Bajo_LecheDerivados(String nombre, int energia, int grasas, int proteinas, int carbohidratos, int sal, int azucar, int grasaSaturadas) throws BajoNivelCaloricoException, AlimentoException {
        super(nombre, energia, grasas, proteinas, carbohidratos, sal, azucar);
        if(grasaSaturadas >= 0){
            this.grasaSaturadas = grasaSaturadas;
        } else {
                throw new AlimentoException("ERROR: Los valores nutricionales no pueden ser negativos");
        }
    }   

    public int getGrasaSaturadas() {
        return grasaSaturadas;
    }

    public void setGrasaSaturadas(int grasaSaturadas) {
        this.grasaSaturadas = grasaSaturadas;
    }
    //cantidadGramos * gramosElementoCalcular) / 100 
    @Override
    public int calcularGrasaSaturadas(int cantidadGramos) {
        return (cantidadGramos * grasaSaturadas) / 100;
    }
    
    public int calcularFibra(int cantidadGramos) {
        return 0;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Grasas saturadas: " + grasaSaturadas + "\n";
    }
    
    
    
    
}

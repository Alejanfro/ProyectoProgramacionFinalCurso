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
public class Grupo4_VerduraHortalizas extends BajoNivelCalorico {
    private int fibra;
    
    public Grupo4_VerduraHortalizas(String nombre, int energia, int grasas, int proteinas, int carbohidratos, int sal, int azucar, int fibra) throws BajoNivelCaloricoException, AlimentoException {
        super(nombre, energia, grasas, proteinas, carbohidratos, sal, azucar);
        if (fibra >= 0) {
            this.fibra = fibra;
        } else {
            throw new AlimentoException("ERROR: Los valores nutricionales no puedes ser negativos");
        }
    }

    public int getFibra() {
        return fibra;
    }

    public void setFibra(int fibra) {
        this.fibra = fibra;
    }
    
    @Override
    public int calcularGrasaSaturadas(int cantidadGramos) {
        return 0;
    }
    
    @Override
    public int calcularFibra(int cantidadGramos){
        return (cantidadGramos * fibra) / 100;
    }

    @Override
    public String toString() {
        return super.toString() + "Fibra: " + fibra + "\n";
    }
    
    
    
}

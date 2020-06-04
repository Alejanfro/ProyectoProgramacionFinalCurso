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
 * @author Alejandro Ríos Díaz
 */
public class Grupo6_CerealesDeriAzucarDeri extends AltoNivelCalorico {
    private int fibra;//Variable interna referente a la fibra que contiene el alimento

     /*
    * Constructor publico con 8 parametros y 1 excepciones
    * @param nombre: nombre del alimento en cuestion
    * @param energia: kilocalorias por cada 100 gramos de alimento
    * @param grasas: gramos de grasa cada 100 gramos de alimento
    * @param proteinas: gramos de proteinas por cada 100 gramos de alimento
    * @param carbohidratos: gramos de carbohidratos por cada 100 gramos de alimento
    * @param sal: gramos de sal por cada 100 gramos de alimento
    * @param azucar: gramos de azucar por cada 100 gramos de alimento
    * @param fibra: gramos de fibra por cada 100 gramos de alimento
    * @throws Excepciones.AlimentoException en caso de que los valores nutricionales introducidos sean negativos
    */
    public Grupo6_CerealesDeriAzucarDeri(String nombre, int energia, int grasas, int proteinas, int carbohidratos, float sal, float azucar, int fibra) throws AltoNivelCaloricoException, AlimentoException {
        super(nombre, energia, grasas, proteinas, carbohidratos, sal, azucar);
        if (fibra >= 0) {
            this.fibra = fibra;
        } else {
            throw new AlimentoException("ERROR: Los valores nutricionales no pueden ser negativos");
        }
    }

    
    /*
    * Metodo getter, este metodo devuelve la variable interna (private int fibra)
    * @return fibra, variable tipo int que hace referencia a la fibra por cada 100 gramos que contiene el alimento 
    */
    public int getFibra() {
        return fibra;
    }

    /*
    * Metodo setter, este metodo sirve para modificar una variable interna (private int fibra). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param fibra, variable tipo int que hace referencia a la fibra por cada 100 gramos que contiene el alimento 
    */
    public void setFibra(int fibra) {
        this.fibra = fibra;
    }

    /*
    * Metodo getter, sobreescribe un metodo de la clase abstracta AltoNivelCalorico
    * @return una variable de tipo int con la cantidad de grasas saturadas que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    @Override
    public int calcularGrasaSaturadas(int cantidadGramos) {
        return 0;
    }
    
    /*
    * Metodo getter, sobreescribe un metodo de la clase abstracta AltoNivelCalorico
    * @return una variable de tipo int con la cantidad de fibra que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    @Override
    public int calcularFibra(int cantidadGramos){
        return (cantidadGramos * fibra) / 100;
    }

     /*
     * Metodo toString,sobreescribe un metodo de la clase abstracta AltoNivelCalorico que concatena la informacion 
     * para mostrarlo por pantalla, lo hace llamando a super y añadiendo la variable interna propia
     * @return un String con la informacion referente a los valores nutricionales por 100 gramos del alimento
     */
    @Override
    public String toString() {
        return super.toString() + "Fibra: " + fibra + "\n";
    }
    
        
    
    
    
    
}

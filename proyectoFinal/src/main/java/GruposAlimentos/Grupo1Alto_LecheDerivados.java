
package GruposAlimentos;

import Excepciones.AlimentoException;
import Excepciones.AltoNivelCaloricoException;
import Principal.AltoNivelCalorico;

/**
 *
 * @author Alejandro Ríos Díaz
 */
public class Grupo1Alto_LecheDerivados extends AltoNivelCalorico{
    private int grasaSaturadas;//Variable interna referente a las grasas que contiene el alimento
    
    
     /*
    * Constructor publico con 8 parametros y 1 excepciones
    * @param nombre: nombre del alimento en cuestion
    * @param energia: kilocalorias por cada 100 gramos de alimento
    * @param grasas: gramos de grasa cada 100 gramos de alimento
    * @param proteinas: gramos de proteinas por cada 100 gramos de alimento
    * @param carbohidratos: gramos de carbohidratos por cada 100 gramos de alimento
    * @param sal: gramos de sal por cada 100 gramos de alimento
    * @param azucar: gramos de azucar por cada 100 gramos de alimento
    * @param grasaSaturadas: gramos de grasas saturadas por cada 100 gramos de alimento
    * @throws Excepciones.AlimentoException en caso de que los valores nutricionales introducidos sean negativos
    */
    public Grupo1Alto_LecheDerivados(String nombre, int energia, int grasas, int proteinas, int carbohidratos, float sal, float azucar, int grasaSaturadas) throws AltoNivelCaloricoException, AlimentoException {
        super(nombre, energia, grasas, proteinas, carbohidratos, sal, azucar);
        if(grasaSaturadas >= 0){
            this.grasaSaturadas = grasaSaturadas;
        } else {
                throw new AlimentoException("ERROR: Los valores nutricionales no pueden ser negativos");
        }
    }   

    /*
    * Metodo getter, este metodo devuelve la variable interna (private int grasaSaturadas)
    * @return grasaSaturadas, variable tipo int que hace referencia a las grasas por cada 100 gramos que contiene el alimento 
    */
    public int getGrasaSaturadas() {
        return grasaSaturadas;
    }

    /*
    * Metodo setter, este metodo sirve para modificar una variable interna (private int grasaSaturadas). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param grasaSaturadas, variable tipo int que hace referencia a las grasas por cada 100 gramos que contiene el alimento 
    */
    public void setGrasaSaturadas(int grasaSaturadas) {
        this.grasaSaturadas = grasaSaturadas;
    }


    /*
    * Metodo getter, sobreescribe un metodo de la clase abstracta AltoNivelCalorico
    * @return una variable de tipo int con la cantidad de grasas saturadas que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    @Override
    public int calcularGrasaSaturadas(int cantidadGramos) {
        return (cantidadGramos * grasaSaturadas) / 100;
    }
    
    /*
    * Metodo getter, sobreescribe un metodo de la clase abstracta AltoNivelCalorico
    * @return una variable de tipo int con la cantidad de fibra que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    @Override
    public int calcularFibra(int cantidadGramos) {
        return 0;
    }
    
    /*
     * Metodo toString,sobreescribe un metodo de la clase abstracta AltoNivelCalorico que concatena la informacion 
     * para mostrarlo por pantalla, lo hace llamando a super y añadiendo la variable interna propia
     * @return un String con la informacion referente a los valores nutricionales por 100 gramos del alimento
     */
    @Override
    public String toString() {
        return super.toString()+ "Grasas saturadas: " + grasaSaturadas + "\n";
    }  



}

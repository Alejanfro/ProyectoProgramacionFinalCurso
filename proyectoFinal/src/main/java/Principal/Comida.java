
package Principal;

/**
 * Clase interface usada para implementar metodos a las clases Desayuno, Almuerzo y Cena
 * @author Alejandro Ríos Díaz
 */
public interface Comida {
    
    /*
    * Metodo para calcular las calorias que tiene el primer alimento 
    * @param sin parametros
    */
    public int getCaloriasPrimero();
         
    /*
    * Metodo para calcular las calorias que tiene el segundo alimento 
    * @param sin parametros
    */
    public int getCaloriasSegundo();
       
    /*
    * Metodo para calcular las calorias que tiene el tercer alimento 
    * @param sin parametros
    */
    public int getCaloriasAcompanante();      
}

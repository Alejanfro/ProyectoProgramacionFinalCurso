package Principal;


/**
 * Clase interface usada para implementar metodos a las clases AltoNivelCalorico y BajoNivelCalorico
 * @author Alejandro Ríos Díaz
 */
public interface Alimento {

    /*
    * Variable final tipo int que hace referncia al limite calorico maximo 
    */
    public static final int limiteCalorico = 150;
    
    /*
    * Metodo para calcular las calorias que tiene un alimento segun la cantidad de gramos pasada por argumentos
    * @param cantidadGramos variable de tipo int con la cual se va operar
    */
    public int calcularCalorias(int cantidadGramos);
    
    /*
    * Metodo para calcular las grasas que tiene un alimento segun la cantidad de gramos pasada por argumentos
    * @param cantidadGramos variable de tipo int con la cual se va operar
    */
    public int calcularGrasas(int cantidadGramos);
    
    /*
    * Metodo para calcular las proteinas que tiene un alimento segun la cantidad de gramos pasada por argumentos
    * @param cantidadGramos variable de tipo int con la cual se va operar
    */
    public int calcularProteinas(int cantidadGramos);
    
    /*
    * Metodo para calcular las carbohidratos que tiene un alimento segun la cantidad de gramos pasada por argumentos
    * @param cantidadGramos variable de tipo int con la cual se va operar
    */
    public int caluclarCarbohidratos (int cantidadGramos);
    
    /*
    * Metodo para calcular las sal que tiene un alimento segun la cantidad de gramos pasada por argumentos
    * @param cantidadGramos variable de tipo int con la cual se va operar
    */
    public float calcularSal (int cantidadGramos);
    
    /*
    * Metodo para calcular las azucar que tiene un alimento segun la cantidad de gramos pasada por argumentos
    * @param cantidadGramos variable de tipo int con la cual se va operar
    */
    public float calcularAzucar (int cantidadGramos);
}

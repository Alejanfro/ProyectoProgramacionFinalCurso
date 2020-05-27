package Principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Ríos Díaz
 */
public interface Alimento {
    public static final int limiteCalorico = 150;
    
    public int calcularCalorias(int cantidadGramos);
    
    public int calcularGrasas(int cantidadGramos);
    
    public int calcularProteinas(int cantidadGramos);
    
    public int caluclarCarbohidratos (int cantidadGramos);
    
    public int calcularSal (int cantidadGramos);
    
    public int calcularAzucar (int cantidadGramos);
}

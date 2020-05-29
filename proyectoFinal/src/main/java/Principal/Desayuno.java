/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Excepciones.ComidaException;

/**
 *
 * @author 34650
 */
public class Desayuno implements Comida{

    private AltoNivelCalorico primero;
    private int gramosPrimero;
    private AltoNivelCalorico segundo;
    private int gramosSegundo;
    private BajoNivelCalorico acompanante;
    private int gramosAcompanante;
    private int kcalTotales;

    public Desayuno(AltoNivelCalorico primero, int gramosPrimero, AltoNivelCalorico segundo, int gramosSegundo, BajoNivelCalorico acompanante, int gramosAcompanante) throws ComidaException {
        if (primero != null && segundo != null && acompanante != null) {
            if (gramosPrimero >= 0 && gramosSegundo >= 0 && gramosAcompanante >= 0) {
                int kcalPrimero = primero.calcularCalorias(gramosPrimero);
                int kcalSegundo = segundo.calcularCalorias(gramosSegundo);
                int kcalAcompante = acompanante.calcularCalorias(gramosAcompanante);
                int kcalTotales = kcalPrimero + kcalSegundo + kcalAcompante;
                    this.primero = primero;
                    this.gramosPrimero = gramosPrimero;
                    this.segundo = segundo;
                    this.gramosSegundo = gramosSegundo;
                    this.acompanante = acompanante;
                    this.gramosAcompanante = gramosAcompanante;
                    this.kcalTotales = kcalTotales;
            } else {
                throw new ComidaException("ERROR: Valores negativos en argumentos");
            }
        } else {
            throw new ComidaException("ERROR: No puede dejar ninguna comida vacía");
        }
    }

    public AltoNivelCalorico getPrimero() {
        return primero;
    }

    public void setPrimero(AltoNivelCalorico primero) {
        this.primero = primero;
    }

    public int getGramosPrimero() {
        return gramosPrimero;
    }

    public void setGramosPrimero(int gramosPrimero) {
        this.gramosPrimero = gramosPrimero;
    }

    public AltoNivelCalorico getSegundo() {
        return segundo;
    }

    public void setSegundo(AltoNivelCalorico segundo) {
        this.segundo = segundo;
    }

    public int getGramosSegundo() {
        return gramosSegundo;
    }

    public void setGramosSegundo(int gramosSegundo) {
        this.gramosSegundo = gramosSegundo;
    }

    public BajoNivelCalorico getAcompanante() {
        return acompanante;
    }

    public void setAcompanante(BajoNivelCalorico acompanante) {
        this.acompanante = acompanante;
    }

    public int getGramosAcompanante() {
        return gramosAcompanante;
    }

    public void setGramosAcompanante(int gramosAcompanante) {
        this.gramosAcompanante = gramosAcompanante;
    }

    public int getKcalTotales() {
        return kcalTotales;
    }

    public void setKcalTotales(int kcalTotales) {
        this.kcalTotales = kcalTotales;
    }
    
    @Override
    public int getCaloriasPrimero(){
       return primero.calcularCalorias(gramosPrimero);
    }
    
    @Override
    public int getCaloriasSegundo(){
       return segundo.calcularCalorias(gramosSegundo);
    }
    
    @Override
    public int getCaloriasAcompanante(){
       return acompanante.calcularCalorias(gramosAcompanante);
    }

    @Override
    public String toString() {
        return "\n"      
             + "DESAYUNO\n"
             + "--------\n" + "\n"
             + "--Primero-- " + primero.getNombre() + "\n"         
             + "-Por racion- " + gramosPrimero + " gramos" + "\n"  
             + "Kcal Primero: " + primero.calcularCalorias(gramosPrimero) + "\n"
             + "Grasa Primero: "  + primero.calcularGrasas(gramosPrimero) + "\n"
             + "Proteinas Primero: " + primero.calcularProteinas(gramosPrimero) + "\n"
             + "Carbohidratos Primero: " + primero.caluclarCarbohidratos(gramosPrimero) + "\n"
             + "Sal Primero: " + primero.calcularSal(gramosPrimero) + "\n"
             + "Azucar Primero: " + primero.calcularSal(gramosPrimero) + "\n"
             + "Grasas saturadas Primero: " + primero.calcularGrasaSaturadas(gramosPrimero)+ "\n" 
             + "Fibra Primero: " + primero.calcularFibra(gramosPrimero)+ "\n" 
                
             + "\n" 
             + "--Segundo-- " + segundo.getNombre() + "\n"         
             + "-Por racion- " + gramosSegundo + " gramos" + "\n"  
             + "Kcal Segundo: " + segundo.calcularCalorias(gramosSegundo) + "\n"
             + "Grasa Segundo: "  + segundo.calcularGrasas(gramosSegundo) + "\n"
             + "Proteinas Segundo: " + segundo.calcularProteinas(gramosSegundo) + "\n"
             + "Carbohidratos Segundo: " + segundo.caluclarCarbohidratos(gramosSegundo) + "\n"
             + "Sal Segundo: " + segundo.calcularSal(gramosSegundo) + "\n"
             + "Azucar Segundo: " + segundo.calcularSal(gramosSegundo) + "\n"
             + "Grasas saturadas Segundo: " + segundo.calcularGrasaSaturadas(gramosSegundo)+ "\n" 
             + "Fibra Segundo: " + segundo.calcularFibra(gramosSegundo)+ "\n" 
                
             + "\n" 
             + "--Acompañante-- " + acompanante.getNombre() + "\n"         
             + "-Por racion- " + gramosAcompanante + " gramos" + "\n"  
             + "Kcal Acompañante: " + acompanante.calcularCalorias(gramosAcompanante) + "\n"
             + "Grasa Acompañante: "  + acompanante.calcularGrasas(gramosAcompanante) + "\n"
             + "Proteinas Acompañante: " + acompanante.calcularProteinas(gramosAcompanante) + "\n"
             + "Carbohidratos Acompañante: " + acompanante.caluclarCarbohidratos(gramosAcompanante) + "\n"
             + "Sal Acompañante: " + acompanante.calcularSal(gramosAcompanante) + "\n"
             + "Azucar Acompañante: " + acompanante.calcularSal(gramosAcompanante) + "\n"
             + "Grasas saturadas Acompañante: " + acompanante.calcularGrasaSaturadas(gramosAcompanante)+ "\n" 
             + "Fibra Acompañante: " + acompanante.calcularFibra(gramosAcompanante)+ "\n"  
                
             + "\n"
             + "kcalTotales = " + kcalTotales + "\n";
    }
    
    
}

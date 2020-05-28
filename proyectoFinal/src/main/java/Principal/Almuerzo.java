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
public class Almuerzo implements Comida{
    private AltoNivelCalorico primero;
    private int gramosPrimero;
    private BajoNivelCalorico segundo;
    private int gramosSegundo;
    private BajoNivelCalorico acompanante;
    private int gramosAcompanante;
    private int kcalTotales;

    public Almuerzo(AltoNivelCalorico primero, int gramosPrimero, BajoNivelCalorico segundo, int gramosSegundo, BajoNivelCalorico acompanante, int gramosAcompanante, int limiteKcal) throws ComidaException {
        if (primero != null && segundo != null && acompanante != null) {
            if (gramosPrimero >= 0 && gramosSegundo >= 0 && gramosAcompanante >= 0 && limiteKcal > 0) {
                int kcalPrimero = primero.calcularCalorias(gramosPrimero);
                int kcalSegundo = segundo.calcularCalorias(gramosSegundo);
                int kcalAcompante = acompanante.calcularCalorias(gramosAcompanante);
                int kcalTotales = kcalPrimero + kcalSegundo + kcalAcompante;
                if (limiteKcal >= kcalTotales) {
                    this.primero = primero;
                    this.gramosPrimero = gramosPrimero;
                    this.segundo = segundo;
                    this.gramosSegundo = gramosSegundo;
                    this.acompanante = acompanante;
                    this.gramosAcompanante = gramosAcompanante;
                    this.kcalTotales = kcalTotales;
                } else {
                    throw new ComidaException("ERROR: Las calorias del desayuno superan el límite establecido");
                }
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

    public BajoNivelCalorico getSegundo() {
        return segundo;
    }

    public void setSegundo(BajoNivelCalorico segundo) {
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
}

package Principal;

import Excepciones.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alejandro Ríos Díaz
 */
public abstract class AltoNivelCalorico implements Alimento {

    /*se consifera alimentos de alto nivel caloriro, cuando tiene más de 150kcal * 100gramos*/
    //private static final int limiteCalorico = 150;
    private String nombre;
    private int energia;
    private int grasas;
    private int proteinas;
    private int carbohidratos;
    private float sal;
    private float azucar;

    /**
     * @param nombre: nombre del alimento en cuestion
     * @param energia: kilocalorias por cada 100 gramos de alimento
     * @param grasas: gramos de grasa cada 100 gramos de alimento
     * @param proteinas: gramos de proteinas por cada 100 gramos de alimento
     * @param carbohidratos: gramos de carbohidratos por cada 100 gramos de
     * alimento
     * @param sal: gramos de sal por cada 100 gramos de alimento
     * @param azucar: gramos de azucar por cada 100 gramos de alimento
     * @throws Excepciones.AlimentoException
     * @throws Excepciones.AltoNivelCaloricoException en caso de que el alimento no tenga
     * más de 150kcal por 100 gramos
     */
    public AltoNivelCalorico(String nombre, int energia, int grasas, int proteinas, int carbohidratos, int sal, int azucar) throws AltoNivelCaloricoException, AlimentoException {
        if (nombre != null && nombre.length() > 0) {
            if (energia >= 0 && grasas >= 0 && proteinas >= 0 && carbohidratos >= 0 && sal >= 0 && azucar >= 0) {
                if (energia > limiteCalorico) {
                    this.nombre = nombre;
                    this.energia = energia;
                    this.grasas = grasas;
                    this.proteinas = proteinas;
                    this.carbohidratos = carbohidratos;
                    this.sal = sal;
                    this.azucar = azucar;
                } else {
                    throw new AltoNivelCaloricoException("La energía del alimento (" + energia + "kcal) no es "
                            + "suficiente para ser considerada de alto calórico (" + limiteCalorico + "kcal)");
                }
            } else {
                throw new AlimentoException("ERROR: Los valores nutricionales no pueden ser negativos");
            }
        } else {
            throw new AlimentoException("ERROR: El nombre debe tener al menos una letra");
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrasas() {
        return grasas;
    }

    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public int getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(int carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public float getAzucar() {
        return azucar;
    }

    public void setAzucar(float azucar) {
        this.azucar = azucar;
    }
    
    @Override
    public int calcularCalorias(int cantidadGramos) {
        return (cantidadGramos * getEnergia()) / 100;
    }
    
    @Override
    public int calcularGrasas(int cantidadGramos) {
        return (cantidadGramos * getGrasas()) / 100;
    }

    @Override
    public int calcularProteinas(int cantidadGramos) {
        return (cantidadGramos * getProteinas()) / 100;
    }

    @Override
    public int caluclarCarbohidratos(int cantidadGramos) {
        return (cantidadGramos * getCarbohidratos()) / 100;
    }


    
    @Override
    public float calcularSal(int cantidadGramos) {      
        return ((float)cantidadGramos * getSal() / 100);    
    }

    
    @Override
    public float calcularAzucar(int cantidadGramos) {
        return ((float)cantidadGramos * getAzucar()) / 100;
    }
    
    public abstract int calcularGrasaSaturadas(int cantidadGramos);
    
    public abstract int calcularFibra(int cantidadGramos);
    
    @Override
    public String toString() {
        return  "ALIMENTO DE ALTO NIVEL CALORICO\n"
                +"Valores nutricionales de: " + nombre + " por cada 100 gramos\n"  
                + "Energia: " + energia + "\n"
                + "Grasas: " + grasas + "\n"
                + "Proteinas: " + proteinas + "\n"
                + "Carbohidratos: " + carbohidratos + "\n"
                + "Sal: " + sal + "\n"
                + "Azucar: " + azucar + "\n";       
    }
}



















package Principal;

import Excepciones.ComidaException;

/**
 *
 * @author Alejandro Ríos Díaz
 */
public class Almuerzo implements Comida {

    /*
    * @variable interna de clase primero tipo AltoNivelCalorico: primer alimento del almuerzo
    * @variable interna de clase gramosPrimero tipo int: gramos del primer alimento del almuerzo
    * @variable interna de clase segundo tipo BajoNivelCalorico: segundo alimento del almuerzo
    * @variable interna de clase gramosSegundo tipo int: gramos del segundo alimento del almuerzo
    * @variable interna de clase acompanante tipo int: tercer alimento del almuerzo
    * @variable interna de clase gramosAcompanante tipo BajoNivelCalorico: gramos del tercer alimento del almuerzo
    * @variable interna de clase kcalTotales tipo int: kcalorias totales del almuerzo
     */
    private AltoNivelCalorico primero;
    private int gramosPrimero;
    private BajoNivelCalorico segundo;
    private int gramosSegundo;
    private BajoNivelCalorico acompanante;
    private int gramosAcompanante;
    private int kcalTotales;

    /*
    * Constructor publico con 7 parametros y 2 excepciones
    * @variable interna de clase primero tipo AltoNivelCalorico: primer alimento del almuerzo
    * @variable interna de clase gramosPrimero tipo int: gramos del primer alimento del almuerzo
    * @variable interna de clase segundo tipo AltoNivelCalorico: segundo alimento del almuerzo
    * @variable interna de clase gramosSegundo tipo int: gramos del segundo alimento del almuerzo
    * @variable interna de clase acompanante tipo int: tercer alimento del almuerzo
    * @variable interna de clase gramosAcompanante tipo BajoNivelCalorico: gramos del tercer alimento del almuerzo
    * @variable interna de clase kcalTotales tipo int: kcalorias totales del almuerzo
    * @throws Excepciones.ComidaException en caso de que los valores sean negativos en argumentos
    * @throws Excepciones.ComidaException en caso de dejar alguna comida vacía
     */
    public Almuerzo(AltoNivelCalorico primero, int gramosPrimero, BajoNivelCalorico segundo, int gramosSegundo, BajoNivelCalorico acompanante, int gramosAcompanante) throws ComidaException {
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
                throw new ComidaException("ERROR: Las calorias del desayuno superan el límite establecido");
            }
        } else {
            throw new ComidaException("ERROR: Valores negativos en argumentos");
        }
    }

    /*
    * Metodo getter, este metodo devuelve la variable interna (private AltoNivelCalorico primero)
    * @return primero, que hace referencia al primer alimento del almuerzo
     */
    public AltoNivelCalorico getPrimero() {
        return primero;
    }

    /*
    * Metodo setter, este metodo sirve para modificar una variable interna (private AltoNivelCalorico primero). 
    * Recibe por argumentos una variable de tipo AltoNivelCalorico que (mediante this.) se carga en la variable interna de clase 
    * @param primero, variable tipo AltoNivelCalorico que hace referencia al primer alimento del almuerzo
     */
    public void setPrimero(AltoNivelCalorico primero) {
        this.primero = primero;
    }

    /*
    * Metodo getter, este metodo devuelve la variable interna (private int gramosPrimero)
    * @return gramosPrimero, variable tipo int que a los gramos del primer alimento del almuerzo
     */
    public int getGramosPrimero() {
        return gramosPrimero;
    }

    /*
    * Metodo setter, este metodo sirve para modificar una variable interna (private int gramosPrimero). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param gramosPrimero, variable tipo int que hace referencia  a los gramos del primer alimento del almuerzo
     */
    public void setGramosPrimero(int gramosPrimero) {
        this.gramosPrimero = gramosPrimero;
    }

    /*
    * Metodo getter, este metodo devuelve la variable interna (private BajoNivelCalorico segundo)
    * @return segundo, que hace referencia al segundo alimento del almuerzo
     */
    public BajoNivelCalorico getSegundo() {
        return segundo;
    }

    /*
    * Metodo setter, este metodo sirve para modificar una variable interna (private BajoNivelCalorico segundo). 
    * Recibe por argumentos una variable de tipo BajoNivelCalorico que (mediante this.) se carga en la variable interna de clase 
    * @param segundo, variable tipo BajoNivelCalorico que hace referencia al segundo alimento del almuerzo
     */
    public void setSegundo(BajoNivelCalorico segundo) {
        this.segundo = segundo;
    }

    /*
    * Metodo getter, este metodo devuelve la variable interna (private BajoNivelCalorico segundo)
    * @return segundo, que hace referencia al segundo alimento del almuerzo
     */
    public int getGramosSegundo() {
        return gramosSegundo;
    }

    /*
    * Metodo setter, este metodo sirve para modificar una variable interna (private int gramosSegundo). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param gramosSegundo, variable tipo int que hace referencia  a los gramos del segundo alimento del almuerzo
     */
    public void setGramosSegundo(int gramosSegundo) {
        this.gramosSegundo = gramosSegundo;
    }

    /*
    * Metodo getter, este metodo devuelve la variable interna (private BajoNivelCalorico acompanante)
    * @return acompanante, que hace referencia al tercer alimento del almuerzo
     */
    public BajoNivelCalorico getAcompanante() {
        return acompanante;
    }

    /*
    * Metodo setter, este metodo sirve para modificar una variable interna (private BajoNivelCalorico acompanante). 
    * Recibe por argumentos una variable de tipo BajoNivelCalorico que (mediante this.) se carga en la variable interna de clase 
    * @param acompanante, variable tipo AltoNivelCalorico que hace referencia al tercer alimento del almuerzo
     */
    public void setAcompanante(BajoNivelCalorico acompanante) {
        this.acompanante = acompanante;
    }

    /*
    * Metodo getter, este metodo devuelve la variable interna (private BajoNivelCalorico acompanante)
    * @return gramosAcompanante, que hace referencia al tercer alimento del almuerzo
     */
    public int getGramosAcompanante() {
        return gramosAcompanante;
    }

    /*
    * Metodo setter, este metodo sirve para modificar una variable interna (private int setGramosAcompanante). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param gramosAcompanante, variable tipo int que hace referencia  a los gramos del tercer alimento del almuerzo
     */
    public void setGramosAcompanante(int gramosAcompanante) {
        this.gramosAcompanante = gramosAcompanante;
    }

    /*
    * Metodo getter, este metodo devuelve la variable interna (private int KcalTotales)
    * @return kcalTotales, que hace referencia a las kcal totales del almuerzo
     */
    public int getKcalTotales() {
        return kcalTotales;
    }

    /*
    * Metodo setter, este metodo sirve para modificar una variable interna (private int kcalTotales). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param kcalTotales, variable tipo int que hace referencia a las kcal totales del almuerzo
     */
    public void setKcalTotales(int kcalTotales) {
        this.kcalTotales = kcalTotales;
    }

    /*
    * Metodo getter, sobreescribe un metodo de la interface Comida,
    * @return una variable de tipo int con la cantidad de calorias que tiene el alimento
    * segun los gramos pasados por argumentos
     */
    @Override
    public int getCaloriasPrimero() {
        return primero.calcularCalorias(gramosPrimero);
    }

    /*
    * Metodo getter, sobreescribe un metodo de la interface Comida,
    * @return una variable de tipo int con la cantidad de calorias que tiene el alimento
    * segun los gramos pasados por argumentos
     */
    @Override
    public int getCaloriasSegundo() {
        return segundo.calcularCalorias(gramosSegundo);
    }

    /*
    * Metodo getter, sobreescribe un metodo de la interface Comida,
    * @return una variable de tipo int con la cantidad de calorias que tiene el alimento
    * segun los gramos pasados por argumentos
     */
    @Override
    public int getCaloriasAcompanante() {
        return acompanante.calcularCalorias(gramosAcompanante);
    }

     /*
     * Metodo toString,sobreescribe un metodo que concatena la informacion para mostrarlo por pantalla, 
     * @return un String con la informacion referente a los valores nutricionales de los alimentos
     * seleccionados por la cantidad de gramos indicada
     */
    @Override
    public String toString() {
        return "\n"
                + "ALMUERZO\n"
                + "--------\n" + "\n"
                + "--Primero-- " + primero.getNombre() + "\n"
                + "-Por racion- " + gramosPrimero + " gramos" + "\n"
                + "Kcal Primero: " + primero.calcularCalorias(gramosPrimero) + "\n"
                + "Grasa Primero: " + primero.calcularGrasas(gramosPrimero) + "\n"
                + "Proteinas Primero: " + primero.calcularProteinas(gramosPrimero) + "\n"
                + "Carbohidratos Primero: " + primero.caluclarCarbohidratos(gramosPrimero) + "\n"
                + "Sal Primero: " + primero.calcularSal(gramosPrimero) + "\n"
                + "Azucar Primero: " + primero.calcularSal(gramosPrimero) + "\n"
                + "Grasas saturadas Primero: " + primero.calcularGrasaSaturadas(gramosPrimero) + "\n"
                + "Fibra Primero: " + primero.calcularFibra(gramosPrimero) + "\n"
                + "\n"
                + "--Segundo-- " + segundo.getNombre() + "\n"
                + "-Por racion- " + gramosSegundo + " gramos" + "\n"
                + "Kcal Segundo: " + segundo.calcularCalorias(gramosSegundo) + "\n"
                + "Grasa Segundo: " + segundo.calcularGrasas(gramosSegundo) + "\n"
                + "Proteinas Segundo: " + segundo.calcularProteinas(gramosSegundo) + "\n"
                + "Carbohidratos Segundo: " + segundo.caluclarCarbohidratos(gramosSegundo) + "\n"
                + "Sal Segundo: " + segundo.calcularSal(gramosSegundo) + "\n"
                + "Azucar Segundo: " + segundo.calcularSal(gramosSegundo) + "\n"
                + "Grasas saturadas Segundo: " + segundo.calcularGrasaSaturadas(gramosSegundo) + "\n"
                + "Fibra Segundo: " + segundo.calcularFibra(gramosSegundo) + "\n"
                + "\n"
                + "--Acompañante-- " + acompanante.getNombre() + "\n"
                + "-Por racion- " + gramosAcompanante + " gramos" + "\n"
                + "Kcal Acompañante: " + acompanante.calcularCalorias(gramosAcompanante) + "\n"
                + "Grasa Acompañante: " + acompanante.calcularGrasas(gramosAcompanante) + "\n"
                + "Proteinas Acompañante: " + acompanante.calcularProteinas(gramosAcompanante) + "\n"
                + "Carbohidratos Acompañante: " + acompanante.caluclarCarbohidratos(gramosAcompanante) + "\n"
                + "Sal Acompañante: " + acompanante.calcularSal(gramosAcompanante) + "\n"
                + "Azucar Acompañante: " + acompanante.calcularSal(gramosAcompanante) + "\n"
                + "Grasas saturadas Acompañante: " + acompanante.calcularGrasaSaturadas(gramosAcompanante) + "\n"
                + "Fibra Acompañante: " + acompanante.calcularFibra(gramosAcompanante) + "\n"
                + "\n"
                + "kcalTotales = " + kcalTotales + "\n";
    }
}

package Principal;

/**
 *
 * @author Alejandro Ríos Díaz
 */
public class Dia {
    /*
    * @variable interna de clase desayuno tipo final Desayuno, contiene los tipos de alimentos y la cantidad que componen el desayuno
    * @variable interna de clase almuerzo tipo final Almuerzo, contiene los tipos de alimentos y la cantidad que componen el almuerzo 
    * @variable interna de clase cena tipo final Cena, contiene los tipos de alimentos y la cantidad que componen la cena 
    * @variable interna de clase kcalTotales final int: kcalorias totales del dia
     */
    private final Desayuno desayuno;
    private final Almuerzo almuerzo;
    private final Cena cena;
    private final int KcalTotales;

        /*
    * Constructor publico con 3 parametros 
    * @variable interna de clase desayuno tipo final Desayuno, contiene los tipos de alimentos y la cantidad que componen el desayuno
    * @variable interna de clase almuerzo tipo final Almuerzo, contiene los tipos de alimentos y la cantidad que componen el almuerzo 
    * @variable interna de clase cena tipo final Cena, contiene los tipos de alimentos y la cantidad que componen la cena 
    * @variable interna de clase kcalTotales final int: kcalorias totales del dia
     */
    public Dia(Desayuno desayuno, Almuerzo almuerzo, Cena cena) {
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.cena = cena;
        this.KcalTotales = desayuno.getKcalTotales() + almuerzo.getKcalTotales() + cena.getKcalTotales();
    }

    /*
    * Metodo getter, este metodo devuelve la variable interna (private int KcalTotales)
    * @return kcalTotales, que hace referencia a las kcal totales del dia
    */
    public int getKcalTotales() {
        return KcalTotales;
    }

    /*
    * Metodo getter, este metodo devuelve la variable interna (private int Desayuno)
    * @return Desayuno, que hace referencia a los valores nutricionales y las cantidades
    * de los alimentos que componen el desayuno
    */
    public Desayuno getDesayuno() {
        return desayuno;
    }

    /*
    * Metodo getter, este metodo devuelve la variable interna (private int Almuerzo)
    * @return Almuerzo, que hace referencia a los valores nutricionales y las cantidades
    * de los alimentos que componen el Almuerzo
    */
    public Almuerzo getAlmuerzo() {
        return almuerzo;
    }

    /*
    * Metodo getter, este metodo devuelve la variable interna (private int Cena)
    * @return Cena, que hace referencia a los valores nutricionales y las cantidades
    * de los alimentos que componen el Cena
    */
    public Cena getCena() {
        return cena;
    }

     /*
     * Metodo toString,sobreescribe un metodo que concatena la informacion para mostrarla por pantalla, 
     * @return un String con la informacion referente a los valores nutricionales de los alimentos
     * seleccionados por la cantidad de gramos indicada de cada una de las comidas y las kcalorias totales
     */
    @Override
    public String toString() {
        return  "COMIDAS A REALIZAR AL DÍA" 
                + "\n-------------------------\n"
                + desayuno 
                + "-------------------------\n"
                + almuerzo 
                + "-------------------------\n"
                + cena 
                + "-------------------------\n"
                + "ESTE DÍA TIENE UNA ENERGIA DE " + KcalTotales + "KCAL\n";
    }
}

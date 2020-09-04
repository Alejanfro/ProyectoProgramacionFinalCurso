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

    public int getKcalTotales() {
        return KcalTotales;
    }

    public Desayuno getDesayuno() {
        return desayuno;
    }

    public Almuerzo getAlmuerzo() {
        return almuerzo;
    }

    public Cena getCena() {
        return cena;
    }

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

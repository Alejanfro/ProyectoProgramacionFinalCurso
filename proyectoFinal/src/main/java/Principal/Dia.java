package Principal;

/**
 *
 * @author 34650
 */
public class Dia {
    //Hecho (falta comentar)
    private final Desayuno desayuno;
    private final Almuerzo almuerzo;
    private final Cena cena;
    private final int KcalTotales;

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

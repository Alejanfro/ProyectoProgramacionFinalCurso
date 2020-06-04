package Principal;

import Excepciones.*;

/*
 * Esta clase implementa la clase interface Alimento asi como los metodos que se
 * heredan de la misma, la utilidad de esta clase radica en la posibilidad de
 * distinguir los alimentos por el aporte calorico, en nuestro caso hemos puesto
 * el limite en 150 kcal por 100 gramo. Se considera alimentos de alto nivel
 * calorico, cuando tiene más de 150kcal * 100gramos
 * @author Alejandro Ríos Díaz
 */
public abstract class AltoNivelCalorico implements Alimento {
    /*
    * @variable interna de clase nombre tipo String: nombre del alimento en cuestion
    * @variable interna de clase energia tipo int: kilocalorias por cada 100 gramos de alimento
    * @variable interna de clase grasas tipo int: gramos de grasa cada 100 gramos de alimento
    * @variable interna de clase proteinas tipo int: gramos de proteinas por cada 100 gramos de alimento
    * @variable interna de clase carbohidratos tipo int: gramos de carbohidratos por cada 100 gramos de alimento
    * @variable interna de clase sal tipo float: gramos de sal por cada 100 gramos de alimento
    * @variable interna de clase azucar tipo float: gramos de azucar por cada 100 gramos de alimento
    */
    private String nombre;
    private int energia;
    private int grasas;
    private int proteinas;
    private int carbohidratos;
    private float sal;
    private float azucar;

    /*
    * Constructor publico de la clase AltoNivelCalorico con 7 parametros y 3 excepciones
    * @param nombre: nombre del alimento en cuestion
    * @param energia: kilocalorias por cada 100 gramos de alimento
    * @param grasas: gramos de grasa cada 100 gramos de alimento
    * @param proteinas: gramos de proteinas por cada 100 gramos de alimento
    * @param carbohidratos: gramos de carbohidratos por cada 100 gramos de alimento
    * @param sal: gramos de sal por cada 100 gramos de alimento
    * @param azucar: gramos de azucar por cada 100 gramos de alimento
    * @throws Excepciones.AlimentoException en caso de que los valores nutricionales introducidos sean negativos
    * @throws Excepciones.AlimentoException en caso de que el nombre no tenga al menos una letra
    * @throws Excepciones.AltoNivelCaloricoException en caso de que el alimento no tenga más de 150kcal por 100 gramos
    */
    public AltoNivelCalorico(String nombre, int energia, int grasas, int proteinas, int carbohidratos, float sal, float azucar) throws AltoNivelCaloricoException, AlimentoException {
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

    /*
    * Metodo getter de la clase AltoNivelCalorico, 
    * este metodo devuelve la variable interna (private int energia)
    * @return energia, que hace referencia al kcal por gramos del alimento 
    */
    public int getEnergia() {
        return energia;
    }

    /*
    * Metodo setter de la clase AltoNivelCalorico, 
    * este metodo sirve para modificar una variable interna (private int energia). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param energia, variable tipo int que hace referencia al kcal por gramos del alimento 
    */
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico, 
    * este metodo devuelve la variable interna (private String nombre)
    * @return nombre, variable tipo String que hace referencia al nombre del alimento 
    */
    public String getNombre() {
        return nombre;
    }
    
    /*
    * Metodo setter de la clase AltoNivelCalorico, 
    * este metodo sirve para modificar una variable interna (private String nombre). 
    * Recibe por argumentos una variable de tipo String que (mediante this.) se carga en la variable interna de clase 
    * @param nombre, variable tipo String que hace referencia al nombre del alimento 
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico, 
    * este metodo devuelve la variable interna (private int grasas)
    * @return grasas, variable tipo int que hace referencia a los gramos de grasa del alimento 
    */
    public int getGrasas() {
        return grasas;
    }

    /*
    * Metodo setter de la clase AltoNivelCalorico, 
    * este metodo sirve para modificar una variable interna (private int grasas). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param grasas, variable tipo int que hace referencia a los gramos de grasas del alimento 
    */
    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico, 
    * este metodo devuelve la variable interna (private int proteinas)
    * @return proteinas, variable tipo int que hace referencia a los gramos de proteinas del alimento 
    */
    public int getProteinas() {
        return proteinas;
    }

    /*
    * Metodo setter de la clase AltoNivelCalorico, 
    * este metodo sirve para modificar una variable interna (private int proteinas). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param proteinas, variable tipo int que hace referencia a los proteinas de grasas del alimento 
    */
    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico, 
    * este metodo devuelve la variable interna (private int carbohidratos)
    * @return carbohidratos, variable tipo int que hace referencia a los gramos de carbohidratos del alimento 
    */
    public int getCarbohidratos() {
        return carbohidratos;
    }

    /*
    * Metodo setter de la clase AltoNivelCalorico, 
    * este metodo sirve para modificar una variable interna (private int carbohidratos). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param carbohidratos, variable tipo int que hace referencia a los carbohidratos de grasas del alimento 
    */
    public void setCarbohidratos(int carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico, 
    * este metodo devuelve la variable interna (private float sal)
    * @return sal, variable tipo float que hace referencia a los gramos de sal del alimento 
    */
    public float getSal() {
        return sal;
    }

    /*
    * Metodo setter de la clase AltoNivelCalorico, 
    * este metodo sirve para modificar una variable interna (private int sal). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param sal, variable tipo float que hace referencia a los sal de grasas del alimento 
    */
    public void setSal(float sal) {
        this.sal = sal;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico, 
    * este metodo devuelve la variable interna (private float azucar)
    * @return azucar, variable tipo float que hace referencia a los gramos de azucar del alimento 
    */
    public float getAzucar() {
        return azucar;
    }


    /*
    * Metodo setter de la clase AltoNivelCalorico, 
    * este metodo sirve para modificar una variable interna (private int azucar). 
    * Recibe por argumentos una variable de tipo int que (mediante this.) se carga en la variable interna de clase 
    * @param azucar, variable tipo float que hace referencia a los azucar de grasas del alimento 
    */
    public void setAzucar(float azucar) {
        this.azucar = azucar;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico,
    * sobreescribe un metodo de la interface Alimento,
    * @return una variable de tipo int con la cantidad de calorias que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    @Override
    public int calcularCalorias(int cantidadGramos) {
        return (cantidadGramos * getEnergia()) / 100;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico,
    * sobreescribe un metodo de la interface Alimento,
    * @return una variable de tipo int con la cantidad de grasa que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    @Override
    public int calcularGrasas(int cantidadGramos) {
        return (cantidadGramos * getGrasas()) / 100;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico,
    * sobreescribe un metodo de la interface Alimento,
    * @return una variable de tipo int con la cantidad de proteinas que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    @Override
    public int calcularProteinas(int cantidadGramos) {
        return (cantidadGramos * getProteinas()) / 100;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico,
    * sobreescribe un metodo de la interface Alimento,
    * @return una variable de tipo int con la cantidad de carbohidratos que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    @Override
    public int caluclarCarbohidratos(int cantidadGramos) {
        return (cantidadGramos * getCarbohidratos()) / 100;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico,
    * sobreescribe un metodo de la interface Alimento,
    * @return una variable de tipo float con la cantidad de sal que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    @Override
    public float calcularSal(int cantidadGramos) {
        return ((float) cantidadGramos * getSal() / 100);
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico,
    * sobreescribe un metodo de la interface Alimento,
    * @return una variable de tipo float con la cantidad de azucar que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    @Override
    public float calcularAzucar(int cantidadGramos) {
        return ((float) cantidadGramos * getAzucar()) / 100;
    }

    /*
    * Metodo getter de la clase AltoNivelCalorico,
    * @return una variable de tipo int con la cantidad de grasas saturadas que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    public abstract int calcularGrasaSaturadas(int cantidadGramos);

    /*
    * Metodo getter de la clase AltoNivelCalorico,
    * @return una variable de tipo int con la cantidad de fibra que tiene el alimento
    * segun los gramos pasados por argumentos
    */
    public abstract int calcularFibra(int cantidadGramos);

    /*
     * Metodo que concatena la informacion de la clase AltoNivelCalorico para mostrarlo por pantalla
     * @return un String con la informacion referente a los valores nutricionales por 100 gramos del alimento
     */
    @Override
    public String toString() {
        return "ALIMENTO DE ALTO NIVEL CALORICO\n"
                + "Valores nutricionales de: " + nombre + " por cada 100 gramos\n"
                + "Energia: " + energia + "\n"
                + "Grasas: " + grasas + "\n"
                + "Proteinas: " + proteinas + "\n"
                + "Carbohidratos: " + carbohidratos + "\n"
                + "Sal: " + sal + "\n"
                + "Azucar: " + azucar + "\n";
    }
}

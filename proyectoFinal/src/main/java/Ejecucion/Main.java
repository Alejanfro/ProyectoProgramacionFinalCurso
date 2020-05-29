/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecucion;

import Excepciones.AlimentoException;
import Excepciones.AltoNivelCaloricoException;
import Excepciones.BajoNivelCaloricoException;
import Excepciones.ComidaException;
import GruposAlimentos.Grupo1Bajo_LecheDerivados;
import GruposAlimentos.Grupo2Alto_CarnesPescadosHuevos;
import GruposAlimentos.Grupo2Bajo_CarnesPescadosHuevos;
import GruposAlimentos.Grupo3Alto_PatatasLegumbresFrutosSecos;
import GruposAlimentos.Grupo3Bajo_PatatasLegunbresFrutosSecos;
import GruposAlimentos.Grupo4_VerduraHortalizas;
import GruposAlimentos.Grupo5Bajo_Frutas;
import GruposAlimentos.Grupo6_CerealesDeriAzucarDeri;
import Principal.Almuerzo;
import Principal.AltoNivelCalorico;
import Principal.BajoNivelCalorico;
import Principal.Cena;
import Principal.Desayuno;
import Principal.Dia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author 34650
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws Excepciones.AltoNivelCaloricoException
     * @throws Excepciones.AlimentoException
     * @throws Excepciones.BajoNivelCaloricoException
     * @throws Excepciones.ComidaException
     */
    public static void main(String[] args) throws SQLException, AltoNivelCaloricoException, AlimentoException, BajoNivelCaloricoException, ComidaException {

        String url = "jdbc:mysql://127.0.0.1:3306/COMESANO;?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String usuario = "root";
        String password = "ale";
        try {
            //Los dos primeros pasos son siempre los mismos
            //Creamos la conexion con DriverManager a la BD que queramos
            ///Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/institutos1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "usuario");
            Connection con = DriverManager.getConnection(url, usuario, password);
            //Creamos el Statement a partir de la conexion, nos permitirá lanzar adelante las sentencias sql
            Statement smt = (Statement) con.createStatement();
/*
            Scanner sc = new Scanner(System.in);
            int r = -1;

            while (r != 0) {
                System.out.println("**********");
                System.out.println("* Índice *");
                System.out.println("**********");
                System.out.println("1. Mostrar alimento.");
                System.out.println("2. Insertar un nuevo alimento.");
                System.out.println("3. Eliminar un alimento.");
                System.out.println("0. Salir.");
                System.out.println("Introduce una opción: ");
                r = sc.nextInt();

                switch (r) {
                    case 1:
                        System.out.println("Alimento:");
                        //Le pasamos como argumento el statement de la conexion para mandar instrucciones sql
                        //imprimirModulos(smt);
                        break;
                    case 2:
                        System.out.println("Insertar alimento:");
                        //Le pasamos como argumento el statement de la conexion para mandar instrucciones sql
                        //insertarModulo(smt);
                        break;
                    case 3:
                        System.out.println("Eliminar alimento:");
                        //borrarModulo(smt);
                        break;
                }
            }
*/
            System.out.println("Gracias por utilizar nuestra aplicación. Hasta la próxima.");

            smt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //Tabla Alimentos
        //Nombre | Nivel | Grupo | Energia | Grasa | Proteinas | Carbohidratos | Azucar | Sal | Fibra | Grasas Saturadas
        /*
    crearDesayuno
    switch(grupo){
    case 1:
        if(Nivel == A){
            new Grupo1Alto(Energia, Grasa, Proteinmas, Carbohidratos
        }else{
            new Grupo1Bajo
        }
    case 2:
        ......
    case 7:
        new Grupo7
         */
        //Tabla Alimentos
        //Nombre | Nivel | Grupo | Energia | Grasa | Proteinas | Fibra ... | Sal
        //Leche  |   B   |   1   |   50    |   22  |    30     |    0  ... |  0
        //Queso  |   A   |   1   |   160   |   40  | 
        try {

            //DESAYUNO
            AltoNivelCalorico pan = new Grupo6_CerealesDeriAzucarDeri("pan", 200, 10, 5, 150, 1, 1, 5);
            AltoNivelCalorico nueces = new Grupo3Alto_PatatasLegumbresFrutosSecos("nueces", 200, 5, 6, 40, 1, 1, 5);
            BajoNivelCalorico leche = new Grupo1Bajo_LecheDerivados("leche", 100, 2, 6, 30, 1, 1, 5);
            Desayuno desayuno = new Desayuno(pan, 80, nueces, 20, leche, 200);
            //System.out.println(desayuno);

            //ALMUERZO
            AltoNivelCalorico filete = new Grupo2Alto_CarnesPescadosHuevos("filete", 300, 20, 10, 1, 1, 1, 5);
            BajoNivelCalorico huevo = new Grupo2Bajo_CarnesPescadosHuevos("huevo", 100, 20, 10, 1, 1, 1, 6);
            BajoNivelCalorico habichuelas = new Grupo3Bajo_PatatasLegunbresFrutosSecos("habichuelas", 100, 20, 10, 1, 1, 1, 9);
            Almuerzo almuerzo = new Almuerzo(filete, 120, huevo, 80, habichuelas, 70);
            //System.out.println(almuerzo);

            //CENA
            BajoNivelCalorico lechuga = new Grupo4_VerduraHortalizas("lechuga", 10, 50, 10, 1, 1, 1, 8);
            BajoNivelCalorico manzana = new Grupo5Bajo_Frutas("filete", 5, 0, 1, 1, 1, 1, 4);
            BajoNivelCalorico pescado = new Grupo2Bajo_CarnesPescadosHuevos("pez espada", 30, 20, 10, 1, 1, 1, 2);
            Cena cena = new Cena(lechuga, 20, manzana, 30, pescado, 70);
            //System.out.println(cena);

            Dia dia = new Dia(desayuno, almuerzo, cena);
            System.out.println(dia);
        } catch (AltoNivelCaloricoException | AlimentoException e) {
            System.out.println(e);
        }
    }
}

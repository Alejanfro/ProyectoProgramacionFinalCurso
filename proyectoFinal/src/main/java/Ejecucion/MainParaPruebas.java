package Ejecucion;

import Principal.*;
import GruposAlimentos.*;
import Excepciones.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 34650
 */
public class MainParaPruebas {

    public static void main(String[] args) throws AltoNivelCaloricoException, AlimentoException, BajoNivelCaloricoException, ComidaException {
        //try {
            /*
            AltoNivelCalorico patatas = new Grupo7_GrasaAceitesMantequilla("Matutano", 200, 30, 1, 50, 5, 0, 15);
            System.out.println(patatas);
            int cantidadAlimentos = 150;
            int nuevaEnergia = patatas.calcularCalorias(cantidadAlimentos);
            int nuevaGrasa = patatas.calcularGrasas(cantidadAlimentos);
            System.out.println("Cantidas de alimento: " + cantidadAlimentos + "     " + " Energia: " + nuevaEnergia + "     " + " Grasas:" + nuevaGrasa );
            */
          
            //DESAYUNO
            AltoNivelCalorico cereales = new Grupo6_CerealesDeriAzucarDeri("pan", 200, 10, 5, 150, 1, 1,1);
            AltoNivelCalorico frutos_secos = new Grupo3Alto_PatatasLegumbresFrutosSecos("nueces",200,5,6,40,1,1,1);
            BajoNivelCalorico leche = new Grupo1Bajo_LecheDerivados("leche",100,2,6,30,1,1,2);
            Desayuno desayuno = new Desayuno(cereales,100, frutos_secos, 20, leche, 200);
            System.out.println(desayuno);
            
            /*
            //ALMUERZO
            AltoNivelCalorico filete = new Grupo2Alto_CarnesPescadosHuevos();
            BajoNivelCalorico huevoCocido = new Grupo2Bajo_CarnesPescadosHuevos();
            BajoNivelCalorico habichuelas = new Grupo3Bajo_PatatasLegunbresFrutosSecos;
            //CENA
            BajoNivelCalorico 
            BajoNivelCalorico
            BajoNivelCalorico
        } catch (AltoNivelCaloricoException | AlimentoException e) {
            System.out.println(e);
            
        }
        */
    }

}

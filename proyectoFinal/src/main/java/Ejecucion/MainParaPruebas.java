package Ejecucion;
import Principal.AltoNivelCalorico;
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
    public static void main(String[] args){
        try{
            AltoNivelCalorico patatas = new Grupo7_GrasaAceitesMantequilla("Matutano", 160, 30, 1, 50, 5, 0, 15);
            System.out.println(patatas);
            int cantidadAlimentos = 150;
            int nuevaEnergia = patatas.calcularCalorias(cantidadAlimentos);
            int nuevaGrasa = patatas.calcularGrasas(cantidadAlimentos);
            System.out.println("Cantidas de alimento: " + cantidadAlimentos + " Energia: "+nuevaEnergia+
                    " Grasas:" + nuevaGrasa );
        }catch(AltoNivelCaloricoException | AlimentoException e){
                System.out.println(e);
        }
    }
}


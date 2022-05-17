/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Quadrilatero { //Classe que implementa a sobrecarga dos métodos
    
    public static void area(double lado){//Método que implementa o cálculo da área do quadrado, necessário receber apenas 1 parâmetro
        System.out.println("Área do quadrado é: " + lado * lado);
    }
    
    public static void area(double lado1, double lado2){//Método que implementa o cálculo da área do retângulo, necessário receber 2 parâmetros
        System.out.println("Área do retândulo é: " + lado1 * lado2);
    }
    
    public static void area(double baseMaior, double baseMenor, double altura){//Método que implementa o cálculo da área do trapézio, necessário receber 3 parâmetros
        System.out.println("Área do trapézio é: " + (baseMaior + baseMenor) * altura / 2);
    }
}

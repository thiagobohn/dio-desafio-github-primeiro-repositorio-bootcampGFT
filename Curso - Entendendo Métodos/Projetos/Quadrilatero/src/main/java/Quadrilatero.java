/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Quadrilatero { //Classe que implementa a sobrecarga dos métodos
    
    public static double area(double lado){//Método que implementa o cálculo da área do quadrado, necessário receber apenas 1 parâmetro
        return lado * lado;//Retorno da função
    }
    
    public static double area(double lado1, double lado2){//Método que implementa o cálculo da área do retângulo, necessário receber 2 parâmetros
        return lado1 * lado2;//Retorno da função
    }
    
    public static double area(double baseMaior, double baseMenor, double altura){//Método que implementa o cálculo da área do trapézio, necessário receber 3 parâmetros
        return (baseMaior + baseMenor) * altura / 2;//Retorno da função
    }
}

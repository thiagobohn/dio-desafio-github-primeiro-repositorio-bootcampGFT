/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Calculadora {

    public static void soma (double num1, double num2){
        double resultado = num1+num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é: " + resultado);
    }
    
    public static void subtracao (double num1, double num2){
        double resultado = num1-num2;
        System.out.println("A subtração de " + num1 + " - " + num2 + " é: " + resultado);
    }
    
    public static void multiplicacao (double num1, double num2){
        double resultado = num1*num2;
        System.out.println("A multiplicação de " + num1 + " vezes " + num2 + " é: " + resultado);
    }
    
    public static void divisao (double num1, double num2){
        double resultado = num1/num2;
        System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + resultado);
    }
    
    public static void main(String[] args) {
        double num1 = 7;
        double num2 = 4;
        
        soma(num1, num2);
        subtracao(num1, num2);
        multiplicacao(num1, num2);
        divisao(num1, num2);
    }
    
}

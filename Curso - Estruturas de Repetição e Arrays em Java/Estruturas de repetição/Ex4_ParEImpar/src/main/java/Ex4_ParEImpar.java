
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Ex4_ParEImpar {

    /**
     * @param args the command line arguments
     */
    
    /*
    Faça um programa que peça N números inteiros,
    calcule e mostre a quantidade de números pares
    e a quantidade de números impares.
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //criando o objeto da classe scanner
        
        //declaração das variáveis
        int quantNumeros = 0, num, quantPar = 0, cont = 0;
        
        System.out.println("Quantos números serão analizados?");
        quantNumeros = sc.nextInt();
        
        do{
            //Bloco para solicitar a entrada de um número
            System.out.println("Numero:");
            num = sc.nextInt();
            
            //verifica e atualiza a quantidade de números pares fornecidos
            if(num%2==0){
                quantPar++;
            }
            
            cont++;//atualiza o contador da estrutura de repetição
        }while(cont < quantNumeros);
        
        System.out.println("Quantidade de números pares: " + quantPar);
        System.out.println("Quantidade de números impares: " + (quantNumeros - quantPar));
    }

}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Ex3_MaiorEMedia {

    /**
     * @param args the command line arguments
     */
    
    /*
    Faça um programa que leia 5 números
    e informe o maior número
    e a média desses números.
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //criando o objeto da classe scanner
        
        //declaração das variáveis
        int num, maiorNum = 0, cont = 0;
        float soma = 0f;
        
        do{
            //Bloco para receber o número do usuário
            System.out.println("Numero:");
            num = sc.nextInt();
            
            soma += num; // somaos números fornecidos pelo usuário
            
            //verifica e, se for o caso, atualiza o maior número fornecido
            if (num > maiorNum){
                maiorNum = num;
            }
            
            cont++;//atualiza o contador da estrutura de repetição
        }while(cont<5);
        
        System.out.println("A média dos números fornecidos é: " + soma/cont);
        System.out.println("O maior número fornecido foi: " + maiorNum);
    }

}
